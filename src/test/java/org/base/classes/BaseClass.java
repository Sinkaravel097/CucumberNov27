package org.base.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	/*
	 * Base class contains only reusable methods ( just for storing the method ) No
	 * main method
	 */

	public static WebDriver driver;

	public static void launchBrowser() {

//		if (browserName.equals("Chrome")) {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\VISHAL\\eclipse-workspace\\Cucumber_8.30am\\chromeDri\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		} 
//	else if (browserName.equals("Firefox")) {
//
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		} else if (browserName.equals("Edge")) {
//
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		}

	}

	public static void maxWindow() {

		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {

		driver.get(url);
	}

	public static void getThePageTitle() {

		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getTheUrl() {

		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void closeTheBrowser() {

		driver.quit();
	}

	public static void passText(WebElement txtElement, String txt) {

		txtElement.sendKeys(txt);
	}

	public static void clickWebElement(WebElement btnElement) {

		btnElement.click();
	}

	public static void takeTheScreenshot(String imgName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\VISHAL\\eclipse-workspace\\Maven_9.30am\\images\\" + imgName + ".png");
		FileUtils.copyFile(src, des);
	}

	public static Actions a;

	public static void moveTheCursor(WebElement targetWebElement) {

		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();
	}

	public static void dragAndDropTheWebElement(WebElement src, WebElement desc) {

		a = new Actions(driver);
		a.dragAndDrop(src, desc).perform();
	}

	public static String readDataFromExcel(String sheetName, int getTheRow, int getTheCell) throws IOException {

		File f = new File("C:\\Users\\VISHAL\\eclipse-workspace\\Maven_9.30am\\Excel Files\\newsheet.xlsx");

		FileInputStream fis = new FileInputStream(f); // throw FileNotFoundException

		Workbook w = new XSSFWorkbook(fis); // throw IOException

		Sheet s = w.getSheet(sheetName);

		Row r = s.getRow(getTheRow);

		Cell c = r.getCell(getTheCell);

		int cellType = c.getCellType();

		// by default cellType == 1 ---> String Cell
		// cellType otherthan 1 ---> Date Cell or Numeric Cell

		String value = "";
		if (cellType == 1) {

			value = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) { // which cell contains date it will return true

			Date dd = c.getDateCellValue(); // Sun Nov 10 00:00:00 IST 1996
			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy"); // 10-11-1996
			value = sim.format(dd);
		} else {

			double d = c.getNumericCellValue(); // 283845.0
			long l = (long) d; // 283845
			value = String.valueOf(l); // "283845"
		}
		return value;
	}

	// Create the excel file
	public static void createExcelFile(int creTheRow, int creTheCell, String data) throws IOException {

		File f = new File("C:\\Users\\VISHAL\\eclipse-workspace\\Maven_9.30am\\Excel Files\\NewFile.xlsx");

		Workbook wb = new XSSFWorkbook();

		Sheet newSheet = wb.createSheet("datas");

		Row newRow = newSheet.createRow(creTheRow);

		Cell newCell = newRow.createCell(creTheCell);

		newCell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(f); // FileNotFoundException

		wb.write(fos); // IOException

		System.out.println("Writed....");
	}

	// Create cell only
	public static void createCellOnly(int getTheRow, int creTheCell, String data) throws IOException {

		File f = new File("C:\\Users\\VISHAL\\eclipse-workspace\\Maven_9.30am\\Excel Files\\NewFile.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet newSheet = wb.getSheet("datas");

		Row newRow = newSheet.getRow(getTheRow);

		Cell newCell = newRow.createCell(creTheCell);

		newCell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(f); // FileNotFoundException

		wb.write(fos); // IOException

		System.out.println("Writed....");
	}

	// Create row only
	public static void createRowOnly(int creTheRow, int creTheCell, String data) throws IOException {

		File f = new File("C:\\Users\\VISHAL\\eclipse-workspace\\Maven_9.30am\\Excel Files\\NewFile.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet newSheet = wb.getSheet("datas");

		Row newRow = newSheet.createRow(creTheRow);

		Cell newCell = newRow.createCell(creTheCell);

		newCell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(f); // FileNotFoundException

		wb.write(fos); // IOException

		System.out.println("Writed....");
	}

	// excel update
	public static void updateTheExcelFile(int getTheRow, int getTheCell, String getTheData, String setTheData)
			throws IOException {

		File f = new File("C:\\Users\\VISHAL\\eclipse-workspace\\Maven_9.30am\\Excel Files\\NewFile.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet newSheet = wb.getSheet("datas");

		Row newRow = newSheet.getRow(getTheRow);

		Cell newCell = newRow.getCell(getTheCell);

		String datas = newCell.getStringCellValue();

		// Java.equals.("Java")
		if (datas.equals(getTheData)) {

			newCell.setCellValue(setTheData);
		}

		FileOutputStream fos = new FileOutputStream(f); // FileNotFoundException

		wb.write(fos); // IOException

		System.out.println("Writed....");
	}
	
	
	public static String jdbcConnection() { 
		
		Connection con = null; 
		
		String snameClmn="";

		try {
			
			// 1. Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ClassNotFoundException
			
			// 2. Connect to database
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin"); // SQLException
			
			// 3. Write a SQL query
			String query = "select sname from student where sname='Raj'"; 
			
			// 4. Prepare the statement
			PreparedStatement ps = con.prepareStatement(query);
			
			//5. execute query
			ResultSet ex = ps.executeQuery();
			
			// if rows present in table --> it will return true
			// if rows doesn't present in table --> it will return false
			// 6. Iterate the datas
			while (ex.next()) {
				
				snameClmn = ex.getString("sname");	
			}		
		} 
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			
			try {
				
				// 7. Close the db connection
				con.close();  // SQLException
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
						
		}
		return snameClmn;

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
