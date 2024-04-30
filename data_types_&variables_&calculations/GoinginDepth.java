public class GoinginDepth {
    public static void main(String[] args){

        System.out.println(AlphabetMastery(6)); // abcdef
        System.out.println(ReverseAlphabet(5)); // zupkfa
        System.out.println(Pairs()); // "00 01, 00 02, 00 03, ..., 00 98, 00 99, 01 02, 01 03, ..., 97 98, 97 99, 98 99"
        System.out.println(Combinations()); // "012, 013, 014, ..., 689, 789"
        System.out.println(Countdown(7)); // 7, 5, 3, 1, 0!
        System.out.println(AlphaNumber(-1280)); // -bcia
        System.out.println(SimpleStrToInt("0000000012345")); // 12345
        System.out.println(StrToInt("-12345")); // -12345
        System.out.println(StrToInt("12345")); // 12345
        System.out.println(StrToInt("123 45")); // 0
        System.out.println(StrToInt("--12345")); // 0
    }

    //Create a function that takes a positive integer as input and returns the corresponding number of letters from the Latin alphabet. The input integer won't be larger than the alphabet's length.
    static String AlphabetMastery(int n){
        String answer = "";
        for (int i = 0; i < n; i++){
            answer += (char) (97+i);
        }
        return answer;
    }
    //Create a function that takes a step value n as input. Starting from z in the Latin alphabet, it should return the lowercase alphabet in reverse order as a string. For each letter, you skip n-1 letters. If n is 0 or negative, use a default step 0
    static String ReverseAlphabet(int step){
        if (step < 0){
            step = 1;
        }
        String answer = "";
        for (int i = 25; i >= 0; i -= step){
            answer += (char) (97+i);
        }
        return answer;
    }

    //Create a Go function that finds all possible combinations of two two-digit numbers. The pairs should be in ascending order, and each number should be padded with a leading zero if it's less than 10. The pairs should be separated by a comma and a space. Each number within a pair should be separated by a space. The function should return a string containing these pairs.
    static String Pairs(){
        String answer = "";
        for (int i = 0; i < 100; i++){
            for (int j = i+1; j < 100; j++){
                answer += String.format("%02d %02d, ", i, j);
            }
        }
        return answer.substring(0, answer.length()-2);
    }

    //Create a Go function that generates a series of unique triplets of digits. Each triplet should consist of different digits, and they should be in ascending order, from the smallest to the largest. The triplets should be separated by a comma and a space.
    static String Combinations(){
        String answer = "";
        for (int i = 0; i < 10; i++){
            for (int j = i+1; j< 10; j++){
                for (int k = j+1; k<10; k++){
                    answer += String.format("%d%d%d, ", i, j, k);
                }
            }
        }
        return answer.substring(0, answer.length()-2);
    }

    //Create a function that takes a one-digit integer as input and returns a countdown string. The countdown should start from the given number, skip every second number, and end with 0!.
    static String Countdown(int n){
        String answer = "";
        for (int i = n; i > 0; i-=2){
            answer += i+", ";
        }
        return answer+"0!";
    }

    //Create a Go function that takes an integer as input and returns a string representing that integer. If the number is negative, preserve the minus sign. Replace the digits with lowercase letters, where 0 becomes a, 1 becomes b, and so on up to 9, which becomes j.
    static String AlphaNumber(int n){
        String answer = "";
        String sign = "";
        if (n < 0){
            sign = "-";
            n = -n;
        }
        while (n > 0){
            answer = (char) (97+n%10) + answer;
            n /= 10;
        }
        return sign + answer;
    }

    //Create a Go function that converts a valid string representation of a number into an integer.
    //If the string is not a valid number, the function should return 0. The input will only contain one or more digits, and you don't need to handle signs like + or -.
    static int SimpleStrToInt(String s){
        int answer = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) < '0' || s.charAt(i) > '9'){
                return 0;
            }
            answer = answer*10 + s.charAt(i)-'0';
        }
        return answer;
    }

    /*
    Create a Go function that mimics the behavior of the Atoi function. Atoi converts a string representing a number into an integer.
        The function should return the integer value.
        If the input string is not a valid number, it should return 0.
        The function must handle signs such as + or -.
        The exercise does not require you to return an error.
    */
    static int StrToInt(String s){
        int answer = 0;
        int sign = 1;
        int i = 0;
        if (s.charAt(0) == '-'){
            sign = -1;
            i++;
        }
        else if (s.charAt(0) == '+'){
            i++;
        }
        for (; i < s.length(); i++){
            if (s.charAt(i) < '0' || s.charAt(i) > '9'){
                return 0;
            }
            answer = answer*10 + s.charAt(i)-'0';
        }
        return sign*answer;
    }
}
