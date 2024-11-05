package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public abstract class Aquatic extends Animal {

    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String toString() {return super.toString() + ", habitat: " + habitat;}

    public abstract void swim() ;

    // L'exercice n'a pas spécifié que les animaux aquatiques doivent être de la même classe.
    public boolean equals(Object obj) {
        Aquatic aquatic = (Aquatic) obj;
        return this.getName().equals(aquatic.getName()) && this.getAge() == aquatic.getAge() && this.habitat.equals(aquatic.habitat);
    }
}
