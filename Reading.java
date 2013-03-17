// CS1020 (AY2012/3 Semester 2)
// Name: Wong Shen Nan
// Matric. No.: A0097498A
// Lab group: 
import java.util.*;

class Reading {

	public static int solve(String ops, int x, int y){
		if(ops.contains("ADD")){
			return x + y;
		} if (ops.contains("MUL")){
			return x * y;
		} if(ops.contains("SUB")){
			return x - y;
		}
		return 0;
	}

	public static void main(String[] args) {
	int[] solution, notlimitSol;
	
	Scanner sc = new Scanner(System.in);
	String input = sc.next();
	int num_ops = sc.nextInt();
	solution = new int[num_ops];
	notlimitSol = new int[100];

	if(input.contains("LIMIT")){
		if(num_ops<=0){
		} else{
		for(int i=0; i<num_ops; i++){
			String operation = sc.next();
			int lim1 = sc.nextInt();
			int lim2 = sc.nextInt();
			solution[i] = solve(operation, lim1, lim2);
		}
		for(int solved: solution) {
			System.out.println(solved);
		}
	}
	}
	 else if(input.contains("SENTINEL")){
			int count = 0;
		do{
			for(int k = 0; k<notlimitSol.length; k++){
			String operation = sc.next();
			int sen1 = sc.nextInt();
			int sen2 = sc.nextInt();
			count++;
			notlimitSol[k] = solve(operation, sen1, sen2);
		}
	}while(!sc.next().contains("-1"));
			for(int j=0; j<count; j++){
				System.out.println(notlimitSol[j]);
			}
	}

	 else if(input.contains("EOF")){
	 	int count = 0;
		while(sc.hasNext()) {
			for(int k = 0; k<notlimitSol.length; k++){
			String operation = sc.next();
			int eof1 = sc.nextInt();
			int eof2 = sc.nextInt();
			count++;
			notlimitSol[k] = solve(operation, eof1, eof2);
		}
		}	for(int j=0; j<count; j++){
				System.out.println(notlimitSol[j]);
			}
}
}
}
