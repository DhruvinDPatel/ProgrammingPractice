class Solution {
    public int myAtoi(String str) {
        
        if(str == null || str.length() < 1)
            return 0;
        
        str = str.trim();
        
        boolean positive = true;        
        int i = 0, n = str.length();
        double result = 0;
        
        if(str.charAt(0) == '+')
            i++;
        else if(str.charAt(0) == '-'){
            positive = false;
            i++;
        }
        
        while( i < n ){
            char temp = str.charAt(i++);
            if( temp >= '0' && temp <= '9')
                result = 10 * result + (temp - '0');
            else
                break;
        }
        
        if(!positive)
            result = -result;
        
        if(result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        return (int) result;
    }
}