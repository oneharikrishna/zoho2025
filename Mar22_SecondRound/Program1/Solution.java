import java.util.Scanner;
class Solution{
    public static void main(String args[]){
        printPattern(new Scanner(System.in).nextInt());
    }
    public static void printPattern(int n){
        for(int i=1;i<=n;++i){
            int adder = n;
            int lastDigit = i;
            for(int j=1;j<=i;++j){
                System.out.print(lastDigit+" ");
                --adder;
                lastDigit += adder;
            }
            System.out.println();
        }
    }
}


/*
Command Line Output

5
1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15

9
1 
2 10
3 11 18
4 12 19 25
5 13 20 26 31
6 14 21 27 32 36
7 15 22 28 33 37 40
8 16 23 29 34 38 41 43
9 17 24 30 35 39 42 44 45

*/