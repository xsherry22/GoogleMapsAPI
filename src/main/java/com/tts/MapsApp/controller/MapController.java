package com.tts.MapsApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tts.MapsApp.service.Location;
import com.tts.MapsApp.service.MapService;


@Controller
public class MapController {

	@Autowired
	private MapService mapService;
	
	@GetMapping("/home")
    public String getDefaultMap(Object url) {
		Location location = new Location();
		location.setCity("Dallas");
		location.setState("Texas");
		mapService.addCoordinates(location);
		System.out.println(location);
		return "index.html";
    }
}
	

	

