package OOPSClasses;

public class RegularUser extends User {

    public RegularUser(String userName, String email) {
        super(userName, email);
    }

    public void browseProducts() {
        System.out.println("Customer is browsing products");
    }

    @Override
    public void showDashboard() {
        System.out.println("Customer's dashboard");
    }

}
