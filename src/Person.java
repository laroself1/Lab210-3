/**
 * Created by LaroSelf on 20.03.2016.
 */
public class Person {
    private String FirstName;
    private String LastName;
    private int age;

    public String getFirstName() {    return FirstName;   }
    public void setFirstName(String firstName) {  FirstName = firstName; }

    public String getLastName() {   return LastName; }
    public void setLastName(String lastName) { LastName = lastName;  }

    public int getAge() {  return age; }
    public void setAge(int age) throws InvalidAgeException {

    if (0<age & age<120) {this.age = age;
    }
        else{ throw new InvalidAgeException("Invalid age");}
}}
