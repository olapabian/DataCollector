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
//		URL url = new URL("https://www.filmweb.pl/api/v1/vod/providers/list");
//		HttpsCollector providerCollector = new HttpsCollector(url);
//		providerCollector.Collect();
//		providerCollector.writeToConsole();

		//INFO (na razie Napoleon)

		for (int filmId = 1; filmId <= 1_000_000; filmId++) {
			try {
				URL url = new URL("https://www.filmweb.pl/api/v1/film/" + filmId + "/info");
				HttpsCollector infoCollector = new HttpsCollector(url);
				infoCollector.Collect();
				infoCollector.writeToConsole();
			} catch (Exception e) {
				// Handle exceptions or continue to the next film ID
				continue;
			}

		//DESCRIPTION (na razie Napoleon)
//		URL url2 = new URL("https://www.filmweb.pl/api/v1/film/864985/description");
//		HttpsCollector descriptionCollector = new HttpsCollector(url2);
//		descriptionCollector.Collect();
//		descriptionCollector.writeToConsole();
//
//		//Daty premiery (na razie Napoleon)
//		URL url3 = new URL("https://www.filmweb.pl/api/v1/film/864985/dates");
//		HttpsCollector datesCollector = new HttpsCollector(url3);
//		datesCollector.Collect();
//		datesCollector.writeToConsole();
//
//		//Id krytyków którzy ocenili ten film (na razie Napoleon)
//		URL url4 = new URL("https://www.filmweb.pl/api/v1/film/864985/critics ");
//		HttpsCollector criticsIDCollector = new HttpsCollector(url4);
//		criticsIDCollector.Collect();
//		criticsIDCollector.writeToConsole();
//
//		//Wszyscy krytycy
//		URL url5 = new URL("https://www.filmweb.pl/api/v1/film/critics");
//		HttpsCollector criticsCollector = new HttpsCollector(url5);
//		criticsCollector.Collect();
//		criticsCollector.writeToConsole();

	}
}}



