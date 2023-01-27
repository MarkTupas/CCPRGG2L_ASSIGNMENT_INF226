public class Pet {
    int age;
    String name;
    Person owner;

    // Constructer
    Pet (String petName, int petAge, Person ownerName){
        this.age = petAge;
        this.name = petName;
        this.owner = ownerName;
    }
    // Method
    void showOwner() {
        System.out.println("My name is " + this.name + ", age: " + this.age + ". My owner's name is " + owner.name);
    }
}
