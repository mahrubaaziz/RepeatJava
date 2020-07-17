package repeatJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingW {

	public static void main(String[] args) throws IOException {
		
		File xlfile = new File("E:\\Testdata for xl read.xlsx");
		
		FileInputStream xlFIS =new FileInputStream(xlfile); //giving is the option for reading file
		
		//file type xls =HSSF, xlsx= XSSF
		//creating work book object ref.
		XSSFWorkbook xlbook = new XSSFWorkbook(xlFIS);
		//creating ref. sheet from that work book providing sheet name
		XSSFSheet xlsheet = xlbook.getSheet("Testdata");
		
		//creating object for row and cell for multiple data set
		XSSFRow objrow;
		XSSFCell objcell;
		//trying to find last row number
		System.out.println(xlsheet.getLastRowNum());
		//making the for loops from 1st row to last row to get the value
		for(int j = 1; j<xlsheet.getLastRowNum(); j++){
			//telling the objrow  to initializing the the sheet  to get the value
			objrow = xlsheet.getRow(j);
			//first comes the row then column or cell this could change on different frame work
			objcell = objrow.getCell(0);
			System.out.println(objcell.getStringCellValue());
			//obj cell refering to the row
			objcell = objrow.getCell(1);
			System.out.println(objcell.getStringCellValue());
			//going to the cell then row and pointing them then create the cell 
			//then pass the value
			objcell = objrow.createCell(2);
			objcell.setCellValue("PASS");
		}
		
		FileOutputStream xlFOS =new FileOutputStream(xlfile);
		xlbook.write(xlFOS);
		xlFIS.close();
		xlFOS.close();
		
		//Read and single data set
		//getting the row where my data is my data is on cell 1 row 1
		/*XSSFRow xlrow = xlsheet.getRow(1);
		XSSFCell xlcell = xlrow.getCell(1);
		
		System.out.println(xlcell.getStringCellValue());
		//printing the string value 
		xlcell = xlrow.getCell(0);
		System.out.println(xlcell.getStringCellValue());
		xlbook.close();
		
		//tellig to go back  to cell 0 and get the numeric value
		//xlcell = xlrow.getCell(0);
		//System.out.println(xlcell.getNumericCellValue()); //when we will want to get any input any number
		
		//sending some value to the same work book
		FileOutputStream xlFOS = new FileOutputStream(xlfile);
		
		xlrow.createCell().setCellValue("Passed");//creating a cell and passing value
		//we telling where I want to write it
		*/
		xlbook.write(xlFOS);
		xlbook.close();
	}
	
	

}
