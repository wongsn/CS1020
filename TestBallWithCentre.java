import java.util.*;
import java.awt.*;

class TestBallWithCentre {
	// This method reads ball's input data from user, creates
	// a ball object, and returns it to the caller.
	public static BallWithCentre readBall(Scanner sc) {

		System.out.print("Enter colour, radius and centre: ");
		String inputColour = sc.next();
		double inputRadius = sc.nextDouble();
		int centre_x = sc.nextInt();
		int centre_y = sc.nextInt();
		return new BallWithCentre(inputColour, inputRadius, centre_x, centre_y);

	}

	public static BallWithCentre compareBall(BallWithCentre c1, BallWithCentre c2){
		if(c1.getRad()<c2.getRad()){
			return c2;
		}

		else if(c1.getRad()>c2.getRad()) {
			return c1;
		}

		else return c1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read input and create 1st ball object
		System.out.println("1st ball");
		BallWithCentre b1 = readBall(scanner);

		// Read input and create 2nd ball object
		System.out.println("2nd ball");
		BallWithCentre b2 = readBall(scanner);

		// Read input and create 3rd ball object
		System.out.println("3rd ball");
		BallWithCentre b3 = readBall(scanner);

		System.out.println();

		if(b1.equals(b2)){
		System.out.println("1st and 2nd balls are the same.");
		}
		else{
		System.out.println("1st and 2nd balls are not the same.");
		}

		System.out.println("The largest ball created is:");
		System.out.println(compareBall(compareBall(b1,b2),b3).toString());

	}
}
