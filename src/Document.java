/**
 * This Class create the documents which can be written to, named, resized, etc...
 * @author Saif Ali
 * @version 03/15/2022
 */
import java.io.*;
import java.util.Scanner;

public class Document extends Window{
	
	private String name;
	private static final int defaultLength = 30;
	private static final int defaultWidth = 45;
	private int startingRow;
	private int startingColl;
	private char[][] content;
	
	public Document(HomeScreen display){
		
		super(defaultLength, defaultWidth);
		this.name = "Untitled" + display.getUntitledDocumentNameNumber();
		display.setUntitledDocumentNameNumber(1);
		this.content = new char[defaultLength][defaultWidth];
		this.startingRow = display.checkDocumentStartingRow();
		this.startingColl = display.checkDocumentStartingColl();
		
		for(int i = 0; i < defaultLength; i++) {
			
			for(int j = 0; j < defaultWidth; j++) {
				
				if(i == 0 && j == 0) {
					
					content[i][j] = '>';
				}else if(i == 0 || i == defaultLength -1) {
					
					content[i][j] = '_';
				}else if(j == 0 || j == defaultWidth -1) {
					
					content[i][j] = '|';
				}
				else {
					
					content[i][j] = ' ';
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
	public Document(HomeScreen display, String fileName) {
		
		super(defaultLength, defaultWidth);
		this.name = fileName;
		this.content = new char[defaultLength][defaultWidth];
		this.startingRow = display.checkDocumentStartingRow();
		this.startingColl = display.checkDocumentStartingColl();
		
		for(int i = 0; i < defaultLength; i++) {
			
			for(int j = 0; j < defaultWidth; j++) {
				
				if(i == 0 && j == 0) {
					
					content[i][j] = '>';
				}else if(i == 0 || i == defaultLength -1) {
					
					content[i][j] = '_';
				}else if(j == 0 || j == defaultWidth -1) {
					
					content[i][j] = '|';
				}
				else {
					
					content[i][j] = ' ';
				}
			}
		}
		int m = 0;
		int k = 0;
		for(int i = 1; i < name.length()+1; i++) {
			
			content[m][i] = name.charAt(k);
			k++;
		}
		if(name.contains("Jabberwocky.txt")) {
			
			String message = "";
			String file = "C:\\Users\\Saif Ali\\eclipse-workspace\\CPSC 1181 assignment 5\\Jabberwocky.txt";
			try {
				
				Scanner scan = new Scanner(new BufferedReader(new FileReader(file)));
				
				while(scan.hasNext()) {
					
					message += scan.nextLine();
				}
			}catch(IOException e) {
				
			}
			this.write(message);
		}else if(name.contains("HitchhikersGuide.txt")) {
			
			String message = "";
			String file = "C:\\Users\\Saif Ali\\eclipse-workspace\\CPSC 1181 assignment 5\\HitchhikersGuide.txt";
			try {
				
				Scanner scan = new Scanner(new BufferedReader(new FileReader(file)));
				
				while(scan.hasNext()) {
					
					message += scan.nextLine();
				}
			}catch(IOException e) {
				
			}
			this.write(message);
		}else {
			
			System.out.println("Error reading file");
		}
	}
	
	// start get methods
	
	public int getStartingRow() {
		
		return this.startingRow;
	}
	public int getStartingColl() {
		
		return this.startingColl;
	}
	public String getName() {
		
		return this.name;
	}
	
	// end get methods
	
	public void resize(int l, int w) {
		
		this.setLength(l);
		this.setWidth(w);
		
		char[][] previousContent = this.content;
		this.content = new char[this.getLength()][this.getWidth()];
		
		for(int i = 0; i < this.getLength(); i++) {
			
			for(int j = 0; j < this.getWidth(); j++) {
				
				if(i == 0 && j == 0) {
					
					this.content[i][j] = '>';
				}else if(i == 0 || i == this.getLength() -1) {
					
					this.content[i][j] = '_';
				}else if(j == 0 || j == this.getWidth() -1) {
					
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
		
		if(this.name.contains("Jabberwocky.txt")) {
			
			String message = "";
			String file = "C:\\Users\\Saif Ali\\eclipse-workspace\\CPSC 1181 assignment 5\\Jabberwocky.txt";
			try {
				
				Scanner scan = new Scanner(new BufferedReader(new FileReader(file)));
				
				while(scan.hasNext()) {
					
					message += scan.nextLine();
				}
			}catch(IOException e) {
				
			}
			
			this.write(message);
		}else if(this.name.contains("HitchhikersGuide.txt")) {
			
			String message = "";
			String file = "C:\\Users\\Saif Ali\\eclipse-workspace\\CPSC 1181 assignment 5\\HitchhikersGuide.txt";
			try {
				
				Scanner scan = new Scanner(new BufferedReader(new FileReader(file)));
				
				while(scan.hasNext()) {
					
					message += scan.nextLine();
				}
			}catch(IOException e) {
				
			}
			
			this.write(message);
		}else {
			
			int g = 0;
			for(int i = 0; i < this.getLength() -1; i++) {
				
				int h = 0;
				for(int j = 0; j < this.getWidth() -1; j++) {
					
					this.content[g][h] = previousContent[i][j];
					h++;
				}
				g++;
			}
		}
	}
	public void move(int l, int w, HomeScreen display) {
		
		this.startingRow = l;
		this.startingColl = w;
		
		char[][] homeScreenContent = display.getContent();
		
		int m = 0;
		for(int i = this.startingRow; i < this.getLength() + this.startingRow; i++) {
			
			int k = 0;
			for(int j = this.startingColl; j < this.getWidth() + this.startingColl; j++) {
				
				homeScreenContent[i][j] = this.content[m][k];
				k++;
			}
			m++;
		}
		display.setContent(homeScreenContent);
		display.increaseUntitledDocumentStartingRow(3);
		display.increaseUntitledDocumentStartingColl(5);
	}
	public void write(String message) {
		
		int row = 1;
		int coll = 1;
		
		for(int i = 0; i < message.length(); i++) {
			
			if(row == this.getLength()-1) {
				
				return;
			}else if(coll == this.getWidth()-1) {
				
				row++;
				coll = 1;
			}else if(message.charAt(i) == '|') {
				
				row++;
				coll = 1;
			}
			
			if(message.charAt(i) == '|') {
				
			}else {
				
				this.content[row][coll] = message.charAt(i);
				coll++;
			}
		}
	}
	public void updateHomeScreen(HomeScreen display) {
		
		char[][] homeScreenContent = display.getContent();
		
		int m = 0;
		for(int i = display.checkDocumentStartingRow(); i < this.getLength() + display.getDocumentStartingRow(); i++) {
			
			int k = 0;
			for(int j = display.checkDocumentStartingColl(); j < this.getWidth() + display.getDocumentStartingColl(); j++) {
				
				homeScreenContent[i][j] = this.content[m][k];
				k++;
			}
			m++;
		}
		display.setContent(homeScreenContent);
		display.increaseUntitledDocumentStartingRow(3);
		display.increaseUntitledDocumentStartingColl(5);
	}
}