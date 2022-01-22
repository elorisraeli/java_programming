package PracticeBeforeExam;

public class Test2018A {
    public static void main(String[] args) {
        System.out.println(remove("aaaaabbbbbcccccddddeeee"));
        System.out.println(reduce("aaaaabbbbbcccccddddeeee"));
        System.out.println(remove("qqqqqwwwwweeeeedddddededededededededededededddddjjjgggnnnytytytyt"));
        System.out.println(reduce("qqqqqwwwwweeeeedddddededededededededededededddddjjjgggnnnytytytyt"));
    }

    public static String remove(String input) {
        StringBuilder answer = new StringBuilder("");
        int N = input.length();
        int i = 0;
        while (i < N) {
            char c = input.charAt(i);
            answer.append(c);
            while (i < N && input.charAt(i) == c)
                i++;
        }
        return answer.toString();
    }

    public static String reduce(String s){
        StringBuilder newS = new StringBuilder("");
        int N = s.length();
        int counter = 0; char c;
        while (counter< N){
            c = s.charAt(counter);
            newS.append(c);
            while (counter<N && s.charAt(counter) == c){
                counter++;
            }
        }
        return newS.toString();
    }

//    public static String reduce(String s) {
//        StringBuilder newS = new StringBuilder(""); int counter = 1;
//        for (int i = 0; i < s.length(); i++) {
//            newS.append(s.charAt(i));
//            while ((i+counter < s.length()) && (s.charAt(i) == s.charAt(i + counter))){
//                counter++;
//            }
//            i += counter-1;
//        }
//        return newS.toString();
//    }
}
