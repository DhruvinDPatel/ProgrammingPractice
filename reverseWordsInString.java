import java.util.Arrays;
import java.lang.IllegalArgumentException;

public class reverseWordsInString{

	public static void reverseWords(char[] s){

		int i = 0;
		int n = s.length;

		for(int j = 0; j < s.length; j++){

			if(s[j] == ' '){
				reverse_helper(s, i, j - 1);
				i = j + 1;
			}
		}

		// for the last word
		reverse_helper(s, i, n-1);

		// reverse individially reversed words
		reverse_helper(s, 0, n - 1);
	}

	public static void reverse_helper(char[] s, int i, int j){
		while(i < j){
			char temp = s[i];
			s[i++] = s[j];
			s[j--] = temp;
		}
	}
	public static void main(String[] args){

		char[] s1 = "the sky is blue".toCharArray();

		reverseWords(s1);

		System.out.println(Arrays.toString(s1));
	}	
}