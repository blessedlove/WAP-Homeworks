package generics;

import java.util.*;
public class Util<T,E> extends TlistIMp<T,E>{

	T item1;
    E item2;
	    
	      public Util(T item1, E item2) {
		super(item1, item2);
		// TODO Auto-generated constructor stub
	}

       public static void main(String args[]) {
		   Util<Integer, String>ut=new Util<>(1, "Fikir");
		   
		   int id=ut.getItem1();
		   String name=ut.getItem2();
		   System.out.println("ID of Employee :"+id+" and name "+name);
	
		   Set<String>s1=new LinkedHashSet<String>();
		   s1.add("java Developer");
		   s1.add("Scientist");
		   Set<String>s2=new LinkedHashSet<String>();
		   s2.add("student");
		   s2.add("Doctor");
		   Set<String>allset=unioun(s1, s2);
		   Set<Integer>s3=new LinkedHashSet<Integer>();
		   
		   s3.add(2);
		   s3.add(3);
		   Set<Integer>s4=new LinkedHashSet<Integer>();
		   s4.add(4);
		   s4.add(5);
		   Set<Integer>allset2=unioun(s3, s4);
		   
		   Iterator it=allset.iterator();
		   Iterator it2=allset2.iterator();
		   while(it.hasNext()&&it2.hasNext()) {
			   System.out.print(" Professional ID =" +it2.next()+ "for "+it.next());
			   System.out.println();
		   }
		
	}
       
        public static <E>Set<E>unioun (Set<E>set1,Set<E>set2){
        	Set<E>result=new HashSet<E>(set1);
        	result.addAll(set2);
        	
			return result;
        	
        	
        	
        	
        }



	
    	
    	
    }
	

