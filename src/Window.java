/**
 * This Class is the Super class for HomeScreen, Document, and Alert.
 * @author Saif Ali
 * @version 03/15/2022
 */
public abstract class Window{
	
	private int length;
	private int width;
	
	Window(int l, int w){
		
		this.length = l;
		this.width = w;
	}
	
	// start get methods
	
	public int getLength() {
		
		return this.length;
	}
	public int getWidth() {
		
		return this.width;
	}

	// end get methods
	
	// start set methods
	
	public void setLength(int l) {
		
		this.length = l;
	}
	public void setWidth(int w) {
		
		this.width = w;
	}
	
	// end set methods
	
	// start abstract methods
	
	public abstract void updateHomeScreen(HomeScreen display);
	public abstract void write(String message);
	public abstract void move(int l,int w, HomeScreen display);
	public abstract void resize(int l,int w);
	public abstract String getName();
	
	// end abstract methods
	
}