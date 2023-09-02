public class RemoveWhiteSpace {  
      
    public static void main(String[] args)  {
    String s="Remove white spaces";    
    
    s = s.replaceAll("\\s+", "");    
        
    System.out.println("String after removing all the white spaces : " + s);    
}    
} 
