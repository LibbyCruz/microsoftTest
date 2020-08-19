package test_microsoft_web_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class menu_validation {

	 WebDriver driver = new ChromeDriver();
	    
	   public menu_validation(){
	        
	        PageFactory.initElements(this.driver, this);
	   } 
	    
	    public boolean isWindowMenu(WebElement elementHomePage){
	        return elementHomePage.isDisplayed();
	    }
	

	    @BeforeClass
	    public void openWindowPage(){
	        this.driver.navigate().to("https://www.microsoft.com/en-us/");
	    }
	    
	    @Test
	    public void verifyElement(WebElement menu){
	        
	    	this.driver.get("https://www.microsoft.com/en-us/");

			String getTitle = this.driver.getTitle();
			Assert.assertEquals(getTitle, "Microsoft - Official Home Page");
			
	       // Assert.assertTrue(this.isWindowMenu(menu));
	    }
	    
	    @AfterClass
	    public void closeBrowser(){
	        this.driver.quit();
	    }
	
	
	@FindBy(id = "shellmenu_0")
		private WebElement homeMenu0;{
			this.verifyElement(homeMenu0);
	}
	
    
	@FindBy(id = "shellmenu_1")
	private WebElement homeMenu1;{
		this.verifyElement(homeMenu1);
	}
	
	@FindBy (id = "shellmenu_2")
	private WebElement homeMenu2;{
		this.verifyElement(homeMenu2);
	}
	
	@FindBy (id = "shellmenu_3")
	private WebElement homeMenu3;{
		this.verifyElement(homeMenu3);
	}
	
	@FindBy (id = "shellmenu_4")
	private WebElement homeMenu4;{
		this.verifyElement(homeMenu4);
	}
	
	@FindBy (id = "shellmenu_5")
	private WebElement homeMenu5;{
		this.verifyElement(homeMenu5);
	}
	@FindBy (id = "l1_support")
	private WebElement home_l1_support;{
		this.verifyElement(home_l1_support);
	}
}
