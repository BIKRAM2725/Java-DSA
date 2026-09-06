class Solution { 
    public int fib(int n) { 
         
        int ans = 0; 
        int a = 0; 
        int b = 0; 
 
        for (int i = 0; i <= n; i++) { 
            
            int temp = 0; 
     
            if (i == 0) { 
                a = 0; 
                ans = 0;
            } 
            else if (i == 1) { 
                a = 0; 
                b = 1; 
                ans = 1;
            } 
            else { 
                temp = ans; 
                ans = a + b; 
                a = b; 
                b = ans; 
            } 
        } 
        
        return ans;    
    } 
}