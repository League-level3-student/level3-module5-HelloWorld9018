
public class RecursiveStringTest {
	static public String someMethod( String str ) {

	    if( str.isEmpty() ) {

	    return str;

	    }

	    

	    return someMethod( str.substring( 1, str.length() ) ) + str.charAt(0);

	}

	public static void main(String[] args) {
		System.out.println(someMethod("code all day"));
	}
}
