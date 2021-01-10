package prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	
	private List<String> empList;
	
	public Employees() {
		empList = new ArrayList<String>();
	}
	
	public Employees(List<String> list) {
		this.empList = list;
	}
	
	public void loadData(){
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}
	
	
	
	@Override
	public String toString() {
		String se = "";
		for(String s:this.empList) {
			se = se+" "+s;
		}
		return se;
		
	}

	public List<String> getEmpList() {
		return empList;
	}
	
	@Override
	public Employees clone() throws CloneNotSupportedException{
		List<String> temp = new ArrayList<String>();
		for(String s:this.getEmpList()) {
			temp.add(s);
		}
		return new Employees(temp);
	}
	
}
