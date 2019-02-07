


public class NumberUtilities {

    public static String getRange(int stop) {
        String ran_ge = "";
        int i;
        
        for (i=0;i<stop;i++){
            
            ran_ge=ran_ge+i;
        
        }
            return ran_ge;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        int i;
        
        for (i=start;i<stop;i++){
            
            range=range+i;
        
        }
        
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        int i;
        
        for (i=start;i<stop;i=i+step){
            
            range=range+i;
        
        }
        
        return range;
    }

    public static String getEvenNumbers(int start, int stop) {
        
       
            
          String even ="";
          int i;
          
          if (start%2==0){
          
          for (i=start; i<stop; i=i+2) {
              
              even= even+i;
        }
    }
        
        else {
            
            for(i=start; i<stop; i=i+2){
                
               even = even+ (i+1);
            }
            
        }
        
        return even;
    }


    public static String getOddNumbers(int start, int stop) {
        String odd ="";
          int i;
          
          if (start%2==0){
          
          for (i=start; i<stop; i=i+2) {
              
              odd= odd+(i+1);
        }
    }
        
        else {
            
            for(i=start; i<stop; i=i+2){
                
               odd = odd+i;
            }
            
        }
        
        return odd;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String st="";
        int i;
        int power;
        
        for(i=start; i<=stop;i++){
            power=(int)Math.pow(i,exponent);
            st=st+power;
        }
        
        return st;
    }
}
