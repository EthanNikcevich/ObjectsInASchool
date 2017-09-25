/**
 * Created by h205p2 on 9/12/17.
 */
public class Person {
    String firstName;
    String lastName;
    Integer id = 0;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        id++;
    }
}
