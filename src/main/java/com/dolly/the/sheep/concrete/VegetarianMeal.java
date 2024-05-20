package com.dolly.the.sheep.concrete;

import com.dolly.the.sheep.mealInterface.MealPrototype;

public class VegetarianMeal implements MealPrototype {
	
	@Override
    public MealPrototype clone() {
        return new VegetarianMeal();
    }

    @Override
    public void display() {
        System.out.println("This is a Vegetarian meal.");
    }
	
	

}
