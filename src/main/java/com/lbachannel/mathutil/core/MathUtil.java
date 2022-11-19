package com.lbachannel.mathutil.core;

public class MathUtil {
    
    public static long getFactory(int n){
        
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20");
        
        if(n == 0 || n == 1)
            return 1;
        
        return n * getFactory(n - 1); // đệ quy
    }
}
