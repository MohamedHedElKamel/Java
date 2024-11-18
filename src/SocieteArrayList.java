import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe>{

    public ArrayList<Employe> listeEmployes;

    public SocieteArrayList() {
        listeEmployes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    public boolean rechercherEmploye(String nom) {
        for (Employe employe : listeEmployes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    public boolean rechercherEmploye(Employe employe) {

        for (Employe e : listeEmployes) {
            if (e.equals(employe)) {
                return true;
            }
        }
        return false;
    }

    public void supprimerEmploye(Employe employe) {
        listeEmployes.remove(employe);

    }

    public void displayEmploye() {
        for (Employe employe : listeEmployes) {
            System.out.println(employe);
        }

    }

    public void trierEmployeParId() {
        Collections.sort(listeEmployes);
    }

    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employe> comparator = Comparator
                .comparing(Employe::getNom)
                .thenComparing(Employe::getNomDep)
                .thenComparingInt(Employe::getGrade);

        Collections.sort(listeEmployes, comparator);

    }
}
