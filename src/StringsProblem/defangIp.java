package StringsProblem;

public class defangIp {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        address = address.replace(".","[.]");
        System.out.println(address);

    }
}
