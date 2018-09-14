import java.util.Scanner;
public class haha {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String word;
		do {
			System.out.print("Enter a word: ");
			word = keyboard.nextLine();
			
			int number = word.length() - 1;
			while (n>=0) {
				System.out.print(word.charAt(number));
				number--;
			}
			System.out.println();
		}
		while (!word.equals("quit"));
	}

}
