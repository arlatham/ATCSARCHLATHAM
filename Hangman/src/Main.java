import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		char[] word = startGame();
		int wordlen = word.length;
		int stage = 1;
		char[] board = buildBoard(wordlen);

		for (int i = 0; i < wordlen + 6; i++) {
			char letter = getMove();
			boolean inside = checkMove(word, wordlen, letter);
			stage = changeStage(inside, stage);
			board = changeBoard(word, board, wordlen, letter);
			displayMan(stage);
			displayBoard(board, wordlen);
			String wordup = new String(board);
			if (!(wordup.contains("#"))) {
				System.out.println("");
				System.out.println("YOU WIN!");
				break;
			}

			if (stage == 7) {
				System.out.println("");
				System.out.println("YOU LOSE!");
				break;
			}
		}
	}

	public static char[] startGame() {
		System.out.println("Lets play hangman");
		System.out.println("");
		System.out.println("Enter your word:");
		Scanner wordinput = new Scanner(System.in);
		String wordval = wordinput.next();
		char[] word = wordval.toCharArray();
		return word;
	}

	public static void displayMan(int stage) {
		if (stage == 1) {
			System.out.println("");
			System.out.println("|---¿--");
			System.out.println("|      ");
			System.out.println("|      ");
			System.out.println("|      ");
			System.out.println("|      ");
			System.out.println("|      ");
			System.out.println("|------");
		}
		if (stage == 2) {
			System.out.println("");
			System.out.println("|---¿--");
			System.out.println("|   O  ");
			System.out.println("|      ");
			System.out.println("|      ");
			System.out.println("|      ");
			System.out.println("|      ");
			System.out.println("|------");
		}
		if (stage == 3) {
			System.out.println("");
			System.out.println("|---¿--");
			System.out.println("|   O  ");
			System.out.println("|   |  ");
			System.out.println("|   |  ");
			System.out.println("|      ");
			System.out.println("|      ");
			System.out.println("|------");
		}
		if (stage == 4) {
			System.out.println("");
			System.out.println("|---¿--");
			System.out.println("|   O  ");
			System.out.println("|   |\\ ");
			System.out.println("|   |  ");
			System.out.println("|      ");
			System.out.println("|      ");
			System.out.println("|------");
		}
		if (stage == 5) {
			System.out.println("");
			System.out.println("|---¿--");
			System.out.println("|   O  ");
			System.out.println("|  /|\\ ");
			System.out.println("|   |  ");
			System.out.println("|      ");
			System.out.println("|      ");
			System.out.println("|------");
		}
		if (stage == 6) {
			System.out.println("");
			System.out.println("|---¿--");
			System.out.println("|   O  ");
			System.out.println("|  /|\\ ");
			System.out.println("|   |  ");
			System.out.println("|  /   ");
			System.out.println("|      ");
			System.out.println("|------");
		}
		if (stage == 7) {
			System.out.println("");
			System.out.println("|---¿--");
			System.out.println("|   O  ");
			System.out.println("|  /|\\ ");
			System.out.println("|   |  ");
			System.out.println("|  / \\ ");
			System.out.println("|      ");
			System.out.println("|------");
		}
	}

	public static void displayBoard(char[] board, int wordlen) {
		System.out.println("");
		for (int i = 0; i < wordlen; i++) {
			System.out.print(board[i]);
		}
		System.out.println("");
	}

	public static char[] buildBoard(int wordlen) {
		char[] board = new char[wordlen];
		for (int i = 0; i < wordlen; i++) {
			board[i] = '#';
		}
		return board;
	}

	public static char getMove() {
		System.out.println("");
		System.out.println("Make your guess:");
		Scanner letterinput = new Scanner(System.in);
		char letter = letterinput.next().charAt(0);
		return letter;
	}

	public static boolean checkMove(char[] word, int wordlen, char letter) {
		boolean inside = false;
		for (int i = 0; i < wordlen; i++) {
			if (word[i] == letter) {
				inside = true;
			}
		}
		return inside;
	}

	public static int changeStage(boolean inside, int stage) {
		if (inside == false) {
			System.out.println("");
			System.out.println("Incorrect guess");
			stage++;
		}
		if (inside == true) {
			System.out.println("");
			System.out.println("Correct guess");
		}
		return stage;
	}

	public static char[] changeBoard(char[] word, char[] board, int wordlen, char letter) {
		for (int i = 0; i < wordlen; i++) {
			if (word[i] == letter) {
				board[i] = letter;
			}
		}
		return board;
	}

}
