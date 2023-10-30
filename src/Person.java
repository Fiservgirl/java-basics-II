import java.util.*; 

public class Person {
    private long ssn;
    private byte age;
    private String firstName;
    private String lastName;
    static Scanner scan1 = new Scanner(System.in);

    Person(String firstName, String lastName,  int  age, int ssn){
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.age = (byte) age;
        this.ssn = ssn;
    }
     public void setfirstName(String firstName){
        this.firstName = firstName;
    }
     public void setlastName(String lastName){
        this.lastName = lastName;
    }
     public void setAge(int age){
       this.age = (byte) age;
    }
     public void setSsn(long ssn){
        this.ssn = ssn;
    }

    public String getfirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public long getSsn(){
        return ssn;
    }
    public void Setters(Person obj){
        System.out.println("Please enter employee age");
        obj.setAge(scan1.nextInt());
        System.out.println("Please enter employee ssn");
        obj.setSsn(scan1.nextLong());
        System.out.println("Please enter employee first name");
        obj.setfirstName(scan1.nextLine());
        System.out.println("Please enter employee last name");
        obj.setlastName(scan1.nextLine());
    }
  
}
