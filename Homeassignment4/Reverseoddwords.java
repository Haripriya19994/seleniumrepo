package Homeassignment4;

public class Reverseoddwords {

	public static void main(String[] args) 
	{
		String test = "I am a software tester";
		
		String[] split = test.split(" "); 
		
		for(int i = 0; i<split.length;i++)
		{
			if (i%2==1) 
			{
				char[] ch = split[i].toCharArray();
				
				for (int j = ch.length-1; j >=0; j--)
				{
					System.out.print( ch[j]);
					
				}
				System.out.print(" ");
			}
			else 
			{
				System.out.print(split[i]+" ");
			}
					
		}
	}
}
