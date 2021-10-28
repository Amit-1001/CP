package Problems;

import java.io.*;
//import java.util.*;
import java.util.Scanner;

class GFG {
    public static void main (String[] args) {

        Scanner sc =  new Scanner(System.in);

        int n, x, k, slot1, slot2, index, index1 = 0, flag = 0, count= 0, i;

        System.out.println("Enter no of element");
        n = sc.nextInt();

        int arr[] = new int[n];

        for( i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Slot");
        x = sc.nextInt();
        System.out.println("Enter key");
        k = sc.nextInt();

        slot1 = n/x;
        slot2 = n%x;

        for( i=0; i<slot1; i++)
        {
            for(index=0; index < x; index++)
            {
                if (arr[index1] == k)
                    flag = 1;

                index1++;
            }

            if( flag == 1)
            {
                count ++;

            }
            flag = 0;
        }

        for( i = 0; i< slot2; i++)
        {
            if (arr[index1] == k)
                flag = 1;

            index1++;
        }

        if( flag == 1)
        {
            count ++;

        }

        if( slot2 > 0)
        {
            if (count == slot1+1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else if (count == slot1)
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}