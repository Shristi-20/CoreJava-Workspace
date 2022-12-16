package exercises;

public class Employee {
	static int count = 0;
    
    public Employee(){
        count++;
    }
    public Employee(int i){
        count++;
    }
    public static void main(String[] args) {
    	Employee obj1 = new Employee();
    	Employee obj2 = new Employee(0);
    	Employee obj3 = new Employee(1);
        
        System.out.println("objects created: " + Employee.count);
    }
	
}