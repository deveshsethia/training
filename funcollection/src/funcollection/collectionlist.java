package funcollection;

import java.util.ArrayList;

public class collectionlist {
	static public void  main(String[] args)  
	{
		ArrayList <Integer> arraylist= new ArrayList<>(5);
		ArrayList <Integer> arraylist1= new ArrayList<>();
		arraylist.add(68);
		arraylist.add(68);
		arraylist.add(68);
		arraylist1.add(56);
		arraylist1.add(56);
		arraylist1.add(56);
		System.out.println(arraylist.size());
		System.out.println(arraylist.indexOf(68));
		arraylist.addAll(arraylist1);
		System.out.println(arraylist.size());
		System.out.println(arraylist.lastIndexOf(56));
		
		
		
	}

}
