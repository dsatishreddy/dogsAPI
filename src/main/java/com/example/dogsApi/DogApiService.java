package com.example.dogsApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;



@Component
public class DogApiService {

    private static final String API_KEY = "live_B28xnqsSMc2vjdOIdt2Y3WK83lnrAPCNPvHRlprXwTQQj70hPSJDGFx0F6y3wFM3"; // Replace with your actual key
    private static final String DOG_API_URL = "https://api.thedogapi.com"; // Replace with the actual base URL of the Dog Breeds API
    private static final int LIMIT = 10;
    private static final int PAGE = 0;

    public void getdogs() throws IOException {
        String urlString = DOG_API_URL + "/v1/breeds?limit=" + LIMIT + "&page=" + PAGE;
        URL url = new URL(urlString);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("x-api-key", API_KEY);

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println(response.toString());
            // Parse the JSON response to extract dog breed data
        } else {
            System.out.println("Error: HTTP Response code: " + responseCode);
        }
    }
    
    public Dog getspecificDog(String breedId) throws IOException
    {
    	 String urlString = DOG_API_URL + "/v1/breeds/"+breedId;
         URL url = new URL(urlString);

         HttpURLConnection connection = (HttpURLConnection) url.openConnection();
         connection.setRequestMethod("GET");
         connection.setRequestProperty("Content-Type", "application/json");
         connection.setRequestProperty("x-api-key", API_KEY);

         int responseCode = connection.getResponseCode();

         if (responseCode == HttpURLConnection.HTTP_OK) {
             BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
             String inputLine;
             StringBuilder response = new StringBuilder();

             while ((inputLine = in.readLine()) != null) {
                 response.append(inputLine);
             }
             in.close();
             
             /* processing*/
             
             ObjectMapper objectMapper = new ObjectMapper();
          // Assuming the StringBuilder response contains valid JSON
          Map<String, Object> responseMap = objectMapper.readValue(response.toString(), Map.class);
            System.out.println(response.toString());
             Dog dog = new Dog();
             dog.setId((Integer) responseMap.get("id"));
             dog.setName((String) responseMap.get("name"));
             dog.setCountryCode((String) responseMap.get("country_code"));
             dog.setBredFor((String) responseMap.get("bred_for"));
             dog.setBreedGroup((String) responseMap.get("breed_group"));
             dog.setLifeSpan((String) responseMap.get("life_span"));
             dog.setTemperament((String) responseMap.get("temperament"));
             dog.setOrigin((String) responseMap.get("origin"));
             dog.setReferenceImageId((String) responseMap.get("reference_image_id"));

             // Extract weight and height information
             Map<String, String> weightMap = (Map<String, String>) responseMap.get("weight");
             dog.setWeight(weightMap);
             Map<String, String> heightMap = (Map<String, String>) responseMap.get("height");
             dog.setHeight(heightMap);

             return dog;
            
             // Parse the JSON response to extract dog breed data
         } else {
             System.out.println("Error: HTTP Response code: " + responseCode);
         }
		return null;

    }

    public void getDogWithImage(String subID) throws IOException {
        String urlString = DOG_API_URL + "/v1/votes?sub_id="+subID;
        System.out.println(urlString);
        URL url = new URL(urlString);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("x-api-key", API_KEY);

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println(response.toString());
            // Parse the JSON response to extract dog breed data
        } else {
            System.out.println("Error: HTTP Response code: " + responseCode);
        }
    }
    

}
