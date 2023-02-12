package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class SeleniumManagerTest {
	
	public static void main(String[] args) {
		
		
		String driverpath = SeleniumManager.getInstance().getDriverPath("msedgedriver");
	
		
		System.out.println(driverpath);
		
		//WebDriver driver = new EdgeDriver();
		
		
		
		
		
	}

}
