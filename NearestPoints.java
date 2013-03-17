// To compute the distance of the nearest pair of points
// in a list of points.

import java.util.*;
import java.awt.*;

class NearestPoints {
	public double distance(Point a, Point b){
		return Math.sqrt(Math.sq(a.x - b.x) + Math.sq(a.y - b.y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double minDist;

		int size = sc.nextInt();  // size of list;

		ArrayList<Point> points = new ArrayList<Point>(size);

		for(int i=0; i<size; i++){
					
				}


		System.out.printf("Minimum distance = %.2f\n", minDist);
	}
}
