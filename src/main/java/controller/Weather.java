package com.tts.WeatherApp;
package controller;

import controller.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;