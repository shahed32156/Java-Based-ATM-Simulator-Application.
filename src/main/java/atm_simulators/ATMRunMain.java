package atm_simulators;

import java.util.List;

public class ATMRunMain {
    public static void main(String[] args) {

        String filePath = "src/UserInfo.xlsx"; // make sure this path is correct
        List<UserAccount> users = ExcelReader.readUserData(filePath);

        if (!users.isEmpty()) {
            // Example: Use the first user for now
            UserAccount user1 = users.get(0);
            ATM atm = new ATM(user1);
            atm.start();
        } else {
            System.out.println("No user data found in Excel file.");
        }
    }
}
