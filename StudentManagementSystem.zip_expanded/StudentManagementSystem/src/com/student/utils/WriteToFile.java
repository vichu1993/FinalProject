package com.student.utils;

import com.student.management.Student;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

public class WriteToFile {

	public static void writeCountryListToFile(String fileName, List<Student> studentList) throws Exception{
		Workbook workbook = null;
		
		if(fileName.endsWith("xlsx")){
			workbook = new XSSFWorkbook();
		}else if(fileName.endsWith("xls")){
			workbook = new HSSFWorkbook();
		}else{
			throw new Exception("invalid file name, should be xls or xlsx");
		}
		
		Sheet sheet = workbook.createSheet("Students");
		
		Iterator<Student> iterator = studentList.iterator();

		Row row = sheet.createRow(1);
		Cell cell0 = row.createCell(0);
		cell0.setCellValue("FirstName");
		Cell cell1 = row.createCell(1);
		cell1.setCellValue("LastName");
		Cell cell2 = row.createCell(2);
		cell2.setCellValue("Courses");
		Cell cell3 = row.createCell(3);
		cell3.setCellValue("RegistrationID");
		Cell cell4 = row.createCell(4);
		cell4.setCellValue("GradeYear");
		Cell cell5 = row.createCell(5);
		cell5.setCellValue("IsFeePaid");
		Cell cell6 = row.createCell(6);
		cell6.setCellValue("TuitionBalance");

		int rowIndex = 2;
		while(iterator.hasNext()){
			Student student = iterator.next();
			Row row1 = sheet.createRow(rowIndex++);
			Cell cell7 = row1.createCell(0);
			cell7.setCellValue(student.getFirstName());
			Cell cell8 = row1.createCell(1);
			cell8.setCellValue(student.getLastName());
			Cell cell9 = row1.createCell(2);
			cell9.setCellValue(student.getStudentCourses());
			Cell cell10 = row1.createCell(3);
			cell10.setCellValue(student.getStudentregistrationID());
			Cell cell11 = row1.createCell(4);
			cell11.setCellValue(student.getGradeYear());
			Cell cell12 = row1.createCell(5);
			cell12.setCellValue(student.isFeePaid());
			Cell cell13 = row1.createCell(6);
			cell13.setCellValue(student.getTuitionBalance());
		}
		
		//lets write the excel data to file now
		FileOutputStream fos = new FileOutputStream(fileName);
		workbook.write(fos);
		fos.close();
		System.out.println(fileName + " written successfully");
	}
	
	/*public static void main(String args[]) throws Exception{
		List<Student> list = ReadExcelFileToList.readExcelData("Sample.xlsx");
		WriteToFile.writeCountryListToFile("Students.xls", list);
	}*/
}
