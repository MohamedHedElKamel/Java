import Departement.DepartementHashSet;
import Departement.Departement;

import java.util.TreeMap;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(2, "ElKamel", "Hedi", "IT", 3);
        Employe e2 = new Employe(1, "EmpNom2", "EmpPrenom2", "HR", 2);
        Employe e3 = new Employe(3, "z", "EmpPrenom3", "z", 1);
        Employe e4 = new Employe(4, "EmpNom4", "EmpPrenom4", "Finance", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println("Recherche par employee "+societe.rechercherEmploye(new Employe(1, "EmpNom2", "EmpPrenom2", "Finance", 4)));

        System.out.println("\nRecherche par nom "+societe.rechercherEmploye("ElKamel"));

        System.out.println("\nAvant tri:");
        societe.displayEmploye();

        societe.trierEmployeParId();

        System.out.println("\nTri par ID:");
        societe.displayEmploye();

        societe.trierEmployeParNomDépartementEtGrade();

        System.out.println("\nTri par Nom Département Et Grade:");
        societe.displayEmploye();

        societe.supprimerEmploye(e3);
        System.out.println("\nApres suppression de e3:  ");
        societe.displayEmploye();

        DepartementHashSet gestionDepartements = new DepartementHashSet();



        Departement d1 = new Departement(1, "Informatique", 25);
        Departement d2 = new Departement(2, "Ressources Humaines", 15);
        Departement d3 = new Departement(3, "Marketing", 20);
        Departement d4 = new Departement(4, "Recherche et developpement ", 30);


        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);
        gestionDepartements.ajouterDepartement(d4);

        System.out.println("\nListe des departements:");
        gestionDepartements.displayDepartement();

        System.out.println("\nRechercher departement par nom:");
        gestionDepartements.rechercherDepartement("Informatique");

        System.out.println("\nSupprimer departement");
        gestionDepartements.supprimerDepartement(d4);

        System.out.println("\nListe des departements triee:");
        TreeSet<Departement> gestionDepartementstriee =gestionDepartements.trierDepartementById();

        System.out.println(gestionDepartementstriee);

        System.out.println("  \n  HashMap \n   ");

        AffectationHashMap affectation = new AffectationHashMap();

        affectation.ajouterEmployeDepartement(e1,d1);
        affectation.ajouterEmployeDepartement(e3,d3);
        affectation.ajouterEmployeDepartement(e2, d2);
        affectation.ajouterEmployeDepartement(e2, d2);
        affectation.ajouterEmployeDepartement(e4, d4);

        System.out.println("  \n  List Employes Et Departements \n   ");
        affectation.afficherEmployesEtDepartements();

        System.out.println("  \n  Employes e1 supprime \n   ");
        affectation.supprimerEmploye(e1);

        System.out.println("  \n  Employes e2 et Departements d2 supprime\n   ");
        affectation.supprimerEmployeEtDepartement(e2,d2);

        affectation.afficherEmployes();

        affectation.afficherDepartements();

        System.out.println("rechercher Departement d1");
        System.out.println(affectation.rechercherDepartement(d1));

        System.out.println("rechercher Employe e1");
        System.out.println(affectation.rechercherEmploye(e3));

        TreeMap<Employe, Departement> sortedMap = affectation.trierMap();
        sortedMap.forEach((employe, departement) ->
                System.out.println(employe + " -> " + departement));



    }
}