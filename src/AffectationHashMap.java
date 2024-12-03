import Departement.Departement;

import java.util.*;

public class AffectationHashMap {
    private Map<Employe, Departement> affectation;

    public AffectationHashMap() {
        this.affectation = new HashMap<>();
    }


    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectation.put(e, d);

    }

    public void afficherEmployesEtDepartements() {


        System.out.println(affectation);

    }

    public void supprimerEmploye(Employe e) {

        affectation.remove(e);

    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectation.containsKey(e)) {
            if (affectation.get(e).equals(d)) {
                affectation.remove(e);
            } else {
                System.out.println("Employé " + e + " n'est pas associé au département " + d + ".");
            }
        }
    }

    public void afficherEmployes() {

        System.out.println("Liste des employés :");
        Iterator<Employe> iterator = affectation.keySet().iterator();
        while (iterator.hasNext()) {
            Employe employe = iterator.next();
            System.out.println(employe);
        }
    }

    public void afficherDepartements() {

        System.out.println("Liste des départements :");
        Iterator<Departement> iterator = affectation.values().iterator();
        while (iterator.hasNext()) {
            Departement departement = iterator.next();
            System.out.println(departement);
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return affectation.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectation.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(affectation);
    }


}