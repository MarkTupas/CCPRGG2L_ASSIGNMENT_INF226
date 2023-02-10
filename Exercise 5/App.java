public class App {
    public static void main(String[] args) throws Exception {

        Person Me = new Person();

        Me.setName("Mark");

        System.out.println(Me.getName());

        Son myself = new Son();

        System.out.println(myself.surname);

        myself.showSurname();
    }
}
