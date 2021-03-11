package com.tts.WeatherApp;
package controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherService {
    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public String getIndex(Model model) {
        Response response = weatherService.getForecast("43210");
        model.addAttribute("data", response);
        return "index";
    }

    private String getForecast(String s) {
    return "index";
    }
}
try {


