public class Item {
    private String name;
    private int price;

    public Item() {
        this.name = "Item";
        this.price = 0;
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " $" + price;
    }
}
