//Check whether or not the items of an array are part of another array
//Check to see whether or not they are in the same sequence

public class Checker {

	public static void main(String [] args){
		int array = new int {1, 2, 4, 5, 7, 8};
		int pattern = new int {4, 5, 7};
	
		System.out.println(check(array, pattern));
	
	}
	
	public static boolean check(int [] array, int [] pattern){
		boolean status = false;
		int start = pattern[0];
		
		for (int i = 0; i < array.length; i++){
			if (array[i] == start){
				status = true;
				for (int j = 0; j < pattern.length; j++){
					if (!pattern[j]==array[i+j]){
						status = false;
					}
				}
			}
		}
		return status;
	}
}


