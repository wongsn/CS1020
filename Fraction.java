// Practice

import java.util.*;

class Fraction {
	private int numer;
	private int denom;

	public int Fraction(){
		this(1,1);
	}

	public int Fraction (int n, int d){
		this.numer = n;
		this.denom = d;
	}

	public static Fraction simplify(){
		if(this.denom%2==0 && this.numer%2==0){
			this.denom/= 2;
			this.numer/= 2;
		} else if (this.denom%this.numer==0){
			int temp = this.numer;
			this.denom/= temp;
			this.numer/= temp;
		} else if (this.denom%3==0 && this.numer%3==0){
			this.denom/= 3;
			this.numer/= 3;
		}
	}

	public add(Fraction f){
		int tmp = this.numer + f.numer;
		int tmp2 = this.denom + f.denom;
		Fraction added = new Fraction(tmp,tmp2);
		return added.simplify();
	}

	public String toString(){
		return getNumer + "," + getDenom;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Fraction){
			Fraction frac = (Fraction) obj;
			return this.getNumer == frac.getNumer;
		} else 
			return false;
	}

	
}

