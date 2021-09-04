package com.exercise1;
import java.util.Scanner;
public class ClassSolution {
	
	public static int calculateSum(int number) {
		int sum=0;
		for(int i=1;i<=number;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :");
		int N=sc.nextInt();
		System.out.println(calculateSum(N));

	}

}



