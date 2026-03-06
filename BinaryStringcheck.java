public class BinaryStringCheck {

    // Function to check if a string is binary or not
    public static boolean isBinary(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != '0' && str.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "1010101";

        if(isBinary(str)) {
            System.out.println("The string is a Binary String");
        } else {
            System.out.println("The string is NOT a Binary String");
        }
    }
}
