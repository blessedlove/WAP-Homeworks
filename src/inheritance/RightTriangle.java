package inheritance;
/**
 *  <h1>RightTriangle</h1>
 * this class implement Shape Interface 
 * Contain different methods that return compute area,
 * Circumference,Diagonal and draw the shape of RightTriangle.
 * 
 * @author Fikir Blessed
 * @since   2020-07-15
 */
public class RightTriangle implements Shape {
	
	/**
	 * base and height and base of RightTriangle
	 */
	private double base;
	private double height;
	private double hypotenuse=0;
	
	/**
	 * 
	 * @param base
	 * @param height
	 * the Triangle Accept base and height
	 */
	public RightTriangle(double base, double height) {
	
		this.base = base;
		this.height = height;
	}
/**
 * 
 * @return base of Triangle
 */
	public double getBase() {
		return base;
	}

	/**
	 * 
	 * @param base
	 * this method set base of RightTriangle
	 */
	public void setBase(double base) {
		this.base = base;
	}
/*
 *  returns height of Triangle
 */
	public double getHeight() {
		return height;
	}
/*
 *  @param base
	 * this method set height of triangle
 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * 
	 * @return hypotenuse of RightTriangle
	 */
public double getHypotenuse() {
		return hypotenuse;
	}

@Override
/**
  
 * this method compute the area of RightTriangle
	 * @param args Unused
	 * @return double This returns square of area of RightTriangle 
 */
public double computeArea() {
	// TODO Auto-generated method stub
	double area=(base*height)/2;
	
	return Math.floor(area);
}
@Override
/**
 * this method compute the Circumference of RightTriangle
	 * @param args Unused
	 * @return double This returns Circumference of RightTriangle
	 * 
 */
public double computeCircumference() {
	// TODO Auto-generated method stub
	double power=Math.pow(base, 2)+Math.pow(height, 2);
	
	double sqrt=Math.sqrt(power);

	
	return Math.floor(base+height+sqrt);
}
@Override
/**
 *  * this method compute the Circumference of Right Triangle
	 * @param args Unused
	 * @return double This returns hypotenuse of Right Triangle
	 * 
 */
public double computeDiagonal() {
	// TODO Auto-generated method stub
	double hypoten=Math.pow(height, 2)+Math.pow(base, 2);
	hypotenuse=Math.sqrt(hypoten);
	System.out.println(" Diagonal of the Right Triangle is hypotenuse  ");
	return hypoten;
}
@Override
public void draw() {
	// TODO Auto-generated method stub
	System.out.println(""
			+ " "+base +"and height"+ height);
	 int i, j; 
	  
     // outer loop to handle number of rows 
     //  n in this case 
     for(i=0; i<height; i++) 
     { 

         //  inner loop to handle number of columns 
         //  values changing acc. to outer loop     
         for(j=0; j<=i; j++) 
         { 
             // printing stars 
             System.out.print("-"); 
         } 

         // ending line after each row 
         System.out.println(); 
     } 
} 
	
}
	
	
	
	
	
	
	

	
	
	
	


