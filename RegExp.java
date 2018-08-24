package package1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

	// ������� 1: [a-zA-Z]{0,4}
	// ������� 2: .{4}
	
	// �������������� �������:
	
	// 1) ���������� � a-z A-Z 0-9
	// 2) ���������� �������: a-z, A-Z, 0-9, "_", ".", "-"
	// 3) ������������� �� a-z A-Z 0-9
	// 4) �������� 4-31 ������
	   
	  public boolean test(String testString) {
	      Pattern p = Pattern.compile("[a-zA-Z0-9]{1}" + "[\\w*\\.*\\-*]{2,29}"
	                                   + "[a-zA-Z0-9]{1}" + "@mail.ru$");
	      Matcher m = p.matcher(testString);
		  return m.matches();
	  }
	                       
}