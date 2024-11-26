package Departement;

public class Departement {
    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    public Departement() {}

    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    public int getId() {
        return id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null ) return false;
        Departement dep = (Departement) obj;
        return id == dep.id && nomDepartement.equals(dep.nomDepartement);
    }

    public String toString(){
        return "\n Departement: id=" + id +", nbrEmployes=" +  nombreEmployes +", nom='" + nomDepartement  ;
    }


}
