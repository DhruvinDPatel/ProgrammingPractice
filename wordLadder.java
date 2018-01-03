import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class WordStep{
	String word;
	int numSteps;

	public WordStep(String s, int numSteps){
		this.word = word;
		this.numSteps = numSteps;
	}
}

public class wordLadder{

	public static int ladderPathLength(String startWord, String endWord, List<String> wordDict){

		LinkedList<WordStep> queue = new LinkedList<WordStep>();
		queue.add(new WordStep(startWord, 1));

		wordDict.add(endWord);

		while(!queue.isEmpty()){
			WordStep top = queue.remove();
			String word = top.word;

			if(word.equals(endWord))
				return top.numSteps;

			char[] arr = word.toCharArray();
			for(int i = 0; i < arr.length; i++){
				for(char c = 'a'; c <= 'z'; c++){
					char temp = arr[i];
					if(arr[i] != c)
						arr[i] = c;

					String newWord = new String(arr);
					if(wordDict.contains(newWord)){
						queue.add(new WordStep(newWord, top.numSteps + 1));
						wordDict.remove(newWord);
					}
					arr[i] = temp;	
				}
			}
		}
		return 0;
	}

	public static void main(String[] args){

		String beginWord = "hit", endWord = "cog";
		List<String> wordList = ["hot","dot","dog","lot","log","cog"];

		System.out.println(String.valueOf(ladderPathLength(beginWord, endWord, wordList)));
	}
}