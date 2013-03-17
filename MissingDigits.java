import java.util.*;
import java.util.Arrays;

class MissingDigits { 

	//main class
	public static void main(String[] args){
		boolean[] arr = new boolean[10];
		Arrays.fill(arr,false);
		//initialise a boolean array of 10 values
		//fill all values with "true"
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = sc.nextInt();

		//take the number and parse it into the boolean array
		//check the first value and turn the index-value of the boolean array to true
		//if already true, go to next
		//if end, return result

		System.out.println("Missing digits in " + number + ": ");

		do{
				Arrays.fill(arr, number%10, number%10+1, true);
				number = number/10;
			} while(number!=0);

		for(int j=0; j<arr.length; j++){
			if(arr[j]==true){
				continue;
			} else{
			System.out.print(j + " ");	
		}
	}


	}
}