/**
 * Created by shso1116 on 16-03-2017.
 */
/*Shallow copy is a bit-wise copy of an object.
A new object is created that has an exact copy of the values in the original object.
If any of the fields of the object are references to other objects,
just the reference addresses are copied i.e., only the memory address is copied.*/

class Subject {

    private String name;

    public Subject(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }
}

class DeepCopyStudent implements Cloneable {
    //Contained object
    private Subject subj;

    private String name;

    public DeepCopyStudent(String s, String sub) {
        name = s;
        subj = new Subject(sub);
    }

    public Subject getSubj() {
        return subj;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    public Object clone() {
        //Deep copy
        DeepCopyStudent s = new DeepCopyStudent(name, subj.getName());
        return s;
    }
}

class ShallowCopyStudent implements Cloneable {
    //Contained object
    private Subject subj;

    private String name;

    public ShallowCopyStudent(String s, String sub) {
        name = s;
        subj = new Subject(sub);
    }

    public Subject getSubj() {
        return subj;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    public Object clone() {
        //shallow copy
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

public class ShallowCopyExample {

    public static void main(String[] args) {
        //Original Object
        ShallowCopyStudent stud = new ShallowCopyStudent("John", "Algebra");

        System.out.println("Original Object: " + stud.getName() + " - "
            + stud.getSubj().getName());

        //Clone Object
        ShallowCopyStudent clonedStud = (ShallowCopyStudent) stud.clone();

        System.out.println("Cloned Object: " + clonedStud.getName() + " - "
            + clonedStud.getSubj().getName());

        stud.setName("Dan");
        stud.getSubj().setName("Physics");

        System.out.println("Original Object after it is updated: "
            + stud.getName() + " - " + stud.getSubj().getName());

        System.out.println("Cloned Object after updating original object: "
            + clonedStud.getName() + " - " + clonedStud.getSubj().getName());


    }
}