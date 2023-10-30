import java.util.Scanner;

public class Employee extends Person {

    Scanner scan = new Scanner(System.in);


    Employee(String firstName, String lastName, int age, int ssn) {
        super(firstName, lastName, age, ssn);
        
    }
    static Person obj = new Person(null, null, 0, 0);

    public String speak(Person obj){
        String name = obj.getfirstName();
        String ssn = Long.toString(obj.getSsn());
        return "The data is" + name + ssn;
    }
    
    public static void main(String[] args){
        Employee obj2 = new Employee(null,null,0,0);
        obj.Setters(obj2);
        System.out.println("the first name and ssn is: " + obj2.speak(obj2));
        
    }
}
