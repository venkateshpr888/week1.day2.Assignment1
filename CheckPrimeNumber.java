package week1.day2.assignments;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		int input=13;
		boolean flag=false;
		for (int i = 2; i<input/2 ; i++) {
			while(input%i==0)
			{flag=true;	
            break;
				
			}
		}if (flag==true) {
               System.out.println(input+" " + "= prime number");
			} else {System.out.println(input+" " + "= not a prime number");}
			
		
	}
}
		

	


