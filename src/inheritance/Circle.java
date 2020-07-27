package inheritance;
/**
 *  <h1>Circle</h1>
 * this class implement Shape Interface Contain different methods that return compute area,
 * Circumference,Diagonal and draw the shape of Circle.
 * 
 * @author Fikir Blessed
 * @since   2020-07-15
 */

public class Circle implements Shape{
	/**
	 *  Radius of Circle
	 */
	private double  radius;
	/**
	 * 
	 * @param  Radius
	 * Circle should accept the Radius as parameter
	 */

	public Circle(double  radius) {
		 
		this.  radius =  radius;
	}
	/**
	 * 
	 * @return   Radius of Circle
	 */
	public double getradius() {
		return  radius;
	}
	/*
	 * set  Radius of the Circle
	 */
	public void setradius(double  radius) {
		this.radius =  radius;
	}
	@Override
	/**
	 * 	
	 * this method compute the area of Circle
	 * @param args Unused
	 * @return double This returns 3.14* of Radius*Radius; 
	 * and it Rounds the result
	 * .
	 */
	 
	public double computeArea() {
		// TODO Auto-generated method stub
	
		  double area=Math.PI*(radius*radius);
		return Math.floor(area);
	}
	@Override
	/**
	 * 	
	 * this method compute the area of Circle
	 * @param args Unused
	 * @return double This returns 2*(3.14*radius); 
	 * .
	 */
	public double computeCircumference() {
		// TODO Auto-generated method stub
	
		double perimiter=2*Math.PI*radius;
		return Math.floor(perimiter);
	}
	@Override
	/**
	 * 	
	 * this method compute the area of Circle
	 * @param args Unused
	 * @return double This returns 2*radius; 
	 * .
	 */
	public double computeDiagonal() {
		// TODO Auto-generated method stub
		System.out.println(" Diagonal of the Circle is Diameter of Circle  ");
		  double diameter=2*radius;
		return Math.floor(diameter);
	}
	@Override
	/**
	 
     * This is the draw method which makes use of print the shape of Circle.
   * @param args Unused.
   * @return Nothing.
   *
     */
	
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("  radius "
				 + radius);
		
		 double distance;
		for (int i = 0; i <= 2 * radius; i++) { 
			  
		    
		    for (int j = 0; j <= 2 * radius; j++) { 
		    	distance = Math.sqrt((i - radius) * (i - radius) + 
		                         (j - radius) * (j - radius)); 
		  
		      
		        if (distance > radius - 0.5 && distance < radius + 0.5) 
		        System.out.print("-"); 
		        else
		        System.out.print(" "); 
		    } 
		  
		    System.out.print("\n"); 
		    } 
		
	}
	
	
	

}
