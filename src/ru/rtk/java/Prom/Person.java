import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private int money;
    private List<Product> bag;

    public Person(String name, int money) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("Имя не может быть короче 3 символов");
        }
        if (money < 0) {
            throw new IllegalArgumentException("Деньги не могут быть отрицательными");
        }
        this.name = name;
        this.money = money;
        this.bag = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public List<Product> getBag() {
        return bag;
    }

    public boolean buyProduct(Product product) {
        if (this.money >= product.getPrice()) {
            this.money -= product.getPrice();
            bag.add(product);
            System.out.println(name + " купил " + product.getName());
            return true;
        } else {
            System.out.println(name + " не может позволить себе " + product.getName());
            return false;
        }
    }

    @Override
    public String toString() {
        if (bag.isEmpty()) {
            return name + " - Ничего не куплено";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(name).append(" - ");
            for (int i = 0; i < bag.size(); i++) {
                sb.append(bag.get(i).getName());
                if (i < bag.size() - 1) sb.append(", ");
            }
            return sb.toString();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}