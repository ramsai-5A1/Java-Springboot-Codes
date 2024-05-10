package OOPSClasses;

public class User {
    protected String userName;
    private String email;

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public void login() {
        System.out.println(userName + " logged in");
    }

    public void logout() {
        System.out.println(userName + " logged out");
    }

    public void showDashboard() {
        System.out.println(userName + "'s dashboard");
    }
}
