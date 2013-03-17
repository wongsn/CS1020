import java.util.*;

class TestFraction {
	
	public Fraction checkFrac(Fraction n1, Fraction n2){
	if(n1.equals(n2)){
	return "The fractions are the same.";
	} else
	return "The fractions are not the same.";
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st fraction: ");
		int n1 = sc.nextInt();
		int d1 = sc.nextInt();

		System.out.println("Enter 2nd fraction: ");
		int n2 = sc.nextInt();
		int d2 = sc.nextInt();

		//formula to check for simplify
		Fraction frac_1 = new Fraction(n1,d1);
		Fraction frac_2 = new Fraction(n2,d2);

		System.out.println("1st fraction is: " + (frac_1.simplify()).toString());
		System.out.println("2nd fraction is: " + (frac_2.simplify()).toString());
		System.out.println(checkFrac(frac_1.simplify(),frac_2.simplify()));
		System.out.println("Sum is " + add(frac_1,frac_2).toString());


	}
}