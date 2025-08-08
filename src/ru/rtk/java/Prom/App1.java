import java.util.*;

public class App1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        try {
            System.out.println("Введите покупателей (пример: Павел Андреевич = 10000):");
            String line = scanner.nextLine();
            while (!line.isEmpty()) {
                String[] parts = line.split("=");
                if (parts.length != 2) {
                    System.out.println("Неверный формат");
                    return;
                }
                String name = parts[0].trim();
                int money = Integer.parseInt(parts[1].trim());
                people.add(new Person(name, money));
                line = scanner.nextLine();
            }

            System.out.println("Введите продукты (пример: Хлеб = 40):");
            line = scanner.nextLine();
            while (!line.isEmpty()) {
                String[] parts = line.split("=");
                if (parts.length != 2) {
                    System.out.println("Неверный формат");
                    return;
                }
                String name = parts[0].trim();
                int price = Integer.parseInt(parts[1].trim());
                products.add(new Product(name, price));
                line = scanner.nextLine();
            }

            System.out.println("Введите покупки (пример: Имя - Продукт):");
            line = scanner.nextLine();
            while (!line.equalsIgnoreCase("END")) {
                String[] parts = line.split("-");
                if (parts.length != 2) {
                    System.out.println("Неверный формат ввода");
                    line = scanner.nextLine();
                    continue;
                }

                String personName = parts[0].trim();
                String productName = parts[1].trim();

                Optional<Person> personOpt = people.stream().filter(p -> p.getName().equals(personName)).findFirst();
                Optional<Product> productOpt = products.stream().filter(p -> p.getName().equals(productName)).findFirst();

                if (personOpt.isPresent() && productOpt.isPresent()) {
                    personOpt.get().buyProduct(productOpt.get());
                } else {
                    System.out.println("Покупатель или продукт не найден");
                }

                line = scanner.nextLine();
            }

            // Вывод результата
            for (Person person : people) {
                System.out.println(person);
            }

        } catch (NumberFormatException ex) {
            System.out.println("Ошибка формата числа: " + ex.getMessage());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}