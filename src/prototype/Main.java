package prototype;

import java.util.List;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees empsORG = new Employees();
		empsORG.loadData();
		
		Employees empsNew1 = empsORG.clone();
		Employees empsNew2 = empsORG.clone();
		
		System.out.println(empsORG);
		System.out.println(empsNew1);
		System.out.println(empsNew2);
		
		List<String> list = empsNew1.getEmpList();
		System.out.println(list);
		list.add("John");
		System.out.println(list);
		
		System.out.println(empsORG);
		System.out.println(empsNew1);
		System.out.println(empsNew2);
		
		
	}
}
