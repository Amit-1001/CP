package MultiDimArray;

public class rowWiseAndColumnWiseSorted {
    public static void main(String[] args) {



        int[][] arr  ={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int x=2;
        int top_right= arr[0].length-1;
        // why search from top right corner in case of left corner if x is greater than current element you cant tell where to go
        // same reason for all corner except right corner

        int new_col=0;


           while (new_col!= arr.length && top_right!=-1){

               if(arr[new_col][top_right]==x){
                   System.out.println(new_col+" "+ top_right);
                   break;
               }
               else if(arr[new_col][top_right]>x){
                   top_right--;
               }
               else {
                   new_col = new_col+1;
                   for(int j =new_col;j<arr.length;j++){
                       if(arr[new_col][top_right]==x){
                           System.out.println(new_col+" "+ top_right);
                           System.exit(0);
                       }

                   }
               }
           }
           if (top_right==-1)
           {
               System.out.println("Not found");
           }
    }




}
