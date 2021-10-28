package Problems;

public class DisjointArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {8,5,2,0};

        boolean isDisjoint = false;

        for(int i = 0 ; i< arr1.length; i++){
            for (int j = 0 ; j < arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    isDisjoint = true;
                }

            }
            if(isDisjoint){
                break;
            }


        }

        if(isDisjoint){
            System.out.println("Array is  disjoint");
        }
        else
        {
            System.out.println("Array is not dijoint");
        }
    }
}
