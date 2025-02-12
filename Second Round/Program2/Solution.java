import java.util.Scanner;
import java.util.ArrayList;
class Solution{
    public static void main(String args[]){
        System.out.println(reverseOnlyAlphanumeric(new Scanner(System.in).nextLine()));
    }
    public static String reverseOnlyAlphanumeric(String str){
        char ch[] = new char[str.length()];
        for(int i=0;i<str.length();++i)
        ch[i] = str.charAt(i);
        int left = 0, right = ch.length-1;
        for(int i=0;i<ch.length;++i){
            if(left>right)
            break;
            boolean leftCharIsAlphanumeric = amIAlphanumeric(ch[left]);
            boolean rightCharIsAlphanumeric = amIAlphanumeric(ch[right]);
            if(leftCharIsAlphanumeric && rightCharIsAlphanumeric){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                ++left;
                --right;
                continue;
            }
            left = leftCharIsAlphanumeric ? left : ++left;
            right = rightCharIsAlphanumeric ? right : --right; 
            // System.out.println(i);
        }
        return new String(ch);
    }
    public static boolean amIAlphanumeric(char ch){
        int ascii = ch - 0;
        return (ascii>=49 && ascii<=57) || (ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122) ? true : false;
    }
}