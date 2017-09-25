import java.util.ArrayList;

/**
 * Created by h205p2 on 9/12/17.
 */
public class Student extends Person {
    Integer grade;
    public static ArrayList<Student> studentList = new ArrayList<>();

    Integer awesomeness;

    public Student(String firstName, String lastName, Integer grade, Integer awesomeness) {
        super(firstName, lastName);
        this.grade=grade;
        this.awesomeness=awesomeness;
        studentList.add(this);
    }

    public void searchStudent(Student x){
        if(studentList.contains(x)){
            System.out.println(x.firstName +" "+ x.lastName + " Grade "+x.grade+" is attending this school.");
        }
    }
}
