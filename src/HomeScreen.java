/**
 * This Class create the display array which houses all the documents and Alerts.
 * @author Saif Ali
 * @version 03/15/2022
 */
import java.util.ArrayList;

public class HomeScreen extends Window{
	
	private static final int defaultLength = 100;
	private static final int defaultWidth = 200;
	private char[][] content;
	private static final String name = "Display";
	private int untitledDocumentNameNumber;
	private int documentStartingRow;
	private int documentStartingColl;
	private int alertNameNumber;
	private int alertStartingRow;
	private int alertStartingColl;
	
	public HomeScreen() {
		
		super(defaultLength, defaultWidth);
		
		this.content = new char[defaultLength][defaultWidth];
		this.untitledDocumentNameNumber = 1;
		this.documentStartingRow = 3;
		this.documentStartingColl = 5;
		this.alertNameNumber = 1;
		this.alertStartingRow = 7;
		this.alertStartingColl = 12;
		
		for(int i = 0; i < defaultLength; i++) {
			
			for(int j = 0; j < defaultWidth; j++) {
				
				if(i == 0 && j == 0) {
					
					this.content[i][j] = '>';
				}else if(i == 0 || i == defaultLength -1) {
					
					this.content[i][j] = '_';
				}else if(j == 0 || j == defaultWidth -1) {
					
					this.content[i][j] = '|';
				}
				else {
					
					this.content[i][j] = ' ';
				}
			}
		}
		int m = 0;
		int k = 0;
		for(int i = 1; i < name.length()+1; i++) {
			
			content[m][i] = name.charAt(k);
			k++;
		}
	}

	// start get methods
	
	public int getUntitledDocumentNameNumber() {
		
		return this.untitledDocumentNameNumber;
	}
	public int getDocumentStartingRow() {
		
		return this.documentStartingRow;
	}
	public int getDocumentStartingColl() {
		
		return this.documentStartingColl;
	}
	public int getAlertNameNumber() {
		
		return this.alertNameNumber;
	}
	public int getAlertStartingRow() {
		
		return this.alertStartingRow;
	}
	public int getAlertStartingColl() {
		
		return this.alertStartingColl;
	}
	public String getName() {
		
		return this.name;
	}
	public char[][] getContent() {
		
		return this.content;
	}
	// end get methods
	
	// start set methods
	
	public void setUntitledDocumentNameNumber(int i) {
		
		this.untitledDocumentNameNumber += i;
	}
	public void increaseUntitledDocumentStartingRow(int i) {
		
		this.documentStartingRow += i;
	}
	public void setContent(char[][] c) {
		
		this.content = c;
	}
	
	// end set methods
	
	// start increase methods
	
	public void increaseUntitledDocumentStartingColl(int i) {

		this.documentStartingColl += i;
	}
	public void setAlertNameNumber(int i) {
		
		this.alertNameNumber += i;
	}
	public void increaseAlertStartingRow(int i) {
		
		this.alertStartingRow += i;
	}
	public void increaseAlertStartingColl(int i) {

		this.alertStartingColl += i;
	}
	
	// end increase methods
	
	// start check methods
	
	public int checkDocumentStartingRow() {
		
		if(this.documentStartingRow >= 72) {
			
			this.documentStartingRow = 3;
		}
		return documentStartingRow;
	}
	public int checkDocumentStartingColl() {
		
		if(this.documentStartingColl >= 120) {
			
			this.documentStartingColl = 5;
		}
		return documentStartingColl;
	}
	public int checkAlertStartingRow() {
		
		if(this.alertStartingRow >= 72) {
			
			this.alertStartingRow = 7;
		}
		return alertStartingRow;
	}
	public int checkAlertStartingColl() {
		
		if(this.alertStartingColl >= 120) {
			
			this.alertStartingColl = 12;
		}
		return alertStartingColl;
	}
	
	// end check methods
	
	public String toString() {
		
		String str = "";
		
		for(int i = 0; i < defaultLength; i++) {
			
			for(int j = 0; j < defaultWidth; j++) {
				
				str += this.content[i][j];
			}
			str += "\n";
		}
		return str;
	}
	public ArrayList<Window> close(String name, ArrayList<Window> windows){
		
		for(int i = 0; i < windows.size(); i++) {
			
			if(windows.get(i).getName().contains(name)) {
				
				windows.remove(i);
			}
		}
		return windows;
	}
	public ArrayList<Window> close(ArrayList<Window> windows){
		
		for(int i = windows.size()-1; i > 0; i--) {
			
			if(windows.get(i).getName().contains("Alert")) {
				
				windows.remove(i);
			}
		}
		return windows;
	}
	public ArrayList<Window> select(String name, ArrayList<Window> windows){
		
		for(int i = 0; i < windows.size(); i++) {
			
			if(windows.get(i).getName().contains(name)) {
				
				windows.add(windows.remove(i));
			}
		}
		return windows;
	}
	public void resetHomeScreen() {
		
		this.documentStartingRow = 3;
		this.documentStartingColl = 5;
		
		for(int i = 0; i < defaultLength; i++) {
			
			for(int j = 0; j < defaultWidth; j++) {
				
				if(i == 0 && j == 0) {
					
					this.content[i][j] = '>';
				}else if(i == 0 || i == defaultLength -1) {
					
					this.content[i][j] = '_';
				}else if(j == 0 || j == defaultWidth -1) {
					
					this.content[i][j] = '|';
				}
				else {
					
					this.content[i][j] = ' ';
				}
			}
		}
		int m = 0;
		int k = 0;
		for(int i = 1; i < name.length()+1; i++) {
			
			this.content[m][i] = name.charAt(k);
			k++;
		}
	}
	public void quit() {
		
		System.out.println("");
		System.out.println("System Shuting Down...");
		System.out.println("Good Bye :)");
		System.exit(0);
	}

	// start unused abstract methods
	
	public void updateHomeScreen(HomeScreen display) {
	}
	public void write(String message) {
	}
	public void move(int l, int w, HomeScreen display) {
	}
	public void resize(int l, int w) {
	}
	
	// end unused abstract methods
}