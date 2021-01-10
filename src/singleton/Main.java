package singleton;

public class Main {
	public static void main(String[] args) {
		SingletonPattern s = SingletonPattern.getInstance();
		System.out.println(s);
		
		SingletonPattern sa = SingletonPattern.getInstance();
		System.out.println(sa);
		
	}
}
