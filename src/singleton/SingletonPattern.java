package singleton;

public class SingletonPattern {
	
	private static SingletonPattern instance;
	private int x;
	private int y;
	
	private SingletonPattern() {
		this.x = 2;
		this.y = 1;
	}
	
	public static SingletonPattern getInstance() {
		if(instance==null) {
			instance = new SingletonPattern();
		}
		return instance;
	}
	
}
