public class Test2 {
    public static void main(String[] args) {
        Test2 test = new Test2("Abdulkuddus", 20);
        String n = test.getName();
        int a = test.getAge();
        System.out.println("Name: " + n);
        System.out.println("age: " + a);
    }

    private String name;
    private int age;

    public Test2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
