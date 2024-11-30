package Homeassignment4;

public class changetoodd {

	public static void main(String[] args) {
		String test = "changeme";  
        char[] ch = test.toCharArray();
        
        for (int i=ch.length-1;i>=0;i--) {
            
            if (i % 2 != 0)
            {
             ch[i]=Character.toUpperCase(ch[i]);
             
            }
            
        }
        String result=new String(ch);
            System.out.print(result);
            
        }
}
 