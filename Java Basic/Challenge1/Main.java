package Challenge1;

public class Main {
    public static void main(String[] args) {
        Dog sam = new Dog("Kusal", 2, 32.4);

        System.out.println("Sam's owner : " + sam.ownerName);
        sam.barking();
        sam.changeAge(5);
        System.out.println("Sam's age is " + sam.age);
        System.out.println(sam.changeWeight(52.9));
    }
}
