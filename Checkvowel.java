import java.util.Scanner;
class Checkvowel
{
   public static void main(String[ ] arg)
   {
	boolean isVowel=false;;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a character : ");
	char ch=scanner.next().charAt(0); 
	scanner.close();
	switch(ch)
	{
	   case 'a' :
	   case 'e' :
       case 'i' :
	   case 'o' :
	   case 'u' :
	   case 'A' :
	   case 'E' :
	   case 'I' :
	   case 'O' :
	   case 'U' :
	       System.out.println(ch+" is a vowel");
	       break;
	   default :
	       System.out.println(ch+ " Is a consonant");
	}
   }
}
