import java.util.*;

class Set {

	private ArrayList<Integer> members;

	// Constructors
	public Set(){

	}

	// toString() method
	public String toString() {
		return "[" + +","++ "]";
	}

	// Return true if 'this' is a subset of 'set', 
	// otherwise return false.
	//  
	public boolean isSubset(Set set) {
		int[] Subset = (Set) this;
		for(int z = 0, z<set.length-1, z++){
			for(int u=0, u<)
			Subset[z].equals
		}
		return true; // this is a stub
	}
}

// This program reads two sets of integers A and B, and determines
// if A is a subset of B, and if A is same as B.
class TestSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list;

		System.out.print("Enter number of elements in set A: ");
		Set setA = new Set(sc.nextInt());
		System.out.print("Enter elements in set A:")
		for(int i = 0, i<setA.size()-1, i++){
			setA[i] = sc.nextInt();
		}
		System.out.print("Enter number of elements in set B: ");
		int setB = sc.nextInt();



		if (setA.isSubset(setB)) {
			System.out.println("Set A is a subset of set B.");
		}
		else {
			System.out.println("Set A is not a subset of set B.");
		}
	}

} 
