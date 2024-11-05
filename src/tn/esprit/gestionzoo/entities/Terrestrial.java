package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {

    private int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) throws InvalidAgeException {
        super(family, name, age, isMammal);

        this.nbrLegs = nbrLegs;
    }

    public String toString() {return super.toString() + ", number of legs: " + nbrLegs;}


    @Override
    public void eatPlantAndMeat(Food both) {
        System.out.println("I eat "+both);
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("I eat "+meat);
    }

    @Override
    public void eatPlant(Food plant) {
        System.out.println("I eat "+plant);
    }
}
