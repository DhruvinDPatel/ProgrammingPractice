class Solution {
    public boolean isPalindrome(String s) {
        
        if(s == null)
            return false;
        
        if(s.length() == 0)
            return true;
        
        s = s.replaceAll("[^0-9A-Za-z]","").toLowerCase();
        
        int n = s.length();
        
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != s.charAt(n-i-1))
                return false;
        }
        
        return true;
    }
}
