import java.util.*;

public class Main {

	public static final int PLATFORM_OFFSET = 3;

	public static void main(String[] args) {

		Scanner testing = new Scanner(System.in);

		// Prompt for user input
		System.out.print("Enter the number of segments:  ");
		int segments = testing.nextInt();

		// Prompt for user input
		System.out.print("Enter the number of lines in each segment:  ");
		int lineNumbers = testing.nextInt();

		tree(segments, lineNumbers);
		base(segments, lineNumbers);

		// Need to properly close scanner to prevent memory leak
		testing.close();

	}

	public static void base(int segments, int totalLines) {
		int baseTrunkSpaces = segments - 1 + totalLines;
		for (int spaces = 0; spaces < baseTrunkSpaces; spaces++)
			System.out.print(" ");
		System.out.print("*\n");
		for (int spaces = 0; spaces < baseTrunkSpaces; spaces++)
			System.out.print(" ");
		System.out.print("*\n");

		int platformSpaces = baseTrunkSpaces - PLATFORM_OFFSET;

		for (int spaces = 0; spaces < platformSpaces; spaces++)
			System.out.print(" ");
		System.out.print("*******\n");

		// TODO calculate the maximum number of stars at bottom of base and use
		// conditionals to modify platform base so it's never as wide as lowest
		// line

		// If base 7 or less

		// IF base 5 or less
	}

	public static void tree(int segments, int totalLines) {
		for (int series = 1; series <= segments; series++) {

			int extraSpaces = segments - series;

			for (int currentLine = 0; currentLine < totalLines; currentLine++) {
				for (int spaces = 0; spaces < totalLines - currentLine + extraSpaces; spaces++)
					System.out.print(" ");
				int extraStars = currentLine + series - 1;
				for (int stars = 0; stars < (2 * extraStars + 1); stars++)
					System.out.print("*");
				System.out.println();
			}
		}
	}

}
