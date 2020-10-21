public class Swap {
    public static void main(String[] args) {
        Animal lion = new Animal("Lion");
        System.out.println(lion);
    }
}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

//    public String toString() {
//        return super.toString();
//    }
}