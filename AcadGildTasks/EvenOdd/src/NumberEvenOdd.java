import java.util.Scanner;


public class NumberEvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("This program is to check whether number is even or odd?");
        System.out.print("Enter your choice  : ");
        int number =0;
        number = in.nextInt();
        if((number%2)==0) {
            System.out.println("The number "+number+" is EVEN "  );
        }
      else {
            System.out.println("The number is ODD :" +number);
	}

	}
}
