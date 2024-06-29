package Apache_poi;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

    public class read_excel {
    public static void main (String args[]) throws IOException{
        String location="C://Users//admin//git//intelli_project_1//Excel_fold//data_driven.xlsx";
        FileInputStream fi=new FileInputStream(location);
        XSSFWorkbook wb=new XSSFWorkbook(fi);
        XSSFSheet sheet=wb.getSheetAt(0);
        int row=sheet.getLastRowNum();
        int cell= sheet.getRow(0).getLastCellNum();
        for(int i=0;i<row;i++)
        {
            XSSFRow xr=sheet.getRow(i);
            for(int j=0;j<cell;j++)
            {
                XSSFCell xc=xr.getCell(j);
                switch(xc.getCellType())
                {
                    case STRING :System.out.print(xc.getStringCellValue()); break;
                    case NUMERIC:System.out.print(xc.getNumericCellValue());break;
                    case BOOLEAN:System.out.print(xc.getBooleanCellValue());break;
                }
                System.out.print(" "+"|");
            }
            System.out.println();
            System.out.println("trail");
        }

    }
}
