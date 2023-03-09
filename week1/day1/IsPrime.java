package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		boolean yPrime = true;
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
			System.out.println("Non Prime Number");
			yPrime = false;
			break;
		}
	}
			
		if(yPrime) {
			
			System.out.println("Prime Number");
		
		}

}
}


