public class SportsCar {
    Person owner;
    String brand;
    String color;

    SportsCar (String carName, String carColor , Person ownerName) {
        this.brand = carName;
        this.color = carColor;
        this.owner = ownerName;
    }
    void showOwner() {
        System.out.println("The car's brand is " + 
        this.brand + ", color: " + 
        this.color + ". The owner of the car is " + 
        owner.name);
    }
}


