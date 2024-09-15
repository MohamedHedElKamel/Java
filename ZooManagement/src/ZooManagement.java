import java.util.Scanner;

public class ZooManagement {

    public static int nbrCages = 20;
    public static String zooName = "my zoo";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();

        System.out.print("Donnez le nom du zoo: ");
        zooName = scanner.nextLine();

        while (true) {
            System.out.print("Donnez le nombre de cages: ");
            if (scanner.hasNextInt()) {
                nbrCages = scanner.nextInt();
                break;
            } else {
                System.out.print("Le nombre de cages doit etre un entier: ");
                scanner.next();
            }
        }

        System.out.print(zooName + " comporte " + nbrCages + " cages");

        }

}
