package GooglePay;
import java.util.ArrayList;
import java.util.HashMap;

public class LoginController {

    private HashMap<String, User> dataStore;

    public LoginController() {
        dataStore = new HashMap<>();
    }

    public boolean isUserAlreadySignedUp(String mobileNumber) {
        if (dataStore.containsKey(mobileNumber)) {
            return true;
        }
        return false;
    }

    public void addNewUserToDB(String fullName, String mobileNumber, int gpayLoginPin) {
        User user = new User();
        user.setFullName(fullName);
        user.setMobileNumber(mobileNumber);
        user.setGpayLoginPin(gpayLoginPin);
        dataStore.put(mobileNumber, user);        
    }

    public boolean isGpayLoginPinMatching(String mobileNumber, int gpayLoginPin) {
        User user = dataStore.get(mobileNumber);
        if (user.getGpayLoginPin() == gpayLoginPin) {
            return true;
        }
        return false;
    }
}
