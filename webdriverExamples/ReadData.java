package webdriverExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
//Get Data from Particular Cell
	public static String getData(String filename, int row, int col) throws Exception {
		String filepath = ".//testdata//" + filename + ".xlsx";
		FileInputStream instream = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(instream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	//Get Data from Particular row values
		public static List<String> getData(String filename, int row) throws Exception {
			List<String> rowData= new ArrayList<String>();
			String filepath = ".//testdata//" + filename + ".xlsx";
			FileInputStream instream = new FileInputStream(filepath);
			XSSFWorkbook workbook = new XSSFWorkbook(instream);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int cellscount=sheet.getRow(row).getLastCellNum();//no.of cells in particular row
			for(int i=0;i<cellscount;i++)
			{
				String data = sheet.getRow(row).getCell(i).getStringCellValue();

				rowData.add(data);
			}
			return rowData;
		}
		
		//Get Data from table
				public static String[][] getData(String filename) throws Exception {
					String filepath = ".//testdata//" + filename + ".xlsx";
					FileInputStream instream = new FileInputStream(filepath);
					XSSFWorkbook workbook = new XSSFWorkbook(instream);
					XSSFSheet sheet = workbook.getSheet("Sheet1");
					int lastrow=sheet.getLastRowNum(); // last row index number
					int cellscount=sheet.getRow(0).getLastCellNum();//no.of cells in particular row
					String data[][] = new String[lastrow][cellscount];
					int k=0,l;
					for(int i=1;i<=lastrow;i++)
					{
						 l=0;
						for(int j=0;j<cellscount;j++)
						{
							String data1 = sheet.getRow(i).getCell(j).getStringCellValue();
	                         data[k][l]=data1;
	                         l++;
						}
						k++;
					}
					return data;
				}
		
	//getLocator from Properties file
				
				public static String getLocator(String filename,String key) throws Exception
				
				{
					String filepath =".//locators//"+filename+".properties";
					FileInputStream instream = new FileInputStream(filepath);
					Properties pro=new Properties();
					pro.load(instream);
					return pro.getProperty(key);
				}
	
	public static void main(String[] args) throws Exception {
		String data=ReadData.getData("info", 5, 1);
		System.out.println("Cell Data : "+data);
		List<String> rowData=ReadData.getData("info", 5);
		System.out.println("Row Data :\n"+rowData);
		String data1[][]=ReadData.getData("info");
		System.out.println("Complete Table");
		for(int i=0;i<data1.length;i++)
		{
			for(int j=0;j<data1[i].length;j++)
			{
				System.out.print(data1[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("Locator : "+ReadData.getLocator("loginpage", "loginBtn_L"));
	}
}
