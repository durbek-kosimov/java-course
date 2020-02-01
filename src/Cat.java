public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
//        if (this.age > anotherCat.age && this.weight > anotherCat.weight && this.strength > anotherCat.strength)
//            return true;
        if (this.weight > anotherCat.weight)
            return true;
        else if (this.age > anotherCat.age)
            return true;
        else if (this.strength > anotherCat.strength)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.age = 10;
        cat1.weight = 9;
        cat1.strength = 10;

        cat2.age = 10;
        cat2.weight = 10;
        cat2.strength = 10;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
