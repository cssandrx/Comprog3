public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String correctUser = "admin";
        String correctPass = "secret123";
        boolean notLocked = true;

        testLogin("wrongUser", correctPass, notLocked, correctUser, correctPass);
        testLogin(correctUser, "wrongPass", notLocked, correctUser, correctPass);
        testLogin(correctUser, correctPass, false, correctUser, correctPass);
    }

    public static void testLogin(String inputUser, String inputPass, 
        boolean inputNotLocked, String correctUser, String correctPass) {
        if (inputUser.equals(correctUser)) {
            if (inputPass.equals(correctPass)) {
                if (inputNotLocked) {
                    System.out.println("Login successful.");
                } else {
                    System.out.println("Error: Account is locked.");
                }
            } else {
                System.out.println("Error: Incorrect password.");
            }
        } else {
            System.out.println("Error: Incorrect username.");
        }
    }
}
