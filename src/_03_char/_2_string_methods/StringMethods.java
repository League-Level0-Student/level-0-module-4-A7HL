package _03_char._2_string_methods;


public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
		String uhh = "kidksadfjkkkkkkk";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		System.out.println(uhh.charAt(2));
		
		// 3. Print the length of your String to the console.
		//    HINT: .length()
		System.out.println(uhh.length());
		
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		int i = uhh.length();
		for(i = 0; i < uhh.length(); i +=1) {
			System.out.println(uhh.charAt(i));
		}
		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		int a = 0;
		for(a =0; a < uhh.length(); a+=1) {
			
		char index = uhh.charAt(a);
		if (index==('k')) {
			int index2 = a;
		System.out.println("k is at index_" + index2);
			}
		}	
	}
}

