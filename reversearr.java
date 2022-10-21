import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class reversearr {
    public static List<Integer> reverseArray(List<Integer> a,int n) {
        List<Integer> myList = new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            myList.add(a.get(i));
        }
    return myList;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int t = 0;t<n;t++){
            int b = sc.nextInt();
            a.add(b);
        }

        System.out.println(reverseArray(a,n)); 
    }
    
}
