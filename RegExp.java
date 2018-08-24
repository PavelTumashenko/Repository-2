package package1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

	// Задание 1: [a-zA-Z]{0,4}
	// Задание 2: .{4}
	
	// Дополнительное задание:
	
	// 1) Начинается с a-z A-Z 0-9
	// 2) Допустимые символы: a-z, A-Z, 0-9, "_", ".", "-"
	// 3) Заканчивается на a-z A-Z 0-9
	// 4) Содержит 4-31 символ
	   
	  public boolean test(String testString) {
	      Pattern p = Pattern.compile("[a-zA-Z0-9]{1}" + "[\\w*\\.*\\-*]{2,29}"
	                                   + "[a-zA-Z0-9]{1}" + "@mail.ru$");
	      Matcher m = p.matcher(testString);
		  return m.matches();
	  }
	                       
}