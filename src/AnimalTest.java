

class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Minush", 5);
        System.out.println(cat.toString());
    }

    public static class Animal {
        String name;
        int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class Cat extends Animal {
        String maw;

        public Cat(String name, int age) {
            super(name, age);

        }

        @Override
        public String toString() {
            return super.toString();
        }


    }
}