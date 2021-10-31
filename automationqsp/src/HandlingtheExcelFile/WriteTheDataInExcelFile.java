package HandlingtheExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteTheDataInExcelFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");//the path of excel file which we want to read
		Workbook wb = WorkbookFactory.create(fis);//create() will make the excel file ready for read operation
		Sheet sh = wb.getSheet("City");// specify the sheet name
		Row row = sh.getRow(1);//specified which row
	
		Cell cell = row.createCell(1);//specify+create cell
		cell.setCellValue("Praju");//store the data
		
		FileOutputStream fos = new FileOutputStream("./data/Testdata.xlsx");
		wb.write(fos);//write the data
		wb.close();//close the heavy resource
	}

}
