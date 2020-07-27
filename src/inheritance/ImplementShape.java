package inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Fikir Blessed
 *  @since   2020-07-15
 * this class is serve as Main class that execution of my program of 
 * all shapes
 * RightTriangle, Circle,Rectangle and Square
 * 
 */
public class ImplementShape {
	List<Shape> objects = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementShape im = new ImplementShape();
		im.objects.add(new Rectangle(5,7));
		im.objects.add(new RightTriangle(6,4));
		im.objects.add(new Square(5));
		
		im.objects.add(new Circle(6));
		
		im.shapescalcualate();
		
		

	}

	public void shapescalcualate() {
		if(objects == null || objects.isEmpty()) return;
	
		for(Shape s:objects) {
			 System.out.print( " the shape of the  "+ s.getClass().getSimpleName());
			  s.draw();
			 System.out.println();
			  System.out.println("area of "+s.getClass().getSimpleName()+" "+s.computeArea());
			  System.out.println("Circumference "+s.getClass().getSimpleName()+" "+ s.computeCircumference());
			  System.out.println("Diagonal of " +s.getClass().getSimpleName()+" "+s.computeDiagonal());
			  
			  
		}
		
	}
	


}
