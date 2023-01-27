public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercise 4");

        //Person Object
        Person Me = new Person("Mark",22);

        //Person Object
        Person Friend = new Person("Christian", 21);
        Me.addFriend(Friend);
        Person CM1 = new Person("Chado" , 21);
        Person CM2 = new Person("Orehime", 18);
        Person CM3 = new Person("Echigo", 20);

        //Pet Object
        Pet Dog = new Pet("Bugart", 2, Me);
        Dog.showOwner();
        
        Me.addClassmate(CM1);
        Me.addClassmate(CM2);
        Me.addClassmate(CM3);

        SportsCar Car = new SportsCar("Buggati ", "red ", Me);
        Car.showOwner();
    }
}
