package com.syntax.class13;

public class TasksContiued1 {

	public static void main(String[] args) {

		/* How would you check if String is palindrome or not? aba=> true Abbc =>false*/
		String str = "aba";
		str = str.toLowerCase();
		String str1 = "Abbc";
		if (!str1.equalsIgnoreCase(str))
			System.out.println("false");
		else
			System.out.println("true");
		
		/*How would you swap  2 strings without a temporary variable?*/
		String a="Demon";
		String b="zl1";
		System.out.println(a.replace(a,b));
		System.out.println(b.replace(b,a));

	}

}
