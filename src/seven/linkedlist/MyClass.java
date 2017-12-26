package seven.linkedlist;

public class MyClass {
    public static void main(String[] args) {
        LinkedList<String> ls;
        ls = new LinkedList<>();

        ls.add("Simon");
        System.out.println(ls);
        System.out.println(ls.size());

        ls.add("pippo");
        System.out.println(ls);
        System.out.println(ls.size());

        ls.add("pippo");
        System.out.println(ls);
        System.out.println(ls.size());
    }
}
