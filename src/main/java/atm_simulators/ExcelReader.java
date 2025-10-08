package atm_simulators;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {

    public static List<UserAccount> readUserData(String filePath) {
        List<UserAccount> users = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row == null) continue;

                String accountNumber = getCellAsString(row.getCell(0));
                String pinNumber = getCellAsString(row.getCell(1));
                double balance = row.getCell(2).getNumericCellValue();

                users.add(new UserAccount(accountNumber, pinNumber, balance));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
    }

    private static String getCellAsString(Cell cell) {
        if (cell == null) return "";
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                // If numeric, convert to long (no decimals) and then to String
                return String.valueOf((long) cell.getNumericCellValue());
            case FORMULA:
                return cell.getCellFormula();
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            default:
                return "";
        }
    }
}
