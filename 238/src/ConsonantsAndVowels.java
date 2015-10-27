import java.util.*;

public class ConsonantsAndVowels {
	
	private static Random rand = new Random();
	
	public static void main(String[] args) {
		String consonants = "bcdfghjklmnpqrstvwxyz";
		String vowels = "aeiou";
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any string of the letters c and v, uppercase or lowercase.");
		String str = scanner.nextLine();
				
		List<Character> letters = new ArrayList<Character>();
		for (char c : str.toCharArray()) {
			  letters.add(c);
		}
		
		for (char c : letters) {
			char output;
			switch (c) {
			case 'c' : output = RandomSelect(consonants); break;
			case 'C' : output = (char) (RandomSelect(consonants) -32); break;
			case 'v' : output = RandomSelect(vowels); break;
			case 'V' : output = (char) (RandomSelect(vowels) -32); break;
			default: throw new RuntimeException();
			}
		
			System.out.print(output);
		}
	}
	
	public static char RandomSelect(String s){
		return s.charAt(rand.nextInt(s.length()));
	}
}
