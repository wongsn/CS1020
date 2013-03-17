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
		ArrayList<Integer> distance = new ArrayList<Integer>(Math.pow(2,size));
		for(int i=0; i<size-1; i++){
			points.add(i, Point(sc.nextInt(), sc.nextInt()));		
				}

		//Map method
		//Quicksort method
		// total number of combinations =  2^n
		for(int j=0; j<size-1; j++){
			distance(points[j] = distance[j]
		}

		System.out.printf("Minimum distance = %.2f\n", minDist);
	}
}
