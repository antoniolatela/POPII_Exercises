package one;

import java.util.Random;

/**
 * docs!
 *
 * Javadoc
 */

public class Student {
    private String firstName; // reference of an object NULL
    private String nickName;
    private int age; // primitive
    Random r = new Random();

    int getRandom (){
        return r.nextInt();
    }

    public Student (String firstName, String nickName, int age){
        setAge(age);
        setName(firstName);
    }

    public Student (int age, String firstName){
        setAge(age);
        setName(firstName);
    }

    public Student (){
        this(13, "antonio");
    }

    public String getName() {
        return getFirstName() + " " + getNickName();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName (String name) {
        setFirstName(name);
    }

    private void setFirstName(String s) {
        firstName = s;
    }

    private void setNickName(String s) {
        nickName = s;
    }

    private String getFirstName(){
        return firstName;
    }

    private String getNickName() {
        //String result = "";
        return (nickName == null) ? "" : nickName;
/*        if (nickName != null) {
            result = nickName;
        } else
        {
            result = "";
        }
        return  result;*/
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Age: " + age;
    }
}

//accessor & mutator
