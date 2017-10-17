/**
 * Created by h205p2 on 9/12/17.
 */
import java.util.Scanner;
public class Input {
    public static void main(String args[]) {
        Scanner school = new Scanner(System.in);
        int input = 1;
        while (input == 1) {
            System.out.println("Commands: Create Student, Create Teacher, Create Section, Add Student to Section, Remove Student from Section, Search Student, Awesomeness");
            String userText = school.nextLine();
            if (userText.toLowerCase().equals("create student")) {
                System.out.println("Please enter the student's first name, last name, grade, and rounded GPA as an integer separated by commas.");
                String newSt = school.nextLine();
                String[] var = newSt.split(",");
                for (String str : var){
                    str = str.trim();
                }
                if (var.length == 4) {
                    Student student = new Student(var[0], var[1], Integer.parseInt(var[2]), Integer.parseInt(var[3]));
                    System.out.println("Created an entry for " + var[0] + " " + var[1]);
                }
                else {
                    System.out.println("Invalid Input.");
                }
            }
            else if (userText.toLowerCase().equals("create teacher")) {
                System.out.println("Please enter the teacher's first name, last name, and subject area separated by commas.");
                String newT = school.nextLine();
                String[] var = newT.split(",");
                for (String str : var){
                    str = str.trim();
                }
                if (var.length == 3) {
                    Teacher teacher = new Teacher(var[0], var[1], var[2]);
                    System.out.println("Created an entry for " + var[0] + " " + var[1]);
                } else {
                    System.out.println("Invalid Input.");
                }
            }
             else if (userText.toLowerCase().equals("create section")) {
                 //left off here
                System.out.println("Please enter the section/subject, maximum occupancy, and the teacher's first and last name, separated by commas.");
                String newSe = school.nextLine();
                String[] var = newSe.split(",");
                for (String str : var){
                    str = str.trim();
                }
                if (var.length == 4) {
                    Section section = new Section(var[0], Integer.parseInt(var[1]), var[2], var[3]);
                    System.out.println("Created an entry for " + var[0]);
                } else {
                    System.out.println("Invalid Input.");
                }
            }
             else if (userText.toLowerCase().equals("add student to section")) {
                System.out.println("Please enter the student's first and last name, followed by the section/subject, separated by commas.");
                String addition = school.nextLine();
                String[] var = addition.split(",");
                for (String str : var){
                    str = str.trim();
                }

                for (int i = 0; i < Student.studentList.size(); i++) {
                    if (Student.studentList.get(i).firstName.equals(var[0]) && Student.studentList.get(i).lastName.equals(var[1])) {
                        for (int k = 0; k < Section.sections.size(); k++) {
                            if (Section.sections.get(k).name.equals(var[2])) {
                                Section.sections.get(k).addStudent(Student.studentList.get(i));
                            }
                        }
                    }
                }
            }
             else if (userText.toLowerCase().equals("remove student from section")) {
                System.out.println("Please enter the first and last name of the student and the subject you want to remove the student from, separated by commas.");
                String removal = school.nextLine();
                String[] var = removal.split(",");
                for (String str : var){
                    str = str.trim();
                }
                for (int i = 0; i < Student.studentList.size(); i++) {
                    if (Student.studentList.get(i).firstName.equals(var[0]) && Student.studentList.get(i).lastName.equals(var[1])) {
                        for (int k = 0; k < Section.sections.size(); k++) {
                            if (Section.sections.get(k).name.equals(var[2])) {
                                Section.sections.get(k).removeStudent(Student.studentList.get(i));
                                System.out.println("student removed");
                            }
                        }
                    }
                }
            } else if(userText.toLowerCase().equals("awesomeness")) {
                System.out.println("Please enter the name of the section that you want to check the 'awesomeness' of.");
                String sectionName = school.nextLine();
                int work = 0;
                for(int i = 0; i < Section.sections.size(); i++) {
                    if(Section.sections.get(i).name.equals(sectionName.toLowerCase())) {
                        Section.sections.get(i).awesome();
                        work = 1;
                    }
                }
                if(work == 0) {
                    System.out.println("Invalid Input.");
                }
            } else if(userText.toLowerCase().equals("search student")) {
                System.out.println("Please enter the first and last name of the student, separated by commas");
                String studentName = school.nextLine();
                String[] var = studentName.split(",");
                for (String str : var){
                    str = str.trim();
                }
                for (int i = 0; i < Student.studentList.size(); i++) {
                    if (Student.studentList.get(i).firstName.equals(var[0]) && Student.studentList.get(i).lastName.equals(var[1])) {
                        System.out.println("Student found, here is the student's ID and GPA:");
                        System.out.println(Student.studentList.get(i).id);
                        System.out.println(Student.studentList.get(i).awesomeness);
                    }
                }
            }
            else {
                System.out.println("Invalid Input.");
            }
        }
    }
}

