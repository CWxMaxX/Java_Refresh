package Challenge1;

public class Dog {

    String ownerName;
    int age;
    double weight;

    public Dog(String ownerName, int age, double weight) {
        this.ownerName = ownerName;
        this.age = age;
        this.weight = weight;
    }

    public void barking() {
        System.out.println("Bark!");
    }

    public void changeAge(int age) {
        this.age = age;
    }

    public double changeWeight(double weight) {
        this.weight = weight;
        return this.weight;
    }

}