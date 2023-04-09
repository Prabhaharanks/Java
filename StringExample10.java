import java.util.Locale;  

public class StringExample10 {  

    public static void main(String[] args) {  

        String s = "hello string";    

        String turkish = s.toUpperCase(Locale.forLanguageTag("tr"));  

        String english = s.toUpperCase(Locale.forLanguageTag("en"));  

        System.out.println(turkish);

        System.out.println(english);  

    }  

}  
