package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int num = 11;

		boolean isPrime = true;

		if(num <= 1) {
			isPrime = false;
		}else {
			for(int i=2; i < num ; i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if(isPrime)
			System.out.println(num + " is a Prime Number ");
		else
			System.out.println(num + " is NOT a Prime Number ");

	}

}
