package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num1 = 0;
	int num2 = 1;
	System.out.println(num1);
	
	for (int i = 0; i<= 11; i++) {
		
		int sum = num1 + num2;
		num1=num2;
		num2=sum;
		System.out.println(sum);
			
	}
	}

}
