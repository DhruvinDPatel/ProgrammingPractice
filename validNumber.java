class Solution {
    public boolean isNumber(String s) {
        
        if(s == null || s.length() < 1)
            return false;
        
        s = s.trim();
        int i = 0, n = s.length();
        
        if(n == 0)
            return false;
        
        if(s.contains("e")){
            int eIndex = s.indexOf("e");
            if(eIndex == 0 || eIndex == n - 1)
                return false;
            boolean coef = checkDouble(s.substring(0, eIndex));
            boolean expo = checkInt(s.substring(eIndex + 1, n));
            
            if(coef && expo)
                return true;
            else
                return false;
        }else{
            return checkDouble(s);
        }
    }
    
    public boolean checkInt(String s1){
        
        int i = 0, n = s1.length();
        
        if(s1.charAt(0) == '+' || s1.charAt(0) == '-')
            if(++i == n)
                return false;
        
        while(i < n){
            char temp = s1.charAt(i++);
            if( temp >= '0' && temp <= '9')
                continue;
            else
                return false;
        }
        return true;
    }
    
    public boolean checkDouble(String s1){
        
        int i = 0, n= s1.length(), digitCounter = 0;
        
        if(s1.contains(".")){
            if(n < 2)
                return false;
            
            int isFloatCounter = 0;
            if(s1.charAt(0) == '+' || s1.charAt(0) == '-')
                if(++i == n)
                    return false;
        
            while(i < n){
                char temp = s1.charAt(i++);
                if( temp >= '0' && temp <= '9'){
                    digitCounter++;
                }
                else if( temp == '.'){
                    if(++isFloatCounter > 1)
                        return false;
                }
                else
                    return false;
            }
            if (digitCounter == 0)
                return false;
            else
                return true;
        }else{
            return checkInt(s1);
        }
    }
}