import java.util.Scanner;
public class Approach2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[scan.nextInt()];
        for(int i=0;i<arr.length;++i)
        arr[i] = scan.nextInt();
        System.out.println("Output:-");
        int start = -1;
        while(start < arr.length-1){
            start = findMax(arr,++start);
            System.out.print(arr[start]+", "); 
        }
    }
    public static int findMax(int[] arr,int searchIndex){
        int maxIndex = searchIndex;
        for(int i=searchIndex+1;i<arr.length;++i){
            if(arr[maxIndex] < arr[i])
            maxIndex = i;
        }
        return maxIndex;
    }
}

/*
Command Line Outout

7
1
2
3
4
5
6
7
Output:-
7,

----------------------

7
7
6
5
4
3
2
1
Output:-
7, 6, 5, 4, 3, 2, 1,
*/