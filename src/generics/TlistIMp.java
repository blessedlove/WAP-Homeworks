package generics;

public abstract class TlistIMp<T,E> implements TmyList<T,E>{
   
	
	  T item1;
	  E item2;
	  
	public TlistIMp(T item1, E item2) {
	
		this.item1 = item1;
		this.item2 = item2;
	}
	public T getItem1() {
		return item1;
	}
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	public E getItem2() {
		return item2;
	}
	public void setItem2(E item2) {
		this.item2 = item2;
	}
	  
	  
	 

	

    
    
    
}