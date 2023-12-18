package com.example.DataCollector;

import com.example.DataCollector.Collectors.HttpsCollector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URL;


@SpringBootApplication
public class DataCollectorApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DataCollectorApplication.class, args);
		//PROVIDERS
		URL url = new URL("https://www.filmweb.pl/api/v1/vod/providers/list");
		HttpsCollector providerCollector = new HttpsCollector(url);
		providerCollector.Collect();
		providerCollector.writeToConsole();

		//INFO (na razie Napoleon)
		URL url1 = new URL("https://www.filmweb.pl/api/v1/film/864985/info");
		HttpsCollector infoCollector = new HttpsCollector(url1);
		infoCollector.Collect();
		infoCollector.writeToConsole();

		//DESCRIPTION (na razie Napoleon)
		URL url2 = new URL("https://www.filmweb.pl/api/v1/film/864985/description");
		HttpsCollector descriptionCollector = new HttpsCollector(url2);
		descriptionCollector.Collect();
		descriptionCollector.writeToConsole();

		//Daty premiery (na razie Napoleon)
		URL url3 = new URL("https://www.filmweb.pl/api/v1/film/864985/dates");
		HttpsCollector datesCollector = new HttpsCollector(url3);
		datesCollector.Collect();
		datesCollector.writeToConsole();
	}
}



