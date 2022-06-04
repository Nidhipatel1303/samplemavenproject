package samplemavenproject;
import java.util.Scanner;
public class CalculatorDemoMaven {
public static void main(String[] args) {
			
		
			int a,b,output;
			Scanner sc=new Scanner(System.in);
			int n;
		while(true) {


			System.out.println("Enter any of the following operation:");
			System.out.println("1 : addition");
			System.out.println("2 : subtraction");
			System.out.println("3 : multiplication");
			System.out.println("4 : division");
			System.out.println("5 : exit");
			n= sc.nextInt();
			
		if(n==5) {
			System.out.println("exit");
			break;
		}
		else if(n>5) {
			System.out.println("invalid input");
		}
		else {
			System.out.println("Enter 1st number");
			a = sc.nextInt();
			System.out.println("Enter 2nd number");
			b = sc.nextInt();
			
			int answer=0;
			CalculatorMaven cal = new CalculatorMaven(a,b);
		
			switch(n) {
			case 1:
				answer = cal.add(a,b);
				System.out.println("result is" +answer);
				break;
			case 2:
				answer = cal.sub(a,b);
				System.out.println("result is" +answer);
				break;
			case 3:
				answer = cal.mul(a,b);
				System.out.println("result is" +answer);
				break;
			case 4:
				answer = cal.div(a,b);
				System.out.println("result is" +answer);
				break;

			default:
				System.out.println("wrong input. please try again");
			}
		}
		
		}
	}

			
	}
