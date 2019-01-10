package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelUtils 
{

	public static void excel(String path, String sheetname) throws FileNotFoundException
	{
		FileInputStream fis =new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		
	}
}
