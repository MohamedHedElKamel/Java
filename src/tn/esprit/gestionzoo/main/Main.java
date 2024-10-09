package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {

    public static void main(String[] args) {

        Animal lion=new Animal("cats","lion",20,true);
        Animal tiger = new Animal("cats", "tiger", 15, true);
        Animal chimpanzee = new Animal("monkeys", "chimpanzee", 7, true);
        Animal cheetah = new Animal("cats", "cheetah", 15, true);

        Zoo myzoo=new Zoo("tunis","belvedere");
        Zoo smallerZoo=new Zoo("tunis","smaller");

        System.out.print(lion);

        System.out.println(myzoo.addAnimal(chimpanzee));
        System.out.println(myzoo.addAnimal(lion));
        System.out.println(myzoo.addAnimal(tiger));
        System.out.println(myzoo.addAnimal(chimpanzee));
        System.out.println(myzoo.addAnimal(cheetah));

        myzoo.showAnimals();

        System.out.println(myzoo.searchAnimal(chimpanzee));

        myzoo.removeAnimal(chimpanzee);

        System.out.println(myzoo.isZooFull());

        Zoo.comparerZoo(myzoo, smallerZoo).showAnimals();
    }

}
