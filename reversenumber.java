package guvitask;

public class reversenumber {
	public static void main(String[] args) {
		int number = 876;
		int reverse = 0;
		while (number!=0) {
			reverse=reverse*10+number%10;
			number=number/10;
		}
		System.out.println("reverse number: " + reverse);
	}

}
