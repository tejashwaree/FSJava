package Constructor;

public class Jungle {

    public static void main(String args[]) {
        Animal lion = new Animal("joe",1);
        Animal tiger = new Animal("john", 2);

        System.out.println(lion.name);
        lion.getDetails();
        tiger.getDetails();

    }
}
