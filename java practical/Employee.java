public class Employee {

    String firstName;
    String lastName;
    double salary;


    public Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary =salary;

    }

    public void setFirstname( String firstName){
        this.firstName = firstName;
    }
    public String getFirstname(){
        return firstName;
    }

    public  void setLastnmae(String lastName){
        this.lastName =lastName;
    }
    public String getLastname(){
        return lastName;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary * 0.1;
    }
    public String toString(){
        return "my name is  "+ firstName +lastName+ "my salary is   "  ;
    }

}
