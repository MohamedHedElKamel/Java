public class Employe implements Comparable<Employe>{
    private int id;
    private String nom;
    private String prenom;
    private String nomDep;
    private int grade;
    public Employe(){};
    public Employe(int id, String nom, String prenom, String nomDep, int grade){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.nomDep=nomDep;
        this.grade=grade;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomDep() {
        return nomDep;
    }

    public int getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean equals(Employe employe){
        return this.id == employe.getId() && this.nom.equals(employe.nom);
    }

    public String toString(){
        return "Id: "+this.id+" Nom: "+this.nom+" Prenom: "+this.prenom+" nomDep: "+this.nomDep+" grade: "+this.grade;
    }


    public int compareTo(Employe employe) {
        return this.id - employe.id;
    }
}
