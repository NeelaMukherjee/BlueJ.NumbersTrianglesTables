 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String s=TableUtilities.getMultiplicationTable(5);
        
        return s;
    }

    public static String getLargeMultiplicationTable() {
        return TableUtilities.getMultiplicationTable(10);
        
        //return s;
        
    }

    public static String getMultiplicationTable(int tableSize) {
        String s="";
        
        
        for (int i=1;i<=tableSize;i++){
            
            for(int j=1;j<=tableSize;j++) {
                
              s=s+String.format("%3d",(i*j))+" |"; 
              
              
            }
            s=s+"\n";
        }
        
        return s;
    }
}
