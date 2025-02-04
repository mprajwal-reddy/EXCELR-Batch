class Customer {
    private final String name;
    private final int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Age: " + age);
    }

    public void displayCustomer(String message) {
        System.out.println(message);
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Age: " + age);
    }
}

class Order {
    private final int orderId;
    private final String product;

    public Order(int orderId, String product) {
        this.orderId = orderId;
        this.product = product;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId + ", Product: " + product);
    }
}

public class Demo054 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Vedansh", 30);
        customer1.displayCustomer();
        customer1.displayCustomer("Customer Information:");

        Order order1 = new Order(101, "Laptop");
        order1.displayOrder();
    }
}