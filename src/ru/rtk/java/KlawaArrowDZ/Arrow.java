import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;

        for (int i = 0; i <= input.length() - 5; i++) {
            String sub = input.substring(i, i + 5);
            if (sub.equals(">>-->") || sub.equals("<--<<")) {
                count++;
            }
        }

        System.out.println(count);
    }
}