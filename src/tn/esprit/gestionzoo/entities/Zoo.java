package tn.esprit.gestionzoo.entities;


import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 3;
    private int nbrAnimals;

    public Aquatic[] aquaticAnimals;
    private int nbraquaticAnimals;

    public Zoo(String city, String name) {
        animals = new Animal[nbrCages];
        aquaticAnimals=new Aquatic[10];
        this.city = city;
        setName(name);
        this.nbrAnimals = 0;
    }

    public void addAnimal(Animal animal) throws ZooFullException {

        if (nbrAnimals >= nbrCages) {
            throw new ZooFullException("Error: Cannot add animal: the zoo is full.");
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println("Animal added successfully. Total animals: " + nbrAnimals);

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


    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbraquaticAnimals < 10) {
            aquaticAnimals[nbraquaticAnimals] = aquatic;
            nbraquaticAnimals++;
            System.out.println("Aquatic animal added: " + aquatic.getName());
        } else {
            System.out.println("No more space for aquatic animals.");
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Dolphins : " + dolphinCount);
        System.out.println("Penguins : " + penguinCount);
    }

}
