import java.util.Scanner;

public class cyphertool {
    public static void main(String[] args){
        String[] input = getInput();
        boolean toEncrypt = Boolean.parseBoolean(input[0]);
        String encoding = input[1];
        String message = input[2];
        String result = "";
        if (toEncrypt){
            if (encoding.equals("rot13")){
                result = encryptRot13(message);
            } else if (encoding.equals("reverse")){
                result = encryptReverse(message);
            } else if (encoding.equals("super")){
                result = superSecret(message);
            }
        } else {
            if (encoding.equals("rot13")){
                result = decryptRot13(message);
            } else if (encoding.equals("reverse")){
                result = decryptReverse(message);
            } else if (encoding.equals("super")){
                result = decryptSuperSecret(message);
            }
        }
        System.out.println(result);
    }
    public static  String[] getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Encrypt?/Decrypt? (true/false): ");
        boolean toEncrypt = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Encoding (rot13/reverse/super): ");
        String encoding = scanner.nextLine();
        System.out.println("Enter the text: ");
        String message = scanner.nextLine();
        return new String[] {String.valueOf(toEncrypt), encoding, message};
    }

    // Encrypt the message with ROT13
    public static String encryptRot13(String message) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' + 13) % 26);
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'A' + 13) % 26);
            } else if (c == ' ') {
                result.append(' '); // Append space directly
                continue;
            }
            result.append(c);
        }
        return result.toString();
    }

    // Encrypt the message with reverse
    public static String encryptReverse(String message) {
        return new StringBuilder(message).reverse().toString();
    }

    // Decrypt the message with ROT13
    public static String decryptRot13(String message) {
        return encryptRot13(message);
    }

    // Decrypt the message with reverse
    public static String decryptReverse(String message) {
        return encryptReverse(message);
    }
    public static String superSecret(String message) {
        return encryptReverse(encryptRot13(message));
    }
    public static String decryptSuperSecret(String message) {
        return decryptRot13(decryptReverse(message));
    }
}
