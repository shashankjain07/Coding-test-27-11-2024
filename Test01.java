package practice;

/*Coding Test ANP-C8336
        Write a program to find and print the longest word in a given sentence. (eg., "I love Java Programming Language.")*/
public class Test01 {
    static void FindLongStr(String s){  // geting the str  s
        System.out.println("The enter given String is " + s);

        String longWord = "";
        int maxlen = 0;
        String[] words = s.split(" ");

        for (String word : words) {
            if (word.length() > maxlen) {
                longWord = word;
                maxlen = word.length();
            }
        }
        // Output the longest word
        System.out.println("The longest word is: " + longWord);
            }
    public static void main(String[] args) {
        FindLongStr("hello world sdasdsdasd");
    }
}