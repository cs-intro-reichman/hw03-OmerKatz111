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

    // TODO: see my version of the solution. It's a bit more readable and more maintable
    public static String lowerCaseMyVersion(String s) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (isLowerCase(currChar))
                answer += currChar;
            else
                answer += toLowerCase(currChar);
        }
        return answer;
    }
    private static char toLowerCase(char c){
        int asci = c;
        asci += 32;
        return (char) asci;
    }
    private static boolean isLowerCase(char c){
        return (c >= 'A') && (c <= 'Z');
    }
}
