public class Exam{
    public static void main(String[] args){
        System.out.println(Accumulate(4));
        System.out.println(IsLeap(2000));
        System.out.println(Combinations());
        System.out.println(Pairs());
        System.out.println(Atoi("-12345"));
        System.out.println(ChessBoard(true));
        System.out.println(Exam.Interest(1000.0f, 2000.0f, 0.05f));
    }
    static int Accumulate(int n){
        if ( n < 0){
            return 0;
        }
        int sum = 0;
        for (int i=n; i>0; i--){
            sum += i;
        }
        return sum;
    }

    static boolean IsLeap(int n){
        if (n % 4 == 0) {
            if (n % 100 != 0 || n % 400 == 0) {
                return true;
            }
        }
        return false;
    }

    static String Combinations(){
        String answer = "";
        for (int i= 0; i < 10; i++){
            for (int j = i+1; j< 10; j++){
                for (int k = j+1; k< 10; k++) {
                    String comb = String.format("%d%d%d", i, j, k);
                    if (answer == "") {
                        answer = comb;
                    } else {
                        answer += ", " + comb;
                    }
                }
            }
        }
        return answer;
    }

    static String Pairs(){
        String answer = "";
        for (int i = 0; i < 100; i++){
            for ( int j = i+1; j< 100; j++){
               String pair = String.format("%02d %02d", i,j);
                if (answer == ""){
                    answer = pair;
                }else {
                    answer += ", " + pair;
                }
            }
        }
        return answer;
    }
    static int Atoi(String s){
        int sign = 1;
        int result = 0;
        for ( int i = 0; i < s.length(); i++){
            if (i==0){
                if (s.charAt(i) == '-'){
                    sign = -1;
                    continue;
                }else if (s.charAt(i) == '+'){
                    continue;
                }
            }
            if (s.charAt(i) < '0' || s.charAt(i) > '9'){
                return -1;
            }else{
                result = result* 10 + s.charAt(i) - '0';
            }
        }
        return result * sign;
    }

    static String ChessBoard(boolean col){
        String blacks ="", whites = "";
        for( int j = 1; j<= 8; j++){
            for(char val = 'a'; val <= 'h'; val++){
                if ((val-'a'+j) %2 ==0){
                    if(blacks.isEmpty()){
                        blacks = String.valueOf(val) + j;
                    }else{
                        blacks += ", "+val+j;
                    }

                }else{
                    if(whites.isEmpty()){
                        whites = String.valueOf(val) +j;
                    }else{
                        whites += ", "+val+j;
                    }
                }
            }
        }
        if(col){
            return blacks;
        }else{
            return whites;
        }
    }

    static int Interest(float start, float finish,float interest){
        int years = 0;
        if (start >= finish){
            return 0;
        }
        for(float i=start; i< finish; years++){
            if(years >=99){
                return 0;
            }
            i += i*interest;
        }
        return years;
    }


}