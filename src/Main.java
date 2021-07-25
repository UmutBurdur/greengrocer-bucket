import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price, pearKg=2.14, appleKg=3.67, tomatoKg=1.11, bananaKg=0.95, eggplantKg=5.00;
        double amuPea, amuApp, amuTom, amuBan, amuEgp;

        Scanner pear = new Scanner(System.in);
        System.out.print("How much pear did you get in kg? : ");
        amuPea = pear.nextDouble();

        Scanner apple = new Scanner(System.in);
        System.out.print("How much apple did you get in kg? : ");
        amuApp = apple.nextDouble();

        Scanner tomato = new Scanner(System.in);
        System.out.print("How much tomato did you get in kg? : ");
        amuTom = tomato.nextDouble();

        Scanner banana = new Scanner(System.in);
        System.out.print("How much banana did you get in kg? : ");
        amuBan = banana.nextDouble();

        Scanner eggplant = new Scanner(System.in);
        System.out.print("How much eggplant did you get in kg? : ");
        amuEgp = eggplant.nextDouble();

        price = (amuPea*pearKg) + (amuApp*appleKg) + (amuTom*tomatoKg) + (amuBan*bananaKg) + (amuEgp*eggplantKg);
        System.out.println("Total price for your bucket: " + price + " TL");
    }
}
