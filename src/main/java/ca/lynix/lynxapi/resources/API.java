package ca.lynix.lynxapi.resources;
import com.google.gson.Gson;
import org.bukkit.entity.Player;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class API {
    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }

    public static String getAlert() {
        try {
            String jsonData = readUrl("https://lynix.ca/api/mc/alerts"); // Read the URL and get the data as a String.
            Gson gson = new Gson();
            Alert alert = gson.fromJson(jsonData, Alert.class);

            return alert.alert_msg;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static int getBalance(Player player) {
        try {
            String jsonData = readUrl("https://lynix.ca/api/mc/balance?clientid=" + player.getUniqueId()); // Read the URL and get the data as a String.
            Gson gson = new Gson();
            ClientData clientData = gson.fromJson(jsonData, ClientData.class);

            return clientData.balance;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    static class Alert {
        String alert_msg;
    }

    static class ClientData {

        String client_id;
        int balance;
    }
}
