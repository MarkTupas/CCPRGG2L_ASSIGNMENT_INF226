public class Person {
    int age;
    String name;
    Person(String personName, int personAge) {
        this.name = personName;
        this.age = personAge;
    }
    Person(String CM1Name){
        this.name = CM1Name;
    }

    void addFriend(Person friend){
        System.out.println(this.name + " is friend with " + friend.name);
    }

    void addClassmate(Person CM1) {
        System.out.println(" I am classmate with " + CM1.name + ", age: " + CM1.age);
    }
}