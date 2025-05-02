package CoreJava.Java8_features.UserDTO_StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class User{
    private String userName;
    private String userPass;

    private String userRole;

    public User(String userName, String userPass, String userRole) {
        this.userName = userName;
        this.userPass = userPass;
        this.userRole = userRole;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }


}

class userDTO{
    private String userName;
    private String userPass;

    private String userRole;

    public userDTO(String userName, String userPass, String userRole) {
        this.userName = userName;
        this.userPass = userPass;
        this.userRole = userRole;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return String.format("User Name : "+userName+" "+"User Role : "+userRole+"\n");
    }

}


public class StreamAPI_DTO {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();

        users.add(new User("Amit","Paass123","Admin"));
        users.add(new User("Mandar","Pass123","Guest"));

        List<userDTO> userDTOList = new ArrayList<>();

        for(User user: users){ // traditional method
            userDTOList.add(new userDTO(user.getUserName(),user.getUserPass(), user.getUserRole()));
        }
        System.out.println(userDTOList);

        // using stream
        userDTOList = users.stream()
                .map((User user)->new userDTO(user.getUserName(),user.getUserPass(),user.getUserRole()))
                .collect(Collectors.toList());
        System.out.println("_________________Stream________________");
        System.out.println(userDTOList);


    }
}
