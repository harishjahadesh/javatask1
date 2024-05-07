package guvitask;

public class smallestexp { 
	public static void main(String[] args) {
		int first = 9;
		int second = 7;
		int third = 6;
		if (first<second && first<third) {
			System.out.println("smallest number : "+first);
			
		} else if(second<first && second<third){
			System.out.println("smallest number : "+second);
		}else {
			System.out.println("smallest number : "+third);
		}
	}

}
