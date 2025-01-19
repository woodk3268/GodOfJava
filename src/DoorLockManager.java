public class DoorLockManager {
    String currentPassword;

    public boolean checckPassword(String password) {
        return password.equals("1234");
    }

    public void setPassword(String password) {
        // set password
    }

    public void resetPassword() {
        // reset password
    }
}