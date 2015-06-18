import java.util.Scanner;


public class VoterAgeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
         System.out.print("Enter Your Age : ");
         int age =18;
         age = in.nextInt();
         if (age == 18)
             System.out.println("You are Eligible to Vote");
       else if (age<18)
             System.out.println("You are too young to vote");
       else if(age>18){
    	   System.out.println("You are eligible to vote");
    	   
       }
	}

}
