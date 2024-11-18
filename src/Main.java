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
        System.out.println("\nApres suppression de e3: ");
        societe.displayEmploye();
    }
}