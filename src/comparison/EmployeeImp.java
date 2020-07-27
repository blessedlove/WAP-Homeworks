package comparison;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



/**
 * 
 * @author Fikir Blessed
 * this class contain different employee and methods that used to compare objects 
 * 
 *
 */

public class EmployeeImp {
	/**
	 * 
	 * @param args
	 * @returns nothing
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Crate Employee Array 
		 */
		Employee[] empArray =
			{new Employee("Fikr", 90000, 2020,7,20, 678345657),
			 new Employee("Beki", 50000, 2019, 1, 3, 896785678),
			 new Employee("Walle", 45000, 2012, 2, 7, 555678904)};
		
		/**
		 * change Employee array to Employee list
		 */
		List<Employee> empList = Arrays.asList(empArray);
		  System.out.println("***BEFORE SORTING OR COMPARING EMPLOYEE******");
		  printAll(empList);
		  
		  /**
		   * compare Employee by Name
		   */
		Collections.sort(empList,(e1,e2)->e1.getName().compareTo(e2.getName()));
		System.out.println("***AFTER SORTING OR COMPARING BY NAME EMPLOYEE******");
		 printAll(empList);
		 /**
		  * 
		  * Compare Employee by salary
		  */
		 Comparator<Employee> comparsalary = (emp1, emp2) -> {
			             if(emp1.getSalary()-emp2.getSalary()!=0) {
	            return   new Integer((int) (emp1.getSalary()-emp2.getSalary()));	
			             }
			           return -1;
	        };
	       
				 
	        Collections.sort(empList, comparsalary);
	        System.out.println("***AFTER SORTING OR COMPARING BY SALARY EMPLOYEE******");
	        printAll(empList);
	        /**
	         * 
	         * compare Employee by hire date
	         */
	   	 Comparator<Employee> comparahire = (emp1, emp2) -> {
             if(emp1.getHireDate().compareTo(emp2.getHireDate())!=0) {
        return   emp1.getHireDate().compareTo(emp2.getHireDate());	
             }
           return -1;
           
                };
  
     Collections.sort(empList, comparahire);
     System.out.println("***AFTER SORTING OR COMPARING BY HIRDATE EMPLOYEE******");
       printAll(empList);
       /**
        * compare by SSN
        */
  	 Comparator<Employee> comparssn = (emp1, emp2) -> {
         if(emp1.getSsn()-emp2.getSsn()!=0) {
        	 
             return   new Integer((int) (emp1.getSalary()-emp2.getSalary()));	
         }
       return -1;
};
Collections.sort(empList, comparssn);
System.out.println("***AFTER SORTING OR COMPARING BY SSN EMPLOYEE******");
  printAll(empList);
	
	}
		private static void printAll(List<Employee>employee) {
			
			for(Employee e:employee) {
				
				
				System.out.println(e.toString());
				
			}

}
}