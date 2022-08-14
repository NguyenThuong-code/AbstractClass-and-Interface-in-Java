package com.company.practice1.fruit.animal;

import com.company.practice1.fruit.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }

}
