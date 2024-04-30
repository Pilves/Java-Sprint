public class DataTypes_Variables_Calculations {
    public static void main(String[] args) {
        System.out.println(Abacus(8, 3)); // 2
        System.out.println(Mean(1.15f,2.8f,3.5f)); // 2.5
        System.out.println(Casting(1.15f)); // 1
        System.out.println(ShiftBy('a', 4)); // e
        System.out.println(strConcat("Hello", "World", ",")); // Hello, World
        System.out.println(reverseAlphabetValue('a')); // z
    }
    //Write a function that takes two integer (int) values as input and returns the result of integer division of the first value by the second.
    static int Abacus(int a, int b){
        return a/b;
    }
    // Write a function that takes three float values as input and returns their mean as a float value.
    static float Mean(float a, float b, float c){
        return (a+b+c)/3;
    }
    // Write a function that takes a float value as input and returns the nearest integer value of the float.
    static int Casting(float a){
        return (int) a;
    }
    // Write a function that takes a character and an integer as input and returns the character that is the result of shifting the input character by the input integer.
    static char ShiftBy(char a, int step){
        return (char) (a+step);
    }
    // Write a function that takes two strings as input and returns the concatenation of the two strings with a delimiter in between.
    static String strConcat(String a , String b,String delim){
        return a+delim+" "+b;
    }
    // Write a function that takes a character as input and returns the character that is the result of reversing the alphabet value of the input character.
    static String reverseAlphabetValue(char a){
        return String.valueOf((char) (122-(a-97)));
    }
}