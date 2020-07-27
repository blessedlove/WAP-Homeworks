package multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author Fikir Blessed
 * @since 07/17/2020
 * 
 * this class contain implementation of Greatest common deviser of two number
 *
 */
public class GCD {
/**
 * 
 * @param args
 * @return nothing
 */
	static int max=Integer.MIN_VALUE;
	public static void main(String args[]) {
		System.out.println("*****this Application used to Calcualte greatest common divisor of two integers*****");
		
		System.out.println("****@@@@@*****");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the first number");
		int n=sc.nextInt();
		System.out.println("please enter the second number");
		int m=sc.nextInt();
		common(n,m);
		
		
	}
	/**
	 * 
	 * @param n
	 * @param m
	 * it accept 2 integer parameters and it gives GCD of the number
	 * 
	 * this method has 3 separate threads 
	 */
	public static void common(int n,int m) {
		/**
		 * this integer of list used to store factors of the number
		 */
		
		  List<Integer>list=new ArrayList<Integer>();
		  
			List<Integer>list2=new ArrayList<Integer>();
			/**
			 *first thread used to  store  factors of first number in the list
			 */
			/**
			 * 
			 * check the incoming value qualify the requirement before it goes to thread
			 */
			  if(n==0&&m>0) {
				  max=m;
				  System.out.println(max);
				  return;
			  }
			  
			  if(m==0&&n>0) {
				  max=n;
				  System.out.println(max);
				  return;
				  
			  }
			  if(m==n) {
				  max=m;
				  System.out.println(max);
				  return;
			  }
		 Runnable run1=()->{
					// TODO Auto-generated method stub
					
					for(int i=1;i<=n;i++) {
						  
						  if(n%i==0) {
							list.add(i);
							//System.out.print(" "+i);
						  }
						  try {
								Thread.sleep(1000);
							}
							catch(Exception e) {
						  
						 
						  
					  }
					
				}
					System.out.println("please wait------");
			
	          };
	          /**
	           * second thread used to store  factors of the second number in the list
	           */
	          Runnable run2=()-> {
	  				// TODO Auto-generated method stub
	  				 for(int i=1;i<=m;i++) {
	  					  
	  					  if(m%i==0) {
	  						list2.add(i);
	  						
	  					  }
	  					  
	  					  try {
	  							Thread.sleep(1000);
	  						}
	  						catch(Exception e) {
	  							
	  						}  
	  				
	  			}
	  				
	  	
	                
	  			 
	  			  
	  		  };
				/**
				 * third thread used to identify common greatest factor
				 */
		         Runnable run3= ()->{
							
							// TODO Auto-generated method stub
							int shortlen=list.size();
							if(list.size()>list2.size()) {
								
								shortlen=list2.size();
							}
							
							
							for(int i=0;i<shortlen;i++) {
								if(list.contains(list2.get(i))) {
									
									if(list2.get(i)>max) {
										max=list2.get(i);
									}
								}
								
							}
							
							System.out.println("GCD of "+n+"and"+m+" is "+max);
							
						
					};
	  		
	  		  
	  		
		  		/**
		  		 * used to control thread communication here  
		  		 */
					System.out.println("please wait------");
	  		 Thread t1= new Thread(run1);
				Thread t2=new Thread(run2);
			
				
			
				
				t1.start();
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {
					
				}
				t2.start();
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {
					
				}
				;
				
				try {
					Thread t3=new Thread(run3);
					t3.sleep(50000);
					t3.start();
					
				}
				catch(Exception e) {
					
				}
				
				
				
			
				
				
	
				
				
				
				
				
	  }
          
	
	}
		
		  
		  
   
             
              
			
               
     
		
