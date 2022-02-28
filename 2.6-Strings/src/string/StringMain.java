package string;

public class StringMain {
	public static void main(String[] args) {
	
		System.out.println("methods of strings");
		String s1 = new String("Manish");
		System.out.println(s1.length());
		//substring
		System.out.println(s1.subSequence(3, 6));
		//comparison
		String s2 = new String("Man");
		System.out.println(s1.compareTo(s2));
		//contains
		System.out.println(s1.contains("Man"));
		//concatination
		String s3 = new String(" kumar");
		System.out.println(s1.concat(s3));
		//upper
		System.out.println(s1.toUpperCase());
		//replace
		System.out.println(s1.replace('M', 'N'));
		//equals
		String x="hello";
		String y="heLLO";
		System.out.println(x.equals(y));
//string buffer-synchronized
		//conversion from string literal object to string buffer
		System.out.println("String buffer:");
		String s4="mango";
		StringBuffer s4b = new  StringBuffer(s4);
		//append
		s4b.append("is my fav");
		System.out.println(s4b);
		//char present at index
		System.out.println(s4b.charAt(0));
		System.out.println(s4b.capacity());
//string builder- non synchronized
		StringBuilder sb=new StringBuilder("string builder here");
		System.out.println(sb);
	}
}
