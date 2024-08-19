/**
 * This Driver program simulates the Window objects using commands in the command prompt
 * @author Saif Ali
 * @version 03/15/2022
 */
import java.util.ArrayList;
import java.util.Scanner;

public class DocumentHandlerDriver{
	
	public static void main(String[] args) {
		
		ArrayList<Window> windows = new ArrayList<Window>();
		HomeScreen display = new HomeScreen();
	
		System.out.println(display.toString());
		
		String command = "";
		Scanner scan = new Scanner(System.in);
		boolean quitRan = false;
		int newDocumentCounter = 0;
		
		while(!quitRan) {
			
			System.out.println("");
			command = scan.nextLine();
			
			if(command.contains("quit")) {
				
				quitRan = true;
				scan.close();
				display.quit();
			}else if(command.contains("new")) {
				
				if(newDocumentCounter == 0) {
					
					Document untitled1 = new Document(display);
					windows.add(untitled1);
					newDocumentCounter++;
				}else if(newDocumentCounter == 1) {
					
					Document untitled2 = new Document(display);
					windows.add(untitled2);
					newDocumentCounter++;
				}else if(newDocumentCounter == 2) {
					
					Document untitled3 = new Document(display);
					windows.add(untitled3);
					newDocumentCounter++;
				}else if(newDocumentCounter == 3) {
					
					Document untitled4 = new Document(display);
					windows.add(untitled4);
					newDocumentCounter++;
				}else if(newDocumentCounter == 4) {
					
					Document untitled5 = new Document(display);
					windows.add(untitled5);
					newDocumentCounter++;
				}else if(newDocumentCounter == 5) {
					
					Document untitled6 = new Document(display);
					windows.add(untitled6);
					newDocumentCounter++;
				}else if(newDocumentCounter == 6) {
					
					Document untitled7 = new Document(display);
					windows.add(untitled7);
					newDocumentCounter++;
				}else if(newDocumentCounter == 7) {
					
					Document untitled8 = new Document(display);
					windows.add(untitled8);
					newDocumentCounter++;
				}else if(newDocumentCounter == 8) {
					
					Document untitled9 = new Document(display);
					windows.add(untitled9);
					newDocumentCounter++;
				}else if(newDocumentCounter == 9) {
					
					Document untitled10 = new Document(display);
					windows.add(untitled10);
					newDocumentCounter++;
				}else if(newDocumentCounter == 10) {
					
					Document untitled11 = new Document(display);
					windows.add(untitled11);
					newDocumentCounter++;
				}else if(newDocumentCounter == 11) {
					
					Document untitled12 = new Document(display);
					windows.add(untitled12);
					newDocumentCounter++;
				}else if(newDocumentCounter == 12) {
					
					Document untitled13 = new Document(display);
					windows.add(untitled13);
					newDocumentCounter++;
				}else if(newDocumentCounter == 13) {
					
					Document untitled14 = new Document(display);
					windows.add(untitled14);
					newDocumentCounter++;
				}else if(newDocumentCounter == 14) {
					
					Document untitled15 = new Document(display);
					windows.add(untitled15);
					newDocumentCounter++;
				}else if(newDocumentCounter == 15) {
					
					Document untitled16 = new Document(display);
					windows.add(untitled16);
					newDocumentCounter++;
				}else if(newDocumentCounter == 16) {
					
					Document untitled17 = new Document(display);
					windows.add(untitled17);
					newDocumentCounter++;
				}else if(newDocumentCounter == 17) {
					
					Document untitled18 = new Document(display);
					windows.add(untitled18);
					newDocumentCounter++;
				}else if(newDocumentCounter == 18) {
					
					Document untitled19 = new Document(display);
					windows.add(untitled19);
					newDocumentCounter++;
				}else if(newDocumentCounter == 19) {
					
					Document untitled20 = new Document(display);
					windows.add(untitled20);
					newDocumentCounter++;
				}else if(newDocumentCounter == 20) {
					
					Document untitled21 = new Document(display);
					windows.add(untitled21);
					newDocumentCounter++;
				}else if(newDocumentCounter == 21) {
					
					Document untitled22 = new Document(display);
					windows.add(untitled22);
					newDocumentCounter++;
				}else if(newDocumentCounter == 22) {
					
					Document untitled23 = new Document(display);
					windows.add(untitled23);
					newDocumentCounter++;
				}else if(newDocumentCounter == 23) {
					
					Document untitled24 = new Document(display);
					windows.add(untitled24);
					newDocumentCounter++;
				}else if(newDocumentCounter == 24) {
					
					Document untitled25 = new Document(display);
					windows.add(untitled25);
					newDocumentCounter++;
				}
				for(Window x:windows) {
					
					x.updateHomeScreen(display);
				}
			}else if(command.contains("open")) {
				
				if(!command.contains(".txt")){
					
					Alert alert1 = new Alert(display);
					alert1.insertMissingTxtMessage();
					windows.add(alert1);
				}else if(command.contains("Jabberwocky.txt")) {
					
					Document jabber = new Document(display, "Jabberwocky.txt");
					windows.add(jabber);
				}else if(command.contains("HitchhikersGuide.txt")) {
					
					Document hiker = new Document(display, "HitchhikersGuide.txt");
					windows.add(hiker);
				}else {
					
					Document newDoc = new Document(display, command.substring(5));
					windows.add(newDoc);
				}
				for(Window x:windows) {
					
					x.updateHomeScreen(display);
				}
			}else if(command.contains("close")){
				
				if(command.length() > 6) {
					
					boolean matchingName = false;
					for(Window x:windows) {
						
						if((x.getName().contains(command.substring(6)) && command.contains(".txt"))  || (x.getName().contains(command.substring(6)) && command.contains("Alert"))) {
							
							matchingName = true;
						}
					}
					if(matchingName) {
						
						windows = display.close(command.substring(6), windows);
					}else {
						
						Alert alert2 = new Alert(display);
						alert2.insertDocumentNotFoundMessage();
						windows.add(alert2);
					}
				}else if(command.length() <= 6 && (windows.get(windows.size()-1).getName().contains(".txt") || windows.get(windows.size()-1).getName().contains("Untitled"))) {
					
					Alert alert3 = new Alert(display);
					alert3.insertCloseByNameMessage();
					windows.add(alert3);
					
				}else {
					
					windows = display.close(windows);
				}
				for(Window x:windows) {
					
					x.updateHomeScreen(display);
				}
			}else if(command.contains("select")) {
				
				windows = display.select(command.substring(7), windows);
				for(Window x:windows) {
					
					x.updateHomeScreen(display);
				}
			}else if(command.contains("write")) {
				
				windows.get(windows.size()-1).write(command.substring(6));
				for(Window x:windows) {
					
					x.updateHomeScreen(display);
				}
			}else if(command.contains("resize")) {
				
				int length = Integer.parseInt(command.substring(command.indexOf(' ')+1,command.lastIndexOf(' ')));
				int width = Integer.parseInt(command.substring(command.lastIndexOf(' ')+1,command.length()));
				windows.get(windows.size()-1).resize(length,width);
				for(Window x:windows) {
					
					x.updateHomeScreen(display);
				}
			}else if(command.contains("move")) {
				
				int length = Integer.parseInt(command.substring(command.indexOf(' ')+1,command.lastIndexOf(' ')));
				int width = Integer.parseInt(command.substring(command.lastIndexOf(' ')+1,command.length()));
				
				for(int i = 0; i < windows.size(); i++) {
					
					if(i == windows.size()-1 ) {
						
						windows.get(i).move(length,width, display);
					}else {
						
						windows.get(i).updateHomeScreen(display);
					}
				}
			}else {
				
				Alert alert4 = new Alert(display);
				alert4.insertInvalidCommandMessage();
				windows.add(alert4);
				for(Window x:windows) {
					
					x.updateHomeScreen(display);
				}
			}
			
			System.out.println(display.toString());
			display.resetHomeScreen();
		}
	}
}