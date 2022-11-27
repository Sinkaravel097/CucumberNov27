package org.stepdefinition;

public class Sample {	
	
	public static void main(String[] args) {
		
		String str = "Greens Tech Institute"; 
		
		// str --> obj name /  var name / reference name
		
		// length --> 21 --> 1 to n
		// index --> 0 to n-1 ---> 0 to 21-1 ---> 0 to 20
		
		// 4. To check whether the string is empty or not
		boolean emp = str.isEmpty();
		System.out.println(emp);
		
		// 5. To check whether the string starts with the particular value or not
		boolean start = str.startsWith("Gr");
		System.out.println(start);
		
		// 6. To check whether the string ends with the particular value or not
		boolean end = str.endsWith("Tute");
		System.out.println(end);
		
		// 7. To check whether the string contains the particular value or not
		boolean con = str.contains("Tech");
		System.out.println(con);
		
		// 8. To find the length of the given string
		int len = str.length();
		System.out.println(len);
		
		
		
		String s = "Java java";
		
		// 9. to replace one char or one word into another char or word
		String repChar = s.replace('a', '@');
		System.out.println(repChar);
		
		String repWord = s.replace("java", "Course");
		System.out.println(repWord);
		
		// 10. to replace all the occurence in string
		String repAll = s.replaceAll(s, "Selenium");
		System.out.println(repAll);
		
		
		
		
		String s1 = "Java java";  // 4 --> a,a,a,a
		
		//11. to find the index position of the particular character(first occurance)
		int first = s1.indexOf("a");
		System.out.println("first a char --> " + first);
		
		// 12. To find the index position of the particular character(last occurance)
		int last = s1.lastIndexOf("a");
		System.out.println("Last a char --> " + last);
		
		System.out.println("All a char presented index :-");
		//              0 < 9 ---> 0 to 8
		for (int i = 0; i < s1.length(); i++) {
			
			char ch = s1.charAt(i);
		
			//   a == a
			if (ch == 'a') {
				
				System.out.println(ch + " - " + i);
			}
		}
		
		
		String s2 = "        java          ";
		
		// 13. to remove spaces present before and after the String
		String tr = s2.trim();
		System.out.println(tr);
		
		
		String s3 = "Greens Tech Institute";
		
		String subStr = s3.substring(10);
		System.out.println(subStr);
		
		String subWord = s3.substring(12, 15);
		System.out.println(subWord);
		
		
		String s4 = "Selenium";
		String s5 = "selenium";
		
		// To compare 2 strings and it is case sensitive
		boolean eql = s4.equals(s5);
		System.out.println(eql);
		
		// To compare 2 strings and it does not care about case sensitive
		boolean eqlIgr = s4.equalsIgnoreCase(s5);
		System.out.println(eqlIgr);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
