package Homeassignment4;

import java.util.Arrays;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class Anagram {

	public static void main(String[] args) {
   String text1="stops";
  String text2="potss";
  if(text1.equals(text2))
  {
	  System.out.println("length matches");	  
  }else {
	  System.out.println("length mismatches");
  }

  char[] ch = text1.toCharArray();
  for(int i=0; i<ch.length; i++)
	  System.out.println (ch[i]);
Arrays.sort(ch);
if(ch.equals(ch))
{
	System.out.println("The given string is anagram");
}else {
	System.out.println("The given string is not anagram");
}
	}

}
