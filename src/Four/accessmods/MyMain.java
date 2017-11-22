package Four.accessmods;

public class MyMain {
    public static void main(String[] args) {
        Person frankie = new Person("Frankie", 1);
        Person jonny = new Person("Jonny",1);

        Person frankieClone = new Person("Frankie", 1);
        System.out.println(frankie.equals(frankieClone));


        System.out.println(frankie);
        System.out.println(frankieClone);
        System.out.println(jonny);

    }
}
