public class BinaryReverse {

    public static void main(String[] args) {

        String binary = "101010";
        String reverse = "";

        for(int i = binary.length() - 1; i >= 0; i--) {
            reverse = reverse + binary.charAt(i);
        }

        System.out.println("Original Binary String: " + binary);
        System.out.println("Reversed Binary String: " + reverse);
    }
}
