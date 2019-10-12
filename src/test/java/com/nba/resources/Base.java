package com.nba.resources;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import com.nba.stepdefinition.Hook;


public class Base {
	public  void launch(String url) {
		 Hook.driver.get(url);

		}
		public void type(WebElement ele,String name) {
			
			ele.sendKeys(name);
		}
		public void btn(WebElement ele) {
			
			ele.click();

		}
		
		public static List<HashMap<String, String>> readvaluefromExcelSheet()
		{
			List<HashMap<String, String>> mapDatasList=new ArrayList<HashMap<String,String>>();
			try {
				File excelLocation=new File("E:\MavenPOMBaseIntegration-master\MavenPOMBaseIntegration-master\Excel\ExcelValues for name and Password.xlsx");
				String sheetName="Sheet1";
				FileInputStream f=new FileInputStream(excelLocation.getAbsolutePath());
				Workbook w=new XSSFWorkbook(f);
				Sheet sheet=w.getSheet(sheetName);
				Row headerRow=sheet.getRow(0);
				for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
					Row currentRow=sheet.getRow(i);
					HashMap<String, String> mapDatas=new HashMap<String, String>();
					for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
						Cell currentCell=currentRow.getCell(j);
						
							switch(currentCell.getCellType()) {
							
								case Cell.CELL_TYPE_STRING:
								mapDatas.put(headerRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
								break;
								
								case Cell.CELL_TYPE_NUMERIC:
								mapDatas.put(headerRow.getCell(j).getStringCellValue(), String.valueOf(currentCell.getNumericCellValue()));
								break;
						}
						
					}
					mapDatasList.add(mapDatas);
				}
				
			} catch (Throwable e) {
				e.printStackTrace();
			}
			
			
			return mapDatasList;
			
		}
}
