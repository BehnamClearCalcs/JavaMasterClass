public class Section4_RecursionChallenges {
    public int power(int base, int exponent) {
        // TODO
        if (exponent*base < 0) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        } else {
            return base*power(base, exponent - 1);
        }
    }

    public int factorial(int num) {
        // TODO
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num*factorial(num-1);
        }
    }

    public int productofArray(int A[], int N) 
    { 
    //   TODO
    if (N == 1) {
        return A[N-1];
    } else {
        return A[N-1]*productofArray(A, N-1);
    }
    }

    public int recursiveRange(int num) {
        //  TODO
        if (num < 0) {
            return -1;
        }
        if (num == 0) {
            return 0;
        } else {
            return num + recursiveRange(num -1);
        }
    }

    public int fib(int n) {
        // TODO
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

    public String reverse(String str)
    {
        // TODO
        if (str.length() == 1) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
        }
    }

    public  boolean isPalindrome(String s)
    {   
        // TODO
        if (s.length() == 2 || s.length() == 3) {
            return s.charAt(s.length() - 1) == s.charAt(0);
        } else {
            return (s.charAt(s.length() - 1) == s.charAt(0) && isPalindrome(s.substring(1, s.length() - 1)));
        }
    }

    static char first(String str) {
        //   TODO
            if (Character.isUpperCase(str.charAt(0))) {
                return str.charAt(0);
            } else if (str.length() == 1 && Character.isLowerCase(str.charAt(0))) {
                return 0;
            } else {
                return first(str.substring(1, str.length()));
            }
    }

    public static String capitalizeWord(String str){
        //   TODO
            if (str.split("\\s+").length == 1) {
                String lett1 = str.split("\\s+")[0].substring(0, 1).toUpperCase();
                String word = lett1 + str.substring(1);
                return word;
            } else {
                return capitalizeWord(str.substring(1));
            }
    } 


}