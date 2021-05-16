/**
 * 
 */
package net.learn.restapi.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rmbid
 *
 */
@RestController
public class TestController {
	
	@RequestMapping("/")
	public String sayHello() {
		return "Hi";
	}
	
	@GetMapping("/readfile")
	public void readFile() throws Exception {
		@SuppressWarnings("resource")
		BufferedReader csvReader = new BufferedReader(new FileReader("C:/Users/rmbid/Dev/test.csv"));
		String [] data = null;
		String row = null;
		
		do {
			row = csvReader.readLine();
			if (row != null) {
				data = row.split("\\|");
				System.out.println(Arrays.toString(data));
				
			} 
		} while(row != null);
		
		
	}

}
