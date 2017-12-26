package ex1;


import java.time.LocalDate;
import java.util.*;

public class ex1{
    private class my{
        private class your<T> implements Collection<T>{
            {
                System.out.println("ueeeee");
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<T> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T1> T1[] toArray(T1[] a) {
                return null;
            }

            @Override
            public boolean add(T t) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends T> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        }
        {
            your y = new your();
            System.out.println("123 ccer");
        }
    }
    {
        my m = new my();
        System.out.println(super.getClass());
    }
    {
        System.out.println("ciao");
    }
    void test (){
        //System.out.println(this);
        exit:
        while (true){
            System.out.println("test1");
            if (true ) {
                break exit;
            }
        }
        System.out.println("exit");
        String[] i = new String[10];
        ArrayList<String> a = new ArrayList(List.of("ciao", "", ""));
        Arrays.fill(i,"1");
        Collections.fill(a, "Antonio");
        System.out.println(Arrays.deepToString(i));

        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        al.add(new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13)));

        System.out.println(al.get(0).size());
        //System.out.println(i[0]);
    }

    private void retInt (int... i){
        for (int j: i)System.out.println(j);

    }

    private void date(){
        LocalDate ld =  LocalDate.of(2017,12,17);
        System.out.println(ld.plusMonths(1).getDayOfWeek());
    }

    public static void main(String[] args) {
        ex1 e = new ex1();
        e.date();
        //ex1 r = new ex1();
        //e.test();
        //e.retInt(1,2,3,4,5,6,7,8);
        //System.out.println(e);
        //r.test();
    }
}
