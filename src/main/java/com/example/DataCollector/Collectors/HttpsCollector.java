package com.example.DataCollector.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HttpsCollector {
    URL url;
    StringBuilder response = new StringBuilder();
    public void Collect() throws IOException {
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("x-locale", "pl-PL");
        int responseCode = con.getResponseCode();
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        }
    }

    public void writeToConsole() {
        System.out.println(this.response.toString());
    }

    public HttpsCollector(URL url) {
        this.url = url;
    }
}
