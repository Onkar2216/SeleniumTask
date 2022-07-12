package SeleniumSession;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class ExcelSheetConcepts
{
	public static void main(String[] args) throws IOException 
	{
			FileInputStream excel=new FileInputStream("D:/Study Data/Velocity Class/Topics For Mock.xlsx");
			XSSFWorkbook fs= new XSSFWorkbook(excel);
			XSSFSheet sheet=fs.getSheetAt(1);
			int rowValue =sheet.getLastRowNum();
			for(int i=0;i<rowValue;i++)
			{
				Row row=sheet.getRow(i);
				int colValue=row.getLastCellNum();
				for(int j=0;j<colValue;j++)
				{
					Cell data=row.getCell(j);
					String x=data.getStringCellValue();
					System.out.print(x+"                   ");	
				}
				System.out.println();
			}
			fs.close();
	}

}
