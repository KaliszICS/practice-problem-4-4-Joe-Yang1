/**

        * File: Assumptions

        * Author: Joe Yang

        * Date Created: April 20, 2026

        * Date Last Modified: April 20, 2026

        */

public class PracticeProblem {

	public static void main(String args[]) {}

	public static boolean hasCapital(String word){

		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))){
				return true;
			}
			
		}

		return false;
	}

	public static boolean isPrime(int num){
		
		if (num <= 1){
			return false;
		}

		for (int i = 2; i < num; i++) {
		if (num % i == 0){
			return false;
		}
	}
	return true;
}

}
