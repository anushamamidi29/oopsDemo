package com.valuemomentum.traning.exceptionhandling;

public class ExceptionCatch {

	public static void main(String[] args) {
int num1=10;
int num2=0;
int result=0;
int arr[]=new int[5];
try {
	arr[0]=0;
	arr[1]=1;
	arr[2]=2;
	arr[3]=3;
	arr[4]=4;
	result=num1/num2;
	System.out.println("rresult of division:"+result);
	
}catch(ArithmeticException e) {
	System.out.println("error:Divided by Zero");
}
	}

}
