package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Readingwrting32 {
public static void main(String[] args) throws EncryptedDocumentException, Exception, FileNotFoundException, IOException {
	//read
	Workbook w = WorkbookFactory.create(new FileInputStream("./Input/Book1.xlsx"));
	String v = w.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(v);
	//write
	w.getSheet("sheet1").getRow(0).getCell(0).setCellValue("Sakthi");
	w.write(new FileOutputStream("./Input/Book2.xlsx"));
	w.close();
}
}
