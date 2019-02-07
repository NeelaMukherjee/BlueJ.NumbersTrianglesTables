 import java.util.Scanner;
 //import java.util

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        
        String s="";
        
        for (int i=0; i<numberOfStars ;i++){
            
             s=s+"*";
        }
        
        return s;
    }
    
    public static String getTriangle(int numberOfRows) {
        
        String s="";
        
        for (int i=0;i<numberOfRows;i++){
          for (int j=0; j<=i;j++){
              
              s=s+"*";
            }
            
            s=s+"\n";
        
        }
        
        return s;
    }


    public static String getSmallTriangle() {
        
        String s= TriangleUtilities.getTriangle(4);
        
        return s;
    }

    public static String getLargeTriangle() {
        String s= TriangleUtilities.getTriangle(9);
        
        
        return s;
    }
}
