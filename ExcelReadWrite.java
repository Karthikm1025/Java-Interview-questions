package javaInterviewProgram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ExcelReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File src1 = new File ("C:\\Users\\karthikmo\\Documents\\Test1.xlsx");

		FileInputStream wb = new FileInputStream (src1);

		XSSFWorkbook wc = new XSSFWorkbook(wb);

		XSSFSheet sh = wc.getSheet("Sheet1");

		Row R = sh.getRow(1);

		Cell C = R.getCell(0);
		Cell C2 = R.getCell(1);

		String Username = C.toString();

		String Pwd = C2.toString();

		System.out.println(Username);

		System.out.println(Pwd);
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\karthikmo\\edgedriver_win64\\msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("username")).sendKeys(Username);
		
		driver.findElement(By.name("password")).sendKeys(Pwd);
		
		driver.findElement(By.xpath("//button[normalize-space(text()=\"Login\")]")).click();
		
		
		
		
	}

}
