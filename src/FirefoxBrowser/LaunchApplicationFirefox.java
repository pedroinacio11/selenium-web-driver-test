package FirefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Util.GeraCPF;

public class LaunchApplicationFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Desenvolvimento\\Selenium\\DriverFirefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mobileid.certisign.com.br/banking/");
		driver.quit();
		
		
		GeraCPF CPF = new GeraCPF();
		
		WebElement campoDeTexto = driver.findElement(By.id("txtCPF"));
		campoDeTexto.sendKeys(CPF.generate());
		
		//WebElement botaoAutenticar = driver.findElement(By.id("btnAutenticar"));
		//botaoAutenticar.click();
		
	}	
	

		
	
	
}
