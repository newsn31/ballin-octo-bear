//iterative sumOfSquares
public class sumOfSquares {
	int sumOfSquares(int m, int n){
		int i, sum;
		sum = 0;
		for (i = m; i <= n; i++){
			sum+=i*i;
		}
		return sum;
	}
	
	public static void main(String [] args){
		sumOfSquares s = new sumOfSquares();
		int sum = s.sumOfSquares(0, 5);
		System.out.println(sum);
	}
}