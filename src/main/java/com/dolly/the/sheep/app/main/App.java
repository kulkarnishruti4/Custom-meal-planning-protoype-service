package com.dolly.the.sheep.app.main;

import com.dolly.the.sheep.factory.MealPrototypeFactory;
import com.dolly.the.sheep.mealInterface.MealPrototype;

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
