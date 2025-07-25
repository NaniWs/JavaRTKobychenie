import ru.rtk.java.APP.TV.TV;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter TV brand: ");
        String userBrand = scanner.nextLine();

        System.out.print("Enter TV size (inches): ");
        int userSize = scanner.nextInt();

        TV userTV = new TV(userBrand, userSize);
        TV tv1 = new TV("Samsung", 55);
        TV tv2 = new TV("LG", 65);

        Random random = new Random();
        int randomSize = 32 + random.nextInt(40); // от 32 до 71
        TV randomTV = new TV("Sony", randomSize);

        tv1.turnOn();
        tv2.turnOff();
        userTV.turnOn();
        randomTV.turnOn();

        System.out.println("\n--- TV INFO ---");
        tv1.displayInfo();
        tv2.displayInfo();
        userTV.displayInfo();
        randomTV.displayInfo();
    }
}