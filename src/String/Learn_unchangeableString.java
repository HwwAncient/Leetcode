package String;

public class Learn_unchangeableString {
	
	/*
	 * Unchangeable string
	 */
	
	
	public static void main(String[] args) {
		
		/*
		 * 1. The connection of string
		 */
        String s = "";
        int n = 100;
        for (int i = 0; i < n; i++) {
            s += "hello";
        }
        System.out.println(s);
        
        /*
		 * 2. Convert to the array of char to make string changeable
		 */
        String s1 = "Hello World";
        char[] str = s1.toCharArray();
        str[5] = ',';
        System.out.println(str);
        
        /*
		 * 3. Use the data structure "StringBuilder" to make string changeable
		 */
        
        int n2 = 10;
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < n2; i++) {
            str2.append("hello");
        }
        String s2 = str2.toString();
        System.out.println(s2);
	}
	
	
	
	
}
