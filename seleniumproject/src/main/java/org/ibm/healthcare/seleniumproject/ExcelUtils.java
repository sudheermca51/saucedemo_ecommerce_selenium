package org.ibm.healthcare.seleniumproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	 
	
	public static String[][] readXLSX() throws IOException
	{
		File f = new File("data.xlsx");
		FileInputStream fis = new FileInputStream(f);	
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rows = sheet.getPhysicalNumberOfRows();//4
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();//2

		String data[][] = new String[rows][cols];

		for(int i=0;i<rows;i++){
			{
				for(int j=0;j<cols;j++)
				{
					CellType cellType = sheet.getRow(i).getCell(j).getCellType();
					switch(cellType) {
					
					case STRING:
						data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
						break;
					case NUMERIC:
						data[i][j] = String.valueOf(sheet.getRow(i).getCell(j).getNumericCellValue());
						break;
					
					}
					System.out.print(data[i][j]+"--" );
				}
				System.out.println();
			}

		}
		fis.close();
		return data;
	}

}
