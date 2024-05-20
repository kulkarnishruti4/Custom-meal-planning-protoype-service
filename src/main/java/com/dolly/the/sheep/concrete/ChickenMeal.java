package com.dolly.the.sheep.concrete;

import com.dolly.the.sheep.mealInterface.MealPrototype;

public class ChickenMeal implements MealPrototype {
	
	@Override
    public MealPrototype clone() {
        return new ChickenMeal();
    }

    @Override
    public void display() {
        System.out.println("This is a Chicken meal.");
    }
	
	

}



