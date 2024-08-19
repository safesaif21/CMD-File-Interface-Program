/**
 * This Class create the alerts which warn the user when they use a command
 * incorrectly
 * 
 * @author Saif Ali
 * @version 03/15/2022
 */
public class Alert extends Window {

	private String name;
	private static final int defaultLength = 5;
	private static final int defaultWidth = 45;
	private char[][] content;

	public Alert(HomeScreen display) {

		super(defaultLength, defaultWidth);
		this.name = "Alert" + display.getAlertNameNumber();
		display.setAlertNameNumber(1);
		this.content = new char[defaultLength][defaultWidth];

		for (int i = 0; i < defaultLength; i++) {

			for (int j = 0; j < defaultWidth; j++) {

				if (i == 0 && j == 0) {

					content[i][j] = '>';
				} else if (i == 0 || i == defaultLength - 1) {

					content[i][j] = '-';
				} else if (j == 0 || j == defaultWidth - 1) {

					content[i][j] = '+';
				} else {

					content[i][j] = ' ';
				}
			}
		}
		int m = 0;
		int k = 0;
		for (int i = 1; i < name.length() + 1; i++) {

			content[m][i] = name.charAt(k);
			k++;
		}
	}

	// start get methods

	public String getName() {

		return this.name;
	}

	// end get methods

	// start insert methods

	public void insertMissingTxtMessage() {

		int row = 2;
		int coll = 3;
		String message = "FILENAMES MUST INCLUDE .txt";

		for (int i = 0; i < message.length(); i++) {

			this.content[row][coll] = message.charAt(i);
			coll++;
		}
	}

	public void insertInvalidCommandMessage() {

		int row = 2;
		int coll = 3;
		String message = "INVALID COMMAND";

		for (int i = 0; i < message.length(); i++) {

			this.content[row][coll] = message.charAt(i);
			coll++;
		}
	}

	public void insertCloseByNameMessage() {

		int row = 2;
		int coll = 3;
		String message = "CLOSE DOCUMENTS BY NAME ONLY";

		for (int i = 0; i < message.length(); i++) {

			this.content[row][coll] = message.charAt(i);
			coll++;
		}
	}

	public void insertDocumentNotFoundMessage() {

		int row = 2;
		int coll = 3;
		String message = "DOCUMENT NOT FOUND";

		for (int i = 0; i < message.length(); i++) {

			this.content[row][coll] = message.charAt(i);
			coll++;
		}
	}

	// end insert methods

	public void updateHomeScreen(HomeScreen display) {

		char[][] homeScreenContent = display.getContent();

		int m = 0;
		for (int i = display.checkAlertStartingRow(); i < this.getLength() + display.getAlertStartingRow(); i++) {

			int k = 0;
			for (int j = display.checkAlertStartingColl(); j < this.getWidth() + display.getAlertStartingColl(); j++) {

				homeScreenContent[i][j] = this.content[m][k];
				k++;
			}
			m++;
		}
		display.setContent(homeScreenContent);
		display.increaseAlertStartingRow(7);
		display.increaseAlertStartingColl(20);
	}

	// start unused abstract methods

	public void write(String message) {
	}

	public void move(int l, int w, HomeScreen display) {
	}

	public void resize(int l, int w) {
	}

	// end unused abstract methods
}