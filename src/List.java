
import java.util.ArrayList;
import java.util.Collections;
public class List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> list1 = new ArrayList<String>();
	list1.add("Pakkapon");
	list1.add("Sittichok");
	list1.add("Phakpoom");
	
	for(String list:list1){
		System.out.println(list);
	}
	
	Collections.sort(list1);
	
	for(String list:list1){
		System.out.println(list);
	
	}
	
	}
}
