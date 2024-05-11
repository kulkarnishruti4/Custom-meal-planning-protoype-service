package com.dolly.the.sheep.app.main;

import com.dolly.the.sheep.MealInterface.MealPrototype;
import com.dolly.the.sheep.factory.MealPrototypeFactory;

public class App {
	
	
	public static void main(String[] args) {
		
		MealPrototype vegMeal = MealPrototypeFactory.getPrototypes("Vegetarian");
		
		MealPrototype chickenMeal = MealPrototypeFactory.getPrototypes("Chicken");
		
		MealPrototype seafoodMeal = MealPrototypeFactory.getPrototypes("Seafood");
		
		
		vegMeal.display();
		chickenMeal.display();
		seafoodMeal.display();
		
	}
	
	

}
