import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by h205p2 on 9/12/17.
 */
public class Section{
    String name;
    Integer maxSize;
    String teacherFirstName;
    String teacherLastName;
    int currentSize = 0;
    ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Section> sections = new ArrayList<>();

    public Section(String name, Integer maxSize, String teacherFirstName, String teacherLastName){
        this.name = name;
        this.maxSize = maxSize;
        Teacher current = new Teacher(teacherFirstName, teacherLastName, name);
        sections.add(this);
    }
    public void addStudent(Student x){
            students.add(x);
            currentSize++;
    }
    public void removeStudent(Student x){
        students.remove(x);
        currentSize--;
    }
    public void sectionSeatsRemaining(){
        Integer remains=this.maxSize-currentSize;
        System.out.println("There are " + currentSize + " students in " +this.name);
        System.out.println("There are " +remains + " seats remaining");
    }

    public void awesome(){
        Integer awesomeScore=0;
        for(int i=0; i<students.size();i++){
            awesomeScore+=students.get(i).awesomeness;
        } if(awesomeScore/students.size()>3){
            System.out.println(this.name+" is awesome!");
        } else{
            System.out.println(this.name+" is not awesome....");
        }

    }
//    public void searchClass(Student x){
//        if(students.contains(x)){
//            System.out.println(x.firstName +" "+ x.lastName + " Grade "+x.grade+" is attending this school.");
//        }else{
//            System.out.println("That person is not attending this school.");
//        }
//    }
}
