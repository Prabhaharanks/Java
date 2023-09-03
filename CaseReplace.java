public class CaseReplace {
	public static void main(String[] args) 
	{    
	String s="MuTHu LaksHMi";    
	StringBuffer str=new StringBuffer(s);    
	for(int i = 0; i < s.length(); i++) 
	{    
	if(Character.isLowerCase(s.charAt(i)))   
	str.setCharAt(i, Character.toUpperCase(s.charAt(i)));    
	else if(Character.isUpperCase(s.charAt(i))) 
	{    
	str.setCharAt(i, Character.toLowerCase(s.charAt(i)));    
	}    
	}    
	System.out.println("String after case conversion : " + str);    
	}    
	}   
