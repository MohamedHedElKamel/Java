public class Zoo {

    public Animal[] animals;
    public String name;
    public String city;
    public int nbrCages;


    public Zoo(String city, String name) {
        animals= new Animal[25];
        this.city = city;
        this.name = name;
        this.nbrCages = 25;
    }

}
