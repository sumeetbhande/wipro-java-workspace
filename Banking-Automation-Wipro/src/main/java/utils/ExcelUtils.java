package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
    public static List<Map<String, String>> readSheet(String path, String sheetName) {
        List<Map<String, String>> data = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(path);
             Workbook wb = new XSSFWorkbook(fis)) {
            Sheet sheet = wb.getSheet(sheetName);
            if (sheet == null) throw new RuntimeException("Sheet not found: " + sheetName);

            Iterator<Row> rowIterator = sheet.iterator();
            List<String> headers = new ArrayList<>();
            if (rowIterator.hasNext()) {
                Row headerRow = rowIterator.next();
                for (Cell c : headerRow) {
                    headers.add(c.getStringCellValue());
                }
            }
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Map<String, String> rowMap = new HashMap<>();
                for (int i = 0; i < headers.size(); i++) {
                    Cell cell = row.getCell(i);
                    String value = "";
                    if (cell != null) {
                        switch (cell.getCellType()) {
                            case STRING: value = cell.getStringCellValue(); break;
                            case NUMERIC: value = String.valueOf(cell.getNumericCellValue()); break;
                            case BOOLEAN: value = String.valueOf(cell.getBooleanCellValue()); break;
                            default: value = ""; break;
                        }
                    }
                    rowMap.put(headers.get(i), value.replaceAll("\t.0$", ""));
                }
                data.add(rowMap);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}