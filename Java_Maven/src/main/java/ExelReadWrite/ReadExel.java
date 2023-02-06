package ExelReadWrite;

import org.apache.poi.ss.usermodel.*;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExel {

    public static void main(String[] args) throws Exception {
    	
    	String ProjectPath=System.getProperty("user.dir");
    	
    	System.out.println(ProjectPath);

        File f = new File(ProjectPath+"/src/main/java/ExelReadWrite/Data.xlsx");

        FileInputStream fi = new FileInputStream(f);

        Workbook workbook = WorkbookFactory.create(fi);

        Sheet sheet0 = workbook.getSheetAt(0);
        
        System.out.println(sheet0.getSheetName());

        Row row = sheet0.getRow(0);

        //Cell cell = row.getCell(2);

        System.out.println(row);


    /*    for (Row row : sheet0) {
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case Cell
                }


            }

        }
*/
        fi.close();


    }
}
