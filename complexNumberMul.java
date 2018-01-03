class Solution {
    public String complexNumberMultiply(String a, String b) {
        
        String[] a1 = a.substring(0,a.length()-1).split("\\+");
        String[] b1 = b.substring(0,b.length()-1).split("\\+");
        
        int l = Integer.valueOf(a1[0]), m = Integer.valueOf(a1[1]), o = Integer.valueOf(b1[0]), p = Integer.valueOf(b1[1]), realOfResult, complexOfResult;
        
        realOfResult = (l*o) - (m*p);
        complexOfResult = (l*p) + (m*o);
        
        //String sign = (complexOfResult > 0)?"+":"";
        
        return String.valueOf(realOfResult) + "+" + String.valueOf(complexOfResult) + "i";        
    }
}