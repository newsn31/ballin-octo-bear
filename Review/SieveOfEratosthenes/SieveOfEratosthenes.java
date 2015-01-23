//Sieve of Eratosthenes

import java.util.Scanner;
public class SieveOfEratosthenes {
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int value = Integer.parseInt(input.nextLine());
		returnPrimeNumbers(value);
	}
	
	
	public static void returnPrimeNumbers(int num){
		boolean array [] = new boolean[num];
		for (int i = 2; i*i < num; i++){
			if(!array[i]){
				for (int j = i; i*j < num; j++){
					array[i*j] = true;
				}
			}
		}
		for (int i = 1; i < num; i++){
			if (array[i]==false){
				System.out.print(i + " ");
			}
		}
	
	}
}