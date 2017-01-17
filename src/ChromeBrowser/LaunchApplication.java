package ChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Util.GeraCPF;

public class LaunchApplication {
	
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Desenvolvimento\\Selenium\\DriverChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://mobileid.certisign.com.br/banking/");
		
		GeraCPF CPF = new GeraCPF();
		
		WebElement campoDeTexto = driver.findElement(By.id("txtCPF"));
		campoDeTexto.sendKeys(CPF.generate());
		
		WebElement botaoAutenticar = driver.findElement(By.id("btnAutenticar"));
		botaoAutenticar.click();
		
	}

}
