package Bai1;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Nguyễn Văn A", "0987654321", "123 Lê Lợi, TPHCM");
        Oder order = new Oder("DH001", customer);
        Product p1 = new Product("Sp01", "Laptop Dell", 15000000, 1);
        Product p2 = new Product("sp02", "Ban phim co", 2000000, 1);
        Product p3 = new Product("Sp03", "Dien thoai Ip", 9000000, 3);
        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);
        System.out.println(" ");
        order.printInvoice();
    }
}
