/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Lucas Leung
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        System.out.println(add(1, 2));
    }

    // 1. add   add(3,8) → 11
    public static int add (int a, int b){
        return a + b;
    }

    
    // 2. add
    public static int add (int a, int b, int c, int d){
        return a + b + c + d;
    }

    // 3. morningGreeting
    public static String morningGreeting (String name){
        return "早上好, " + name + "!";
    }


    // 4. afternoonGreeting
    public static String afternoonGreeting (String name){
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple (String str){
        return str + str + str;
    }

    // 6. half
    public static double half (double num){
        return num / 2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger (double num){
        return (int) Math.round(num);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger (double num){
        return (int) Math.ceil(num - 0.5);
    }
}
