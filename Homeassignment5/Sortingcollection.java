package Homeassignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortingcollection {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words.add("HCL");
		words.add("Wipro");
		words.add("Aspire systems");
		words.add("CTS");

		Collections.sort(words);
		for(int i= words.size()-1; i>=0; i--)
		{
			 System.out.print(words.get(i));
		}
	}

}
