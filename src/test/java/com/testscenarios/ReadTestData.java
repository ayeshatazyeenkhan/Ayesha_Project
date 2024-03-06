package com.testscenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.event.CellEditorListener;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.ss.usermodel.CellCopyContext;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ReadTestData {

	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("C:\\Users\\atazy\\Dropbox\\My PC (LAPTOP-508B8E88)\\Desktop\\sinu sir recording 2024_Microsoft Excel Worksheet (.xlsx)");
 Workbook wb = new XSSFWorkbook(fi);
 Sheet ws = wb.getSheet("testdata");
 Row r = ws.getRow(0);
 Cell c  = r.getCell(0);
 System.out.println(c.getStringCellValue());
 
  
	}

}
