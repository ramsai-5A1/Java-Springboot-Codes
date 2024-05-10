package OOPSClasses;

public class AdminUser extends User {

    public AdminUser(String userName, String email) {
        super(userName, email);
    }

    public void manageProducts() {
        this.userName = "ramesh";
        System.out.println("Admin is managing product");
    }


    @Override
    public void showDashboard() {
        super.showDashboard();
        System.out.println("Adminuser dashboard");
    }

    public static void main(String[] args) {
        AdminUser admin = new AdminUser("ramsai", "temp@gmail.com");
        admin.login();
        admin.manageProducts();
        admin.showDashboard();
        admin.logout();
    }
}
