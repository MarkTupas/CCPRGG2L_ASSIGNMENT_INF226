public class App{

    public static void main(String[] args) throws Exception {
        
        // item in form of a Clothes
        // Polymorphic variable
        GroceryItem item1 = new Clothes();
        item1.name = "Nike";
        item1.price = 650;
        item1.showItemName();
        item1.showItemPrice();
   
        // item in form of a Coffee
        GroceryItem item2 = new Coffee();
        item2.name = "Creamy White";
        item2.price = 120;
        item2.showItemName();
        item2.showItemPrice();
    
        // Cashier object
        Cashier C130 = new Cashier();

        // Polymorphic parameter
        C130.checkOut(item1);
        C130.checkOut(item2);
        C130.showItemPrice(item1);
        C130.showItemPrice(item2);

        // Polymorphic array
        GroceryItem[] itemArray = new GroceryItem[2];

        itemArray[0] = item1;
        itemArray[1] = item2;

        double totalAmount = 0.00;

        for (int i = 0; i < itemArray.length; i++) {
            itemArray[i].showItemName();
            System.out.println(itemArray[i].price);
            totalAmount += itemArray[i].price;
        }
        System.out.println("Total item price: " + totalAmount);

        DragonDemon myDragonDemon = new DragonDemon();
        myDragonDemon.eat();
    }
}
