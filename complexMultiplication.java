class Solution {
    public static String complexNumberMultiply(String a, String b) {
        
    	// string should be in (+-a +- bi)
    	//s = s.replaceAll("+-","-");

        String[] a1 = a.substring(0,a.length()-1).split("[+-]");
        String[] b1 = b.substring(0,b.length()-1).split("[+-]");
        
       	int l = 0, m = 0, o = 0, p = 0, realOfResult = 0, complexOfResult = 0;

       	if(a1.length == 3){
       		l = Integer.valueOf(a1[1]);
       		m = Integer.valueOf(a1[2]);
       	}else{
       		l = Integer.valueOf(a1[0]);
       		m = Integer.valueOf(a1[1]);
       	}

       	if(b1.length == 3){
       		o = Integer.valueOf(a1[1]);
       		p = Integer.valueOf(a1[2]);
       	}else{
       		o = Integer.valueOf(a1[0]);
       		p = Integer.valueOf(a1[1]);
       	}
        
        realOfResult = (l*o) - (m*p);
        complexOfResult = (l*p) + (m*o);
        
        String sign = (complexOfResult > 0)?"+":"";
        
        if(complexOfResult == 0)
        	return String.valueOf(realOfResult);
        else
        	return String.valueOf(realOfResult) + sign + String.valueOf(complexOfResult) + "i";
    }

    public static void main(String[] args){

    	String a1 = "1+1i", b1 = "1-1i";

    	String r = complexNumberMultiply(a1,b1);
    	System.out.println(r);
    }
}