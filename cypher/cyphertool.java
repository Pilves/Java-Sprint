import java.util.Scanner;

public class cyphertool {
    public static void main(String[] args){

    }
    public static  String[] getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Encrypt? (true/false): ");
        boolean toEncrypt = scanner.nextBoolean();
        system.out.println("Encoding (rot13/reverse): ");
        String encoding = scanner.next();
        System.out.println("Enter the text: ");
        String message = scanner.next();
        return new String[] {String.valueOf(toEncrypt), encoding, message};
    }


}
