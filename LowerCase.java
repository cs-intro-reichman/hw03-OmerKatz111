/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
		String newStr = "";
		char newChar;
		int asci;
		for(int i = 0; i < str.length(); i++){
			newChar = str.charAt(i);
			if((newChar >= 'A') && (newChar <= 'Z')){
				asci = (int) (newChar);
				asci = asci + 32;
				newChar = (char) (asci);
			}
			newStr = newStr + newChar;
		}
		
        return newStr;
    }
}
