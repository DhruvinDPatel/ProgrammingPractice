import java.util.HashMap;

public class isomorphicStrings{

	public static boolean isIsomorphic(String s1, String s2){

		if(s1==null || s2==null)
			return false;

		if(s1.length() != s2.length())
			return false;

		HashMap<Character, Character> hm = new HashMap<Character, Character>();

		for(int i = 0; i < s1.length(); i++){

			char ch1 = s1.charAt(i);
			char ch2 = s2.charAt(i);

			if(hm.containsKey(ch1)){
				if(hm.get(ch1)!=ch2)
					return false;
			}else{
				if(hm.containsValue(ch2))
					return false;
				hm.put(ch1, ch2);
			}
		}

		return true;
	}

	public static void main(String[] args){

		String t1 = "abcdabccaabb";
		String t2 = "mnopmnoommnn";

		System.out.println(t1 + " & "+ t2 + " isomorphic test:" + String.valueOf(isIsomorphic(t1,t2)));
	}	
}