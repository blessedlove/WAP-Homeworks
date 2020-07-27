package comparison;
/**
 *  <h1>Employee</h1>
 * this class contain different members of Employee
 * which is name,hire date,salary and social security.
 * .
 * 
 * @author Fikir Blessed
 * @since   2020-07-15
 */


import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee {
/**
 * Employee name, hireDate,salary,and ssn.
 */
	private String name;
	private LocalDate hireDate;
	private double salary;
	private int ssn;
	/**
	 * 
	 * @param name
	 * @param salary
	 * @param year
	 * @param month
	 * @param day
	 * @param ssn
	 * Employee class take the members as parameter 
	 */
	public Employee(String name, double salary, int year, int month, int day,int ssn){
		this.name = name;
		this.salary = salary;
		hireDate= LocalDate.of(year, month, day);
		this.ssn=ssn;
	}
/**
 * 
 * @return hireDate of Employee
 */
	public LocalDate getHireDate() {
		return hireDate;
	}
	/**
	 * 
	 * @return name of Employee
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @return salary of Employee
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * 
	 * @return social security number of Employee
	 */
	
	public int getSsn() {
		return ssn;
	}
	/**
	 * @return True or false  
	 * it checks my class to check whether two objects have same data or not.
	 */
	public final boolean equals(Object o){
		if(o==null) return false;
		if(o.getClass() != this.getClass()) {
			return false;
		}
		Employee e = (Employee)o;
		return (e.getName().equals(name)&& 
				e.getHireDate().equals(hireDate) &&
				e.getSalary()== salary)&&e.getSsn()==ssn;
	}
	/**
	 * @return integer value for object
	 * it generate an unique id number allocated to an object by JVM
	 *using hashing mechanism..
	 */
	
	public int hashCode(){
		
		return Objects.hash(name,hireDate,salary,ssn);
	}
	public String toString() {
		String newline = System.getProperty("line.separator");
		return newline+"EMPLOYEE Name :"+name+newline+
				"Hire Date: "+hireDate+newline+
				"Salary: "+salary+newline+ "SSN "+ssn;  
	}

	

}
