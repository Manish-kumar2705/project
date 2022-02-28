import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
public static void main(String[] args) {
	Pattern p = Pattern.compile(".s"); //compiles the regex input
	Matcher m = p.matcher("as");
	boolean res = m.matches();			//matches() is using matcher obj  to get the boolean res
	System.out.println(res);
	
	//eg-2
	System.out.println(Pattern.matches("....sh", "manish"));  //shortcut
}
}
