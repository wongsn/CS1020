import java.lang.Math.*;
import java.util.*;

class WashersV2 {

public static double circle_area(double diameter){
	diameter = Math.pow(diameter/2, 2) * Math.PI;
	return diameter;
}

public static void main(String[] args){
	double d1, d2, thickness, density;
	int qty;
	double unit_weight, total_weight, rim_area;

//Scan inputs
	Scanner sc = new Scanner(System.in);
	System.out.print("Inner diameter in cm: ");
	d1 = sc.nextDouble();
	System.out.print("Outer diameter in cm: ");
	d2 = sc.nextDouble();
	System.out.print("Thickness in cm: ");
	thickness = sc.nextDouble();
	System.out.print("Density in grams per cubic cm: ");
	density = sc.nextDouble();
	System.out.print("Quantity: ");
	qty = sc.nextInt();
//End input scan

//Compute weight
	rim_area = circle_area(d2) - circle_area(d1);
	unit_weight = rim_area * thickness * density;
    total_weight = unit_weight * qty;
//Output
	System.out.printf("Total weight of %d washers is %.2f grams.",qty,total_weight);
}

}
