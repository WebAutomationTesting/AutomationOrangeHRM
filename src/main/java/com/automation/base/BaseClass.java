package com.automation.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	public static WebDriver driver;
    public static Properties config;
    public static Properties locator;
    public static String currDir=System.getProperty("user.dir");
	
    @BeforeSuite
	public void initbrowser() throws IOException {
		
		loaddata();
		
		if ("Win".equalsIgnoreCase(config.getProperty("OS"))) {
			if ("Chrome".equalsIgnoreCase(config.getProperty("browser"))) {
				System.setProperty("webdriver.chrome.driver",currDir+"\\src\\test\\resources\\Browser\\chromedriver.exe");
				driver= new ChromeDriver();
				driver.manage().window().maximize();
			}else if ("Firefox".equalsIgnoreCase(config.getProperty("browser"))) {
				System.setProperty("webdriver.gecko.driver",currDir+"\\src\\test\\resources\\Browser\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			}else if ("edge".equalsIgnoreCase(config.getProperty("browser"))) {
				System.setProperty("webdriver.edge.driver", currDir+"\\src\\test\\resources\\Browser\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().window().maximize();
			}else {
				System.out.println("Given browser Not available .......... ");
			}
		} else if ("Mac".equalsIgnoreCase(config.getProperty("OS"))){
			if ("Chrome".equalsIgnoreCase(config.getProperty("browser"))) {
				System.setProperty("webdriver.chrome.driver",currDir+"//src/test//resources//Browser//chromedriver");
				driver= new ChromeDriver();
				driver.manage().window().maximize();
			}else if ("Firefox".equalsIgnoreCase(config.getProperty("browser"))) {
				System.setProperty("webdriver.gecko.driver",currDir+"//src//test//resources//Browser//geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			}else if ("safari".equalsIgnoreCase(config.getProperty("browser"))) {
				System.setProperty("webdriver.safari.driver", "");
				driver = new SafariDriver();
				driver.manage().window().maximize();
			}else {
				System.out.println("Given browser Not available .......... ");
			}
		}else {
			System.out.println("Given OS not Available .........");
		}
		driver.get(config.getProperty("applicationURL"));
		
	}
   
		
	public  static void loaddata() throws IOException {
		FileInputStream fis=new FileInputStream(currDir+"//src//test//resources//Config//applicationProperties");
		config=new Properties();
		config.load(fis);
	}
		
		
}
