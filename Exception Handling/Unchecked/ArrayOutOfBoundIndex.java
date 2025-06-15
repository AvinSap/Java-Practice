public class ArrayOutOfBoundIndex {
    public static void main(String[] args) {
        Item[] items = new Item[3];
        items[0] = new Item("Iwatch", 600);
        items[1] = new Item("IPhone", 1600);
        items[2] = new Item("IPad", 1200);
        int index = 1;
        try {
            Item item = new Item();
            System.out.println("Name:" + item.toString());
            index = 3;
            System.out.println("Name:" + items[index].toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index +" is out of bounds");
        }catch (NullPointerException e){
            System.out.println("Its a Null pointer"+ e.getMessage());
        }
    }
}
