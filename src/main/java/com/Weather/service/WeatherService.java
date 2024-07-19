package com.Weather.service;

import com.Weather.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Autowired
    private RestTemplate restTemplate;
    String url = "http://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}";
    String apiKey = "b144e517dd9e556e1bd54d7d1ee9a0d2";
    public WeatherResponse getWeather(String city) {
        return restTemplate.getForObject(url, WeatherResponse.class, city, apiKey);
    }


}
