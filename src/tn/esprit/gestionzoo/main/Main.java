package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {

    public static void main(String[] args) {

        Animal lion = new Animal("Cats", "Lion", 20, true);
        Animal tiger = new Animal("Cats", "Tiger", 15, true);
        Animal chimpanzee = new Animal("Monkeys", "Chimpanzee", 7, true);
        Animal cheetah = new Animal("Cats", "Cheetah", 15, true);

        Zoo myzoo = new Zoo("Tunis", "Belvedere");
        Zoo smallerZoo = new Zoo("Tunis", "Smaller");

        System.out.println(lion);

        System.out.println("\n");

        System.out.println(myzoo.addAnimal(chimpanzee));
        System.out.println(myzoo.addAnimal(lion));
        System.out.println(myzoo.addAnimal(tiger));
        System.out.println(myzoo.addAnimal(chimpanzee));
        System.out.println(myzoo.addAnimal(cheetah));

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

        Terrestrial Terrestrial1 = new Terrestrial("Bears", "Panda", 10, true, 4);
        Dolphin Dolphin1 = new Dolphin("Mammals", "Dolphin", 8, true, "Ocean", 15.5f);
        Penguin Penguin1 = new Penguin("Birds", "Penguin", 3, false, "Antarctica", 30.0f);
        Penguin Penguin2 = new Penguin("Birds", "Penguin2", 3, false, "Antarctica", 26.0f);


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

        Penguin Penguin3 = new Penguin("Birds", "Penguin2", 3, false, "Antarctica", 26.0f);
        System.out.println(Penguin3.equals(Penguin2));

    }

}
