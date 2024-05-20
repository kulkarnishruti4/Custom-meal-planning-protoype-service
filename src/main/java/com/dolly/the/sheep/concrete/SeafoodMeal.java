package com.dolly.the.sheep.concrete;

import com.dolly.the.sheep.mealInterface.MealPrototype;

public class SeafoodMeal implements MealPrototype {
	
	@Override
    public MealPrototype clone() {
        return new SeafoodMeal();
    }

    @Override
    public void display() {
        System.out.println("This is a Seafood meal.");
    }
	
	

}
