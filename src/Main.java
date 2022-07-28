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
//        System.out.println(x + y);

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


//        int r = sumOfArray(arrInt);
//        System.out.println(r);
//        String hadash = "Hadash";
//        //stam();
//        System.out.println("Rossita");

        int[] arrInt = {1,2,3,4,5,6,7}; // 21 {2,3,4,5,6,7}
        int[] arrInt2 = {5,8,3};

        //arithmetic  + - / * ++ --  %
        //comparison     == != > < <= >=
        //assignment  = += -= /= *=

        int t = 7;
        if (t%2 == 1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }

    public static void printSecond(int[] e){
        for (int i = 2; i < e.length; i += 3) {
            System.out.println(e[i]);
        }
    }
    public static void printArr(int[] arr){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length-1){
                System.out.print(arr[i] + ", ");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.println("}");
    }

    public static int[] plusOne(int[] arr){
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i] + 1;
        }
        return temp;
    }

    public static String reverse(String s){
        String temp = "";
        for (int i = s.length()-1; i >= 0; i--) {
            temp += s.charAt(i);
        }
        return temp;
    }

    public static String threeLetters(String s){
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 3; j++) {
                temp += s.charAt(i);
            }
        }
        return temp;
    }

    public static void howManyTimes(String s, char c){
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)){
                counter++;
            }
        }
        System.out.println(counter);
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

