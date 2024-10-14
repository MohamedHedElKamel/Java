package tn.esprit.gestionzoo.entities;


public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int nbrAnimals;

    public Zoo(String city, String name) {
        animals = new Animal[nbrCages];
        this.city = city;
        setName(name);
        this.nbrAnimals = 0;
    }

    public boolean addAnimal(Animal animal) {

        if (isZooFull()) {
            System.out.println("The zoo is full. Cannot add more animals.");
            return false;
        }

        if (searchAnimal(animal)!=-1) {
            System.out.println("This animal is already in the zoo.");
            return false;
        }

        if (nbrAnimals < nbrCages) {
            for (int i = 0; i < nbrCages; i++) {
                if (animals[i] == null) {
                    animals[i] = animal;
                    nbrAnimals++;
                    return true;
                }
            }
        }
        return false;
    }

    public void showAnimals() {
        System.out.println("Animals in " + name);
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            animals[index] = null;
            nbrAnimals--;
            System.out.println(animal.getName() + " est supprime avec succes");
            return true;
        }
        return false;
    }

    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        } else {
            return null;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Zoo name cannot be empty.");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }


}