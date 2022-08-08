package team3.javaapi.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import team3.javaapi.model.Securities;



@RestController
@RequestMapping(path="securities")
public class SecuritiesController {
	
	private static List<Securities> allSecurities = new ArrayList<>();
	
	public SecuritiesController() {
		loadSecurities();
	}
	
	private void loadSecurities() {
		
	}
	
	
	
	
}

