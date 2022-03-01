import javax.xml.crypto.Data;
import java.sql.Date;
import java.util.*;


public class PractiseCode {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        int mid =0;
        if(size%2==0){
            int loc = size/2;
            mid = arr[loc-1]+arr[loc];
        }else{
            int loc = size/2;
            mid = arr[loc];
        }

        System.out.println(mid);



    }
}
