import java.util.ArrayList;

/**
 * Created by h205p2 on 9/12/17.
 */
public class Teacher extends Person {
    String subject;
    public ArrayList<Teacher> teacherList = new ArrayList<>();

    public Teacher(String firstName, String lastName, String subject){
        super(firstName, lastName);
        this.subject=subject;
        teacherList.add(this);
    }
    public void searchTeacher(Teacher x){
        if(teacherList.contains(x)){
            System.out.println(x.firstName +" "+ x.lastName + " teaches " + x.subject + " at this school.");
        }
    }
}
