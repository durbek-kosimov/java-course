public class StringOperations {
    public static void main(String[] args) {
        String fullname = " Kosimov Durbek ";
        System.out.println(fullname);
        System.out.println(fullname.trim());
        System.out.println(fullname.indexOf(" "));
        String firstName = fullname.substring(0, fullname.indexOf('D'));
        System.out.println(firstName.trim());

        String address = "805 Main Street\tDallas\tTK\t12345";
        System.out.println(address);
        System.out.println(address.trim());
    }
}
