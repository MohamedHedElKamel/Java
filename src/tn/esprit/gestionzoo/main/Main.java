package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class Main {

    public static void main(String[] args) {
        Animal lion = null;
        Animal tiger = null;
        Animal chimpanzee = null;
        Animal cheetah = null;
        Animal tooYoung = null;

        try {
           lion = new Animal("Cats", "Lion", 20, true);
           tiger = new Animal("Cats", "Tiger", 15, true);
           chimpanzee = new Animal("Monkeys", "Chimpanzee", 7, true);
           cheetah = new Animal("Cats", "Cheetah", 15, true);
           tooYoung = new Animal("Cats", "Cheetah", -5, true);
        } catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

        Zoo myzoo = new Zoo("Tunis", "Belvedere");
        Zoo smallerZoo = new Zoo("Tunis", "Smaller");

        System.out.println(lion);

        System.out.println("\n");

        try {
        myzoo.addAnimal(chimpanzee);
        myzoo.addAnimal(lion);
        myzoo.addAnimal(tiger);
        myzoo.addAnimal(cheetah);

        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n");

        myzoo.showAnimals();

        System.out.println(myzoo.searchAnimal(chimpanzee));

        myzoo.removeAnimal(chimpanzee);

        System.out.println(myzoo.isZooFull());

        Zoo.comparerZoo(myzoo, smallerZoo).showAnimals();

        System.out.println("\n");

        // Aquatic defaultAquatic = new Aquatic();
        // Terrestrial defaultTerrestrial = new Terrestrial();
        // Dolphin defaultDolphin = new Dolphin();
        // Penguin defaultPenguin = new Penguin();
        Terrestrial Terrestrial1 =null;
        Dolphin Dolphin1 = null;
        Penguin Penguin1 =null;
        Penguin Penguin2 =  null;
        try {
         Terrestrial1 = new Terrestrial("Bears", "Panda", 10, true, 4);
         Dolphin1 = new Dolphin("Mammals", "Dolphin", 8, true, "Ocean", 15.5f);
         Penguin1 = new Penguin("Birds", "Penguin", 3, false, "Antarctica", 30.0f);
         Penguin2 = new Penguin("Birds", "Penguin2", 3, false, "Antarctica", 26.0f);
        } catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Terrestrial avec constructeur paramétré: " + Terrestrial1);
        System.out.println("Dolphin avec constructeur paramétré: " + Dolphin1);
        System.out.println("Penguin avec constructeur paramétré: " + Penguin1);

        System.out.println("\n");


        Dolphin1.swim();
        Penguin1.swim(); //La class Penguin heriter la methode swim() de la class aquatic

        System.out.println("\n");

        myzoo.addAquaticAnimal(Dolphin1);
        myzoo.addAquaticAnimal(Penguin1);
        myzoo.addAquaticAnimal(Penguin2);

        for (Aquatic aquatic : myzoo.aquaticAnimals) {
            if (aquatic == null) {
                break;
            }
            else{
                aquatic.swim();
            }

        }
        System.out.println(myzoo.maxPenguinSwimmingDepth());

        myzoo.displayNumberOfAquaticsByType();

        System.out.println(Penguin1.equals(Penguin2));

        Penguin Penguin3 =null;
        try {
         Penguin3 = new Penguin("Birds", "Penguin2", 3, false, "Antarctica", 26.0f);
        System.out.println(Penguin3.equals(Penguin2));
        } catch (InvalidAgeException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
