public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
       String lowstr = str.toLowerCase();
        return lowstr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
       
        if (str2.length()==0){
            return true;
        }
        if (str1.length() < str2.length()){  
            return false; 
        }
       
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            boolean match = true;

            for (int a = 0; a < str2.length(); a++) {
                if (str1.charAt(i + a) != str2.charAt(a)) {
                    match = false;
                    break;
                }
            }
                if (match) {
                    return true;
                }
            }
    
        
        
        return false;
    }
}
