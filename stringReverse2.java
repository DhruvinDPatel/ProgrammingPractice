class Solution {
    public static String reverseStr(String s, int k) {
        
        char[] arr = s.toCharArray();
		int n = arr.length;
        
        if(k>=n)
            reverse_helper(arr, 0, n-1);
        else{
            reverse_helper(arr, 0, k-1);
        	
        	int j = 0;

            for(j = 2*k; j < n-k; j+=2*k){
		        reverse_helper(arr, j, j + k - 1);
            }

            if(j<n)
            	reverse_helper(arr, j, n-1);
        }
        
        return String.valueOf(arr);
	}
    
    public static void reverse_helper(char[] s, int i, int j){
        if(s == null || s.length == 1)
			return;
        
		while(i < j){
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
            i++;
            j--;
		}
	}

	public static void main(String[] args){

		String s1 = "hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl";

		System.out.println(reverseStr(s1, 39));
	}
}