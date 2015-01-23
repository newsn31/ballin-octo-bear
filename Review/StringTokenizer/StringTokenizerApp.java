//StringTokenizer
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizerApp{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		//nextLine because it allows you to press return to enter series.
		int numSamples = Integer.parseInt(input.nextLine());
		String series = input.nextLine();
		StringTokenizer st = new StringTokenizer(series);
        
		int [] array = new int[numSamples];
		int j = 0;
		int sum = 0;
		while (st.hasMoreTokens()){
			array[j] = Integer.parseInt(st.nextToken());
			j++;
		}
		for (int x: array){
			//System.out.println(x);
            sum += x;
		}
		//numSamples+1 because the series that is entered by the user is missing an item. 
		int expected = (numSamples+1)*(array[0] + array[numSamples-1])/2;
		
		//difference between expected and actual will be the missing item.
		System.out.println(expected-sum);
	}
}