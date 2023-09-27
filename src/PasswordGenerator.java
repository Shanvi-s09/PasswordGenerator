import java.util.Random;

public class PasswordGenerator {
	static char[] ar;
	static char[] password(int len) {
		String num="0123456789";
		String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String lowerCase="abcdefghijklmnopqrstuvwxyz";
	    String specialChar="*&#@$";
	    Random rnd=new Random();
	    String combine= upperCase+lowerCase+specialChar+num;
	    char[] passwd=new char[len];
	    
	    for(int i=0;i<len;i++) {
	    	passwd[i] = combine.charAt(rnd.nextInt((combine.length())));
	    }
	    return passwd;
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		//System.out.println(password(9));
       new GeneratePasswUI();
        
	}

}
