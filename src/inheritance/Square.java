package inheritance;
/**
 *  <h1>Square</h1>
 * this class implement Shape Interface Contain different methods that return compute area,
 * Circumference,Diagonal and draw the shape of Square.
 * 
 * @author Fikir Blessed
 * @since   2020-07-15
 */


public class Square implements Shape{
	/**
	 
	   * The side  of this Square.
	   */
		 
		private double  side;
	
		
		/**
		 * 
		 * @param side
		 * the square should take the length or side of square
		 */
		public Square(double side) {
		
			this.side=side;
		}
/*
 * it returns the side of square
 */

		public double getSide() {
			return side;
		}
/**
 * 
 * @param side
 * this method set the side of square
 */

		public void setSide(double side) {
			this.side = side;
		}


		@Override
		/**
		
	 * this method compute the area of Square
	 * @param args Unused
	 * @return double This returns square of side 
	 * .
	 */
		
		public double computeArea() {
			// TODO Auto-generated method stub
			   
			return side*side;
		}


		@Override
		/**
		
	 * this method compute the Circumference of Square
	 * @param args Unused
	 * @return double This returns 4*side 
	 *
	 */
		 
		public double computeCircumference() {
			// TODO Auto-generated method stub
			  
			return 4*side;
		}


		@Override
		/**
		 * 
	 this method compute the Diagonal of Square
	 * @param args Unused
	 * @return double This returns square root of 2*side 
	 *
	 */
		
		public double computeDiagonal() {
			// TODO Auto-generated method stub
			   double squarediagonal=2*side;
			   squarediagonal=Math.sqrt(squarediagonal);
			   
			return Math.floor(squarediagonal);
		}


		@Override
		/**
		
	 
     * This is the draw method which makes use of print the shape of Square.
   * @param args Unused.
   * @return Nothing.
   *
     */
		
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("  side "+
					 side);
			
			 int i, j; 
	           
		        for (i = 1; i <= side; i++) 
		        { 
		            for (j = 1; j <= side; j++) 
		            { 
		                if (i == 1 || i == side ||  
		                    j == 1 || j == side)             
		                    System.out.print("-");             
		                else           
		                    System.out.print(" ");             
		            } 
		            System.out.println(); 
		        } 
		}} 
			
			
		
		




	
	


