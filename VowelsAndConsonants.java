public class VowelsAndConsonants {
	public static void main(String[] args) {

		String name = "Welcome";
		int vowelsCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U') 
				vowelsCount++;
			else 
				consonantCount++;
		}
		System.out.println(vowelsCount);
		System.out.println(consonantCount);

	}
}
