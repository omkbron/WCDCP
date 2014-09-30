package com.omkbron.example.test.model;

import com.omkbron.example.model.BeerExpert;
import java.util.List;

public class BeerExpertTest {

	public static void main(String[] args) {
		BeerExpert beerExpert = new BeerExpert();

		List<String> brands = beerExpert.getBrands("light");

		for(String brand : brands) {
			System.out.println("-->" + brand);
		}
	}
}
