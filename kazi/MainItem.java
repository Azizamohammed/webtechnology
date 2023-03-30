public class MainItem {
    public static void main(String[] args) {
        Item item01 = new Item("Keyboard", 59.99, 49.99);
        Item item02 = new Item("Monitor", 199.99);
        Item item03 = new Item("Mouse", 29.99, 24.99);
        Item item04 = new Item("Headphones", 99.99, 74.99);

        System.out.println(item01);
        System.out.println(item02);
        System.out.println(item03);
        System.out.println(item04);

        System.out.println(Item.format(-10.0));
        System.out.println(Item.format(0.0));
        System.out.println(Item.format(10.1));
        System.out.println(Item.format(10.123456));
    }
}