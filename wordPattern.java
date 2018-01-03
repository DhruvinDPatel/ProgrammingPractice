import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public static boolean wordPattern(String pattern, String str) {
        if(pattern==null || str==null)
			return false;
        
        //String[] str2 = str.trim().replaceAll("\\s+").split(' ');
        String[] str2 = str.split(" ");
        
        System.out.println(Arrays.toString(str2));

		if(pattern.length() != str2.length)
			return false;

		HashMap<Character, String> hm = new HashMap<Character, String>();

		for(int i = 0; i < str2.length; i++){

			char ch1 = pattern.charAt(i);
			String st1 = str2[i];

			if(hm.containsKey(ch1)){
				if(!hm.get(ch1).equals(st1)){
					return false;
				}
			}else{
				if(hm.containsValue(st1))
					return false;
				hm.put(ch1, st1);
			}
		}
        System.out.println(hm);
		return true;
    }

    public static void main(String[] args){

    	String p = "abba", s = "dog cat cat dog";
    	System.out.println(String.valueOf(wordPattern(p,s)));
    }
}

