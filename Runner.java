package package1;

public class Runner {

	public static void main(String[] args) {
		RegExp regExp = new RegExp();
		
     	String s1 = "Hel@mail.ru";
		String s2 = "Hell@mail.ru";
		String s3 = "Hel.@mail.ru";
		String s4 = "Hell..--@mail.ru";
		String s5 = "...s@mail.ru";
		String s6 = "Hell0.-_00@mail.ru";
		String s7 = "____@mail.ru";
		String s8 = "__a_@mail.ru";
		String s9 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaawer@mail.ru";
		String s10 = "aaaaaaaaaaaa.-aaaaaaaaaaaaaaaaa@mail.ru";
	
		System.out.println(regExp.test(s1) + " " + s1);
		System.out.println(regExp.test(s2) + " " + s2);
		System.out.println(regExp.test(s3) + " " + s3);
		System.out.println(regExp.test(s4) + " " + s4);
		System.out.println(regExp.test(s5) + " " + s5);
		System.out.println(regExp.test(s6) + " " + s6);
		System.out.println(regExp.test(s7) + " " + s7);
		System.out.println(regExp.test(s8) + " " + s8);
		System.out.println(regExp.test(s9) + " " + s9);
		System.out.println(regExp.test(s10) + " " + s10);		
	}

}