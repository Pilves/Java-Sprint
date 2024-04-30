public class Conditionals_Loops {
    public static void main(String[] args){
        System.out.println(IsNegative(6)); // false
        System.out.println(IntVsFloat(5,8.8f)); // Float
        System.out.println(Season("feb")); // winter
        System.out.println(Accumulate(4)); // 10
        System.out.println(BetweenLimits('j','f')); // ghi
        System.out.println(Doop(5,"+",3)); // 8
        System.out.println(IsLeapYear(2020)); // true
        System.out.println(CountDivisible(5,17,2,3)); // 2
        System.out.println(FindDivident(5,17,4)); // 8
        System.out.println(ReverseAlphabetValue('a')); // z

    }

    //Create a Go function that takes an integer as input and returns a boolean value (true or false) to indicate whether the input integer is negative or not.
    static boolean IsNegative(int n){
        return n< 0;
    }
    //Write a Go function that takes an integer and a float as input and returns a string. The function should compare the integer to the float and return one of the following: Integer if the integer is larger, Float if the float is larger, or Same if they are equal.
    static String IntVsFloat(int i, float f){
        if (i > f) {
            return "Integer";
        }else if (f > i){
            return "Float";
        }else{
        return "Same";
        }
    }
    //In this task you need to make a function that takes a string, that can contain a month name. If a month name is given, the season has to be returned. Otherwise return "invalid input: " with the input appended to it.
    static String Season(String month){
        switch(month){
            case "jan":
            case "feb":
            case "dec":
                return "winter";
            case "mar":
            case "apr":
            case "may":
                return "spring";
            case "jun":
            case "jul":
            case "aug":
                return "summer";
            case "sep":
            case "oct":
            case "nov":
                return "autumn";
            default:
                return "Invalid input: " + month;
        }
    }
    //Create a Go function that takes a non-negative integer n. If n is positive, return the sum of all the digits from 0 to n, including n itself. If n is negative, return 0.
    static int Accumulate(int n){
        int answer = 0;
        if (n<0){
        return 0;
        }
        for (int i = 0; i <= n; i++){
            answer += i;
        }
        return answer;
    }
    //Build a function that accepts two runes as input and returns a string containing all the runes that come between these two runes in the alphabet, in the correct order. For instance, if the input runes are 'f' and 'j', the function should return "ghi" regardless of the order in which the runes are given.
    static String BetweenLimits(char from, char to){
        if (from > to){
            char temp = from;
            from = to;
            to = temp;
        }
        StringBuilder answer = new StringBuilder();
        for (char i = (char) (from+1); i < to; i++){
            answer.append(i);
        }
        return answer.toString();
    }
    /*You're tasked with creating a function called Doop. This function takes three parameters:
        A value (integer).
        An operator, which can be one of the following: +, -, /, *, %.
        Another value (integer).
        In case of an invalid operator, invalid values, or incorrect number of arguments, the function returns 0. The program must also handle modulo and division by 0.
    */
    static int Doop(int a, String op, int b){
        switch(op){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            case "%":
                return a%b;
            default:
                return 0;
        }
    }
    //Write a Go function that takes an integer representing a year and returns a boolean value indicating whether that year is a leap year or not. A leap year is a year that is evenly divisible by 4, except for years that are divisible by 100 but not by 400.
    static boolean IsLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year %400 == 0){
            return true;
        }
        return false;
    }
    /*
    Write a Go function that takes four integers as input: from, to, step, and divisor. The function should check for exceptions and return 0 if any of the following conditions are met:
        step is negative or zero.
        divisor is zero.
        Otherwise, it should loop through the range of numbers from from (inclusive) to to (exclusive), checking every step-th element, and return the count of elements among these that are divisible by the divisor.
    */
    static int CountDivisible(int from, int to, int step, int divisior){
        int count = 0;
        for (int i = from; i < to; i+=step){
            if (i % divisior == 0){
                count++;
            }
        }
        return count;
    }
    //Write a Go function that takes three integers as input: from, to, and divisor. The function should loop through the numbers from from (inclusive) to to (exclusive) and return the first number in that range that is divisible by the divisor. If there is no such number, the function should return -1.
    static int FindDivident(int from, int to, int divisor){
        for (int i = from; i < to; i++){
            if( i % divisor == 0){
                return i;
            }
        }
        return -1;
    }

    static char ReverseAlphabetValue(char ch){
        return (char) ('z'-(ch-'a'));
    }
}
