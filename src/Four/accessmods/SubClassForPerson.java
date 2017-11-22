package Four.accessmods;

public class SubClassForPerson extends Person{
    public SubClassForPerson(String s, int id) {//calls extended class
        super(s, id);
    }

    public void aMethod(){
        System.out.println(str);
        //System.out.println(name);
    }
}
