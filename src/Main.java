import Departement.DepartementHashSet;
import Departement.Departement;

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
        for (Departement d : gestionDepartementstriee) {
            System.out.println(d);
        }




    }
}