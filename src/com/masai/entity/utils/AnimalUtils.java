package com.masai.entity.utils;


import com.masai.entity.entity.Animal;
import com.masai.entity.entity.Cat;
import com.masai.entity.entity.Dog;
import com.masai.entity.entity.Parrot;

public class AnimalUtils {
    public void addAnimal(Animal animal){
        System.out.println("com.masai.entity.entity.Animal added:" +animal.getName());
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.jump();
        }
        else if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.play();
        }
//        else if(animal instanceof Parrot){
//            Parrot parrot=(Parrot)animal;
//            parrot.fly();
//        }
    }
}
