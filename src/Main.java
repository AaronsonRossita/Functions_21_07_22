import java.util.logging.Handler;

public class Main {

    public static void main(String[] args) {
//        int x = sum(3,7);
//        sum(7,8);
//        System.out.println(x);
//        int sub = sub(5,6);
//        System.out.println(sub);
        int x = 8;
        x = 7;
        int y = x;
        System.out.println(x + y);

        String newString = "This is my new string";
        String s = "Hey, what's up?fgasdrjdgykfghukfhulkghilvhfukcvgyj4tu56u65";
//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
//        }




//        System.out.println(sub(5,6));
//
//        printSomething();

//        printHello("dgfhfg");
//        printHello("");
//        printHello(newString);
//        printHello(s);
//        printSomething();

        int[] arrInt = {1,2,3,4,5,6}; // 21
        int r = sumOfArray(arrInt);
        System.out.println(r);
        String hadash = "Hadash";
        //stam();
        System.out.println("Rossita");
    }

    public static void stam(String s){
        // s = "Cat"
        System.out.println(s.length());
    }

    public static int sumOfArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            //sum += arr[i];
        }
        return sum;
    }

    public static int multOfArray(int[] arr){
        int mult = 1;
        for (int i = 0; i < arr.length; i++) {
            //sum = sum * arr[i];
            mult *= arr[i];
        }
        return mult;
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }


    public static void printSomething(){
        System.out.println("Something");
    }

    public static void printEveryChar(String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void printHello(String word){
        System.out.println(word);
    }


}

