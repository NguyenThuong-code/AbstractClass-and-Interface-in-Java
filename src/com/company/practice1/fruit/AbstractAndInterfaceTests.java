package com.company.practice1.fruit;

import com.company.practice1.fruit.animal.Animal;
import com.company.practice1.fruit.animal.Chicken;
import com.company.practice1.fruit.animal.Tiger;
import com.company.practice1.fruit.edible.Edible;
import com.company.practice1.fruit.Apple;
import com.company.practice1.fruit.Fruit;
import com.company.practice1.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals= {new Tiger(), new Chicken()};
        for (Animal animal:animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible edible=(Chicken) animal;
                System.out.println(edible.howToEat());
            }
            Fruit[] fruits={new Orange(), new Apple()};
            for (Fruit fruit:fruits){
                System.out.println(fruit.howToEat());
            }
        }
    }
}
