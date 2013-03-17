// CS1020 (AY2012/3 Semester 2)
// Name: Wong Shen Nan
// Matric. No.: A0097498
// Lab group: 
// Program Description: Converts date from UK format to American format.

import java.util.*;

class DateConvert {

	// Write your user-defined method(s) below.
	// Remember to add a description before the header of each such method.
	public static void check(int year){
        if(isLeapYear(year)){
            System.out.println(year+" is a leap year.");
    } else System.out.println(year+" is not a leap year.");
    }

	public static boolean isLeapYear(int year){
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			return true;
		} else return false;
    }

	public static void main(String[] args) {
		String month, day;
		int year;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter date in UK format: ");
		//sample: December 25, 2012
		month = sc.next();
		day = sc.next();
		year = sc.nextInt();
		System.out.print("Date in American format: ");
		//sample: 25 December 2012
		System.out.println(day.replace(",","") + " " + month + " " + year);
		check(year);
	}
}

