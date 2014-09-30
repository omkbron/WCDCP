package com.omkbron.example.model;

import java.util.List;
import java.util.ArrayList;

public class BeerExpert {

    public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<String>();

		if (color.equals("light")) {
			brands.add("light brand 1");
			brands.add("light brand 2");
			brands.add("light brand 3");
		} else if (color.equals("amber")) {
			brands.add("amber brand 1");
			brands.add("amber brand 2");
		} else if (color.equals("brown")) {
			brands.add("brown brand 1");
			brands.add("brown brand 2");
			brands.add("brown brand 3");
			brands.add("brown brand 4");
		} else {
			brands.add("dark brand 1");
			brands.add("dark brand 2");
			brands.add("dark brand 3");
			brands.add("dark brand 4");
			brands.add("dark brand 5");
		}

		return brands;
	}

}
