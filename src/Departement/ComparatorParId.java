package Departement;

import java.util.Comparator;

public class ComparatorParId implements Comparator<Departement> {
    @Override
    public int compare(Departement d, Departement d1) {
        return d.getId() - d1.getId();
    }
}