package Homeassignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestnumber {

	public static void main(String[] args) {

		List<Integer> num=new ArrayList<Integer>();
		num.add(3);
		num.add(2);
		num.add(11);
		num.add(4);
		num.add(6);
		num.add(7);
		
		Collections.sort(num);
		int i=num.get(3);
		System.out.println("The seconf larget number is:"+i);


		
	}

}
