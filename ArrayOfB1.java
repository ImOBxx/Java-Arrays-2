
class Employee {
	String name;
	double salary;
	String doj;
	
	Employee(String name, double salary, String doj)
	{
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}
	
	void display()
	{
		System.out.println("Name: " + name + ", Salary: " + salary + ", Date of Joining: " + doj);
		
	}
}

public class ArrayOfB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees = new Employee[10];
		
		employees[0] = new Employee("John Doe", 50000, "2022-01-15");
        employees[1] = new Employee("Jane Smith", 60000, "2021-03-22");
        employees[2] = new Employee("Jim Brown", 55000, "2023-05-10");
        employees[3] = new Employee("Jill White", 70000, "2020-07-25");
        employees[4] = new Employee("Jack Black", 65000, "2019-08-30");
        employees[5] = new Employee("Jenny Green", 52000, "2018-09-14");
        employees[6] = new Employee("Joe Blue", 48000, "2017-11-01");
        employees[7] = new Employee("Jessica Purple", 75000, "2016-12-12");
        employees[8] = new Employee("Jerry Red", 53000, "2015-02-28");
        employees[9] = new Employee("Jasmine Yellow", 68000, "2014-04-16");
        
        for (Employee emp : employees)
        {
        	emp.display();
        }


	}

}
