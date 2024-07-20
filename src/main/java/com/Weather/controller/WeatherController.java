package com.Weather.controller;

import com.Weather.model.WeatherResponse;
import com.Weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

@Controller
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @RequestMapping("/data")
    public String getData(@RequestParam("city") String city, Model model) {
        System.out.println("__________________________ data controller-- __________________________" + city);
        if(city== " " || city == null)
            return "Normal/Weather";
        WeatherResponse weather = null;
        try {
            weather = weatherService.getWeather(city);
            model.addAttribute("weather", weather);
            model.addAttribute("city",city);
        } catch (HttpClientErrorException.NotFound ex) {
            model.addAttribute("error", "City not found");
            return "Normal/ExceptionPage";
        }


        return "Normal/Weather";
    }
}