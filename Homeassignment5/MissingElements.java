package Homeassignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {
	
		int[]array= {1, 2, 3, 4, 10, 6, 8};
		List<Integer> elements=new ArrayList<>();
		for(int num:array) {
			elements.add(num);
		}
		Collections.sort(elements);
		System.out.println("value sorted");
		
		for(int i=0; i<elements.size()-1;i++) {
			if (elements.get(i)!= elements.get(i + 1)-1) {
			
				System.out.println("Missing Number is: " +(elements.get(i)+1));
						
			}
			}
			
	}
	}






