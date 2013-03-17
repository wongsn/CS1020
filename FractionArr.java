import java.util.*;

class FractionArr implements FractionI{
	
	/************** Data members **********************/
	private int[] members = new int[2];

	/************** Constructors **********************/
	// Default constructor creates a fraction 1/1
	public FractionArr() {
		this(1,1);
	}

	public FractionArr(int n, int d) {
		setNumer(n);
		setDenom(d);
	}


	public FractionI add(FractionI f){
		this.setDenom(this.getDenom() * f.getDenom());
		this.setNumer(this.getNumer() * f.getDenom() 
							+ f.getNumer() * this.getDenom());
	}
	public FractionI minus(FractionI f){
		this.setDenom(this.getDenom() * f.getDenom());
		this.setNumer(this.getNumer() * f.getDenom() 
					- f.getNumer() * this.getDenom());
	}
	public FractionI times(FractionI f){
		this.setNumer(this.getNumer() * f.getNumer());
		this.setDenom(this.getDenom() * f.getDenom());
	}
	public FractionI divide(FractionI f) throws ArithmeticException{
		this.setNumer(this.getNumer() * f.getDenom());
		this.setDenom(this.getDenom() * f.getNumer());
		if(this.getDenom()==0){
			throw new ArithmeticException("Division by zero error!");
		}
	}
	public FractionI simplify(){

		this.setNumer(this.getNumer()/gcd(this.getDenom(), this.getNumer()));
		this.setDenom(this.getDenom()/gcd(this.getDenom(), this.getNumer()));
		
	}
	/**************** Accessors ***********************/

	public int getNumer(){
		return members[0];
	}

	public int getDenom(){
		return members[1];
	}

	/**************** Mutators ************************/

	public void setNumer(int numer){
		members[0] = numer;
	}

	public void setDenom(int denom){
		members[1] = denom;
	}

	/***************** Other methods ******************/

	public int gcd(int first, int second){
		if(second ==0){
			return first;
		}
		else if(first%second==0){
			return second;
		} else {
			return gcd(second, first%second);
		}
	}

}
