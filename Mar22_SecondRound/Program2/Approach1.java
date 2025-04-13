import java.util.Scanner;
class Approach1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[scan.nextInt()];
        for(int i=0;i<arr.length;++i)
        arr[i] = scan.nextInt();
        System.out.println("Output:-");
        for(int i=0;i<arr.length;++i){
            boolean amILeader = true;
            for(int j=i+1;j<arr.length;++j){
                if(arr[i] < arr[j]){
                    amILeader = false;
                    break;
                }
            }
            if(amILeader)
            System.out.print(arr[i]+", ");
        }
    }
}

/*
Command Line Output
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
-----------------------------------
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