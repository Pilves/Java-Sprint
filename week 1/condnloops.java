public class condnloops {

    static boolean IsNegative(int n){
        return n< 0;
    }

    static String IntVsFloat(int i, float f){
        if (i > f) {
            return "Integer";
        }else{
            return "Float";
        }
    }

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

    static int Accumulate(int n){
        int answer = 0;
        for (int i = 0; i <= n; i++){
            answer += i;
        }
        return answer;
    }

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

    static boolean IsLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year %400 == 0){
            return true;
        }
        return false;
    }

    static int CountDivisible(int from, int to, int step, int divisior){
        int count = 0;
        for (int i = from; i < to; i+=step){
            if (i % divisior == 0){
                count++;
            }
        }
        return count;
    }

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
}