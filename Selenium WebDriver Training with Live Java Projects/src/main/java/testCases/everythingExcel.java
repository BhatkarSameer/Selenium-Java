package testCases;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class everythingExcel {

    public String file_path = (System.getProperty ("user.dir") + "\\src\\main\\resources\\myExcelFile.xlsx");
    // Data streams
    public FileInputStream fileInputStream = null;
    public FileOutputStream fileOutputStream = null;
    // Initializing Excel workbook
    XSSFWorkbook wrkBook = new XSSFWorkbook ();
    // Initialising Excel sheet and data rows and columns
    XSSFSheet wrkSheet;
    private XSSFRow rows = null;
    private XSSFCell cellIndex = null;

    public static void main(String[] args) {

    }

    // Initiates the connection of Input Stream from Excel file to the workbook
    public void loadExcel_InputStream(String file_path) {

        //THIS keyword is used to load Class level variable declarations to Method level parameters
        this.file_path = file_path;
        try {
            fileInputStream = new FileInputStream (file_path);
            wrkBook = new XSSFWorkbook (fileInputStream);
            wrkSheet = wrkBook.getSheetAt (0);
            fileInputStream.close ();
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

    // Initiates the connection of Output Stream between the workbook and Excel file
    public void loadExcel_OPStream(String file_path) {

        this.file_path = file_path;
        try {
            fileOutputStream = new FileOutputStream (file_path);
            wrkBook.write (fileOutputStream);
            fileOutputStream.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }

    }

    // Writing to an Excel file
    public void writeExcel() {

        wrkSheet = wrkBook.createSheet ("Work Sheet 1");

        Row row0 = wrkSheet.createRow (0);
        Cell cellA = row0.createCell (0);
        Cell cellB = row0.createCell (1);

        // Writing data one cell at a time
//        cellA.setCellValue ("First cell First Sheet");
//        cellB.setCellValue ("Second cell First Sheet");

        // Writing data using loops
        for (int rowIndex = 0 ;rowIndex < 20 ;rowIndex++) {

            rows = wrkSheet.createRow (rowIndex);

            for (int colIndex = 0 ;colIndex <= rowIndex ;colIndex++) {

                cellIndex = rows.createCell (colIndex);
                cellIndex.setCellValue ((int) (Math.random () * 5));

            }

        }

    }

    // Returns number of columns in a sheet
    public int getColumnCount(String sheet_name) {

        // check if sheet exists
        if (doesSheetExist (sheet_name)) {
            wrkSheet = wrkBook.getSheet (sheet_name);
            rows = wrkSheet.getRow (0);

            if (rows == null)
                return -1;
            return rows.getLastCellNum ();
        } else {
            return -1;
        }
    }

    // Returns the row count in a sheet
    public int getRowCount(String sheet_Name) {
        int index = wrkBook.getSheetIndex (sheet_Name);
        if (index == -1)
            return 0;
        else {
            wrkSheet = wrkBook.getSheetAt (index);
            return wrkSheet.getLastRowNum () + 1;
        }
    }

    // Find whether sheets exist
    public boolean doesSheetExist(String sheet_Name) {
        int index = wrkBook.getSheetIndex (sheet_Name);

        if (index == -1) {
            index = wrkBook.getSheetIndex (sheet_Name.toUpperCase ());
            return index != -1;
        } else
            return true;
    }

    public void readExcel() {

        loadExcel_InputStream (file_path);

        try {
            Workbook wrkBook = WorkbookFactory.create (fileInputStream);

            Sheet sheet0 = wrkBook.getSheetAt (0);
//            Row row0 = sheet0.getRow (0);
//            Cell cellA = row0.getCell (0);

            // Reading cell data according to CellType
            for (Row rows : sheet0) {
                for (Cell cell_index : rows) {
                    switch (cell_index.getCellType ()) {
                        case STRING:
                            System.out.println (cell_index.getStringCellValue ());
                        case BLANK:
                            System.out.println ("Blank Cell located");
                        case BOOLEAN:
                            System.out.println (cell_index.getBooleanCellValue ());
                        case ERROR:
                            System.out.println (cell_index.getErrorCellValue ());
                        case NUMERIC:
                            System.out.println (cell_index.getNumericCellValue ());
                        case FORMULA:
                            System.out.println (cell_index.getCellFormula ());
                    }
                }

                fileInputStream.close ();

            }

        } catch (IOException e) {
            e.printStackTrace ();
        }

    }
}