abstract class Employee{
    private int id;
    private String name;
  //  private double salary;


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //abstract method of abstract class.
    @Override
    public abstract double calculateSalary();

    public String toString(){
        return "Employee [id="+id+", name="+name+", salary="+calculateSalary()+"]";
    }
}





class FullTimeEmployee extends Employee{

    private double monthlySalary;

    public FullTimeEmployee(int id, String name, double monthlySalary){
        super(id,name);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}






class PartTimeEmployee extends Employee{
    private int workingHours;
    private double hourlyRate;

    public PartTimeEmployee(int id,int name,int workingHours,double hourlyRate){
        super(id,name);
        this.workingHours=workingHours;
        this.hourlyRate=hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return workingHours*hourlyRate;
    }



}


public class Main{
    public static void main(String[] args) {

    }
}
