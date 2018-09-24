package qsp;

import java.io.File;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class A {

	public static void main(String[] args)throws Exception {
		Workbook w = WorkbookFactory.create(new File("./data/book2.xlsx"));
		String s=w.getSheet("sheet1").getRow(1).getCell(1).toString();
		System.out.println(s);
	}}
	
	