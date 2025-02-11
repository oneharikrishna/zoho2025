import java.util.Scanner;
class Solution{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = scan.nextInt();
        System.out.println(s==0 ? 0 : (n*9 < s ? 0 : number(base(n,s),s)));
    }
    public static int number(int n,int s){
        return (n%10 != 0) ? n : number(build(--n,s),s);
    }
    public static int base(int n,int s){
        int number = 0, digitCount = 0;
        while(s>9){
            number += 9;
            number *= 10;
            s -= 9;
            ++digitCount;
        }
        number += s;
        ++digitCount;
        while(digitCount < n){
            number *= 10;
            ++digitCount;
        }
        return number;
    }
    public static int build(int n,int s){
        int firstDigit = 0, digitCount = -1, remainingNumber = 0;
        while(n>0){
            firstDigit = n % 10;
            n /= 10;
            ++digitCount;
        }
        remainingNumber = s - firstDigit;
        while(remainingNumber > 9){
            firstDigit *= 10;
            firstDigit += 9;
            remainingNumber -= 9;
            --digitCount;
        }
        for(int i=0;i<digitCount;++i)
        firstDigit *= 10;
        return firstDigit + remainingNumber;
    }
}


/*
test cases
1 ) n = 2, s = 9, => 81 
2 ) n = 3, s = 20, => 992
3 ) n = 3, s = 18, => 909
4 ) n = 5, s = 18, => 90009
5 ) n = 4, s = 56, => 0 
*/