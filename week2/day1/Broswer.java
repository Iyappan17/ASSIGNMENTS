package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broswer {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
    driver.get("http://leaftaps.com/opentaps/control/main");
    driver.manage().window().maximize();
    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.linkText("Create Lead")).click();
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("iyappan");
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("p");
    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("dani");
    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("computer");
    driver.findElement(By.id("createLeadForm_description")).sendKeys("Education Institute");
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("iyappanp1708@gmail.com");
    driver.findElement(By.className("smallSubmit")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("updateLeadForm_description")).clear();
    driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("computer department only");
    driver.findElement(By.className("smallSubmit")).click();
    String title=driver.getTitle();
    System.out.println(title);
    
    
    
	
	
}
}
