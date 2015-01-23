//check whether a number is a power of two
import java.util.Scanner;

//bruteforce method
public class powerOfTwo{
	public static boolean isPowerOfTwo(int number){
		int square = 1;
        while(number >= square){
            if(number == square){
                return true;
            }
            square = square*2;
        }
        return false;
		}
		
	private static boolean isPowerOfTwo2(int number) {
        if(number <=0){
            throw new IllegalArgumentException("number: " + number);
        }
        if ((number & -number) == number) {
            return true;
        }
        return false;
    }

	/*
     * find if an integer number is power of 2 or not using bit shift operator
     */
  
    private static boolean isPowerOfTwo3(int number){
         if(number <=0){
            throw new IllegalArgumentException("number: " + number);
        }
        return ((number & (number -1)) == 0);
    }



	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int response = Integer.parseInt(input.nextLine());
		System.out.println(isPowerOfTwo(response));
		System.out.println(isPowerOfTwo2(response));
		System.out.println(isPowerOfTwo3(response));
	}
}