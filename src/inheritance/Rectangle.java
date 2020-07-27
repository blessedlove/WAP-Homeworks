package inheritance;

/**
 *  <h1>Rectangle</h1>
 * this class implement Shape Interface 
 * Contain different methods that return compute area,
 * Circumference,Diagonal and draw the shape of Rectangle.
 * 
 * @author Fikir Blessed
 * @since   2020-07-15
 */

public class Rectangle implements Shape{
	
	/**
	 
   * The length and width  of this Rectangle.
   */
	 
	private double  length;
	
	private double width;
	
	/**
	 * 
	 * @param length
	 * @param width
	 * 
	 * the Rectangle should include length and width
	 */

	public Rectangle(double length, double width) {
	
		this.length = length;
		this.width = width;
	}

	/*
	 * return length of Rectangle
	 */
	public double getLength() {
		return length;
	}
/**
 * 
 * @param length
 * the method uses to set length of Rectangle
 */
	public void setLength(double length) {
		this.length = length;
	}
/*
 * it returns the width of Rectangle
 */
	public double getWidth() {
		return width;
	}
/**
 * 
 * @param width
 * the method uses to set width of Rectangle
 */
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	/**
	 * this method compute the area of rectangle
	 * @param args Unused
	 * @return double This returns multiplication 
	 * of length and width.
	 */
	public double computeArea() {
		// TODO Auto-generated method stub
		  System.out.print(" Area of the Rectangle  ");
		return length*width;
	}

	@Override
	/**
	 * this method compute the Circumference of rectangle
	 * @param args Unused
	 * @return double in This returns (length+width)*2
	 *
	 */
	public double computeCircumference() {
		// TODO Auto-generated method stub
		double perimeter=(length+width)*2;
		  System.out.print(" perimeter of the Rectangle  ");
		return perimeter;
	}

	@Override
	/**
	 * this method compute the Diagonal of rectangle
	 * @param args Unused
	 * @return double in This returns square root of 
	 * (length*length+width*width)
	 * i use Math.floor for Rounding purpose 
	 * 
	 */
	public double computeDiagonal() {
		// TODO Auto-generated method stub
		  double squareofTwo=Math.pow(length, 2)+Math.pow(width, 2);
		  double diagonal =Math.sqrt(squareofTwo);
		  System.out.print(" diagonal of the Rctangle  ");
		   return    Math.floor(diagonal) ;
	}

	@Override
    /**
     * This is the draw method which makes use of print the shape of Rectangle.
   * @param args Unused.
   * @return Nothing.
   *
     */
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(" width "
				+ " "+width +"and length"+ length);
		int i, j; 
        for (i = 1; i <= length; i++) 
        { 
            for (j = 1; j <= width; j++) 
            { 
                if (i == 1 || i == length ||  
                    j == 1 || j == width)             
                    System.out.print("-");             
                else
                    System.out.print(" ");             
            } 
            System.out.println(); 
        } 
    } 
		
	}
	
	


