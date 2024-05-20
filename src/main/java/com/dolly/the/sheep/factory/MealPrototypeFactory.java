package com.dolly.the.sheep.factory;

import java.util.HashMap;
import java.util.Map;

import com.dolly.the.sheep.concrete.ChickenMeal;
import com.dolly.the.sheep.concrete.SeafoodMeal;
import com.dolly.the.sheep.concrete.VegetarianMeal;
import com.dolly.the.sheep.mealInterface.MealPrototype;

public class MealPrototypeFactory {
	
	
	private static final Map<String, MealPrototype> prototypes = new HashMap<>();
	
	static {
		
		prototypes.put("Vegetarian", new VegetarianMeal());
		prototypes.put("Chicken", new ChickenMeal());
		prototypes.put("Seafood", new SeafoodMeal());
		
	}
	
	
	// We return clone of an object instead of original object
	
	public static MealPrototype getPrototypes (String type) {
		
		return prototypes.get(type).clone();
		
	}
	
	
	
	

}
