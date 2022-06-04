package samplemavenproject;

public class CalculatorMaven {
	int result;
	int n,m;
	CalculatorMaven(int n,int m){
		this.n=n;
		this.m=m;
	}

	public int add(int n,int m) {  // addition method
		result = n+m;
		return result;
	}

	public int sub(int n,int m) {  // substraction method
		result = n-m;
		return result;
	}

	public int mul(int n,int m) {  // multiplication method
		result = n*m;
		return result;
	}

	public int div(int n,int m) {   // division method
		result = n/m;
		return result;
	}


	}

