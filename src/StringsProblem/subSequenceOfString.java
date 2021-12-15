package StringsProblem;

public class subSequenceOfString {
    public static void main(String[] args) {
        String input = "abcd";
        // ArrayList<String> res = new ArrayList<>();
        String str = "";
        int count = 0;
        int n = input.length();
        int totalSubSequence = (int) Math.pow(2, n);

        for (int i = 0; i < totalSubSequence; i++) {
            int j = 0;
            str = "";
            while (j < n) {

                int x = i & (1 << j); // checking countth bit


                if (x == 0) {
                    str = "_" + str;
                } else {
                    str = input.charAt(j) + str;
                }
                j++;

            }
            System.out.println(str);
        }

        //System.out.println(res);
    }
}
