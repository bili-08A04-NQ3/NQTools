package top.niqiu.Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class Network {
    public static String Fetch(String s) throws IOException {
        return Fetch(new URL(s));
    }

    public static String Fetch(URL url) throws IOException {
        URLConnection connection = url.openConnection();
        InputStream stream = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
        String s = reader.readLine();
        reader.close();
        return s;
    }
}
