package stringProject;

public class ExampleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HelloWorld";
		String s1 = new String("Welcome to Java");
		char a[] = {'a','b','c','d'};
		String s3 = new String(a);
		
		/*length---to find length or size of string*/
		//charAt--to take specific character from a string based on index//
         
		int b = s.length();	
		char c = s.charAt(5);
		String s4 = "Java";
		String s5 = "java";
		String s6 ="Selenium";
                String var = "My name is sinu";
                String var1 = "LOWERCASE";
                //valueof - for typecasting (convert any datatype to string)
                int var2 = 10;
                String var3 = String.valueOf(var2);
                
                //isempty - to find if string is empty or not (space will also be considered as a character)
                String var4 ="";
                
                System.out.println(var4.isEmpty());  
                System.out.println(var3);
                
 
                //contains - method to check specific word in string.
                System.out.println(var.contains("name"));
                System.out.println(s4.contains("Ja"));
                //Lowercase
                System.out.println(var1.toLowerCase());
         

		
		//Equals---to check if both string equal or not//
		System.out.println(s4.equals(s5));
		System.out.println(s5.equals(s6));
		
		//Equal ignore case//
		
		System.out.println(s4.equalsIgnoreCase(s5));//here ignored case sensitive//
		
        //Concat---To combine one string to another string
		
		System.out.println(s5.concat(s6));
                
		
		System.out.println(s1);
		System.out.println(s);
		System.out.println(s3);
		System.out.println(b);
		System.out.println(c);


		/*System.out.println("HelloWorld");*/

	}

}
