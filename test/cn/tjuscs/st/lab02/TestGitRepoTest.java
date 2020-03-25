package cn.tjuscs.st.lab02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cn.tjuscs.st.lab01.PayMoney;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

@RunWith(Parameterized.class)
public class TestGitRepoTest {
	private String user_number;
	private String password;
	private String information;
	
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    
    public TestGitRepoTest(String user_number, String password, String information) {
    	this.user_number = user_number;
    	this.password = password;
    	this.information = information;
    }
   
    @Before
    public void setUp() {
	    String driverPath = System.getProperty("user.dir") + "/src/resources/driver/geckodriver.exe";
	    System.setProperty("webdriver.gecko.driver", driverPath);
		
	    driver = new FirefoxDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
    }
  
	@After
	public void tearDown() {
	    driver.quit();
	}
  
    @Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][] {
			{"3017218053", "https://gitee.com/chenkuochih/software_test.git", "https://gitee.com/chenkuochih/software_test.git"},
			{"3017218054", "https://gitee.com/roshan0/software_test.git", "https://gitee.com/roshan0/software_test.git"},
			{"3017218055", "https://gitee.com/dai88X/software_test.git", "https://gitee.com/dai88X/software_test.git"},
			{"3017218056", "https://github.com/Bing-Max/SoftwareTest.git", "https://github.com/Bing-Max/SoftwareTest.git",},
			{"3017218057", "https://github.com/YumengGuo/SoftwareTesting", "https://github.com/YumengGuo/SoftwareTesting",},
			{"3017218058", "https://github.com/howAreYouHkk/SoftwareTestingTechnology", "https://github.com/howAreYouHkk/SoftwareTestingTechnology",},
			{"3017218059", "https://github.com/Eternal144/Software-Testing", "https://github.com/Eternal144/Software-Testing",},
			{"3017218060", "https://gitee.com/HangxueLiu/softwareTest.git", "https://gitee.com/HangxueLiu/softwareTest.git",},
			{"3017218061", "https://github.com/qq734628996/software-test", "https://github.com/qq734628996/software-test",},
			{"3017218062", "https://github.com/cxdzb/software-testing-technology", "https://github.com/cxdzb/software-testing-technology",},
			{"3017218063", "https://github.com/PathfinderTJU/Softwate_test_homework", "https://github.com/PathfinderTJU/Softwate_test_homework",},
			{"3017218064", "https://github.com/Martin12345677/software_testing_technology", "https://github.com/Martin12345677/software_testing_technology",},
			{"3017218065", "https://gitee.com/panliming0418/softwareTestingTechnology.git", "https://gitee.com/panliming0418/softwareTestingTechnology.git",},
			{"3017218066", "https://gitee.com/taytaytaytaylor11/SoftwareTesting", "https://gitee.com/taytaytaytaylor11/SoftwareTesting",},
			{"3017218067", "https://gitee.com/surumeng/test3017218067", "https://gitee.com/surumeng/test3017218067",},
			{"3017218068", "https://gitee.com/Sunhanyu/SoftwareTestingTechnology.git", "https://gitee.com/Sunhanyu/SoftwareTestingTechnology.git",},
			{"3017218069", "https://github.com/HaomingSun-1895/Software-Testing-hw.git", "https://github.com/HaomingSun-1895/Software-Testing-hw.git",},
			{"3017218070", "https://github.com/Taoboan1999/Taoboan1999", "https://github.com/Taoboan1999/Taoboan1999",},
			{"3017218071", "https://github.com/tianzhaotju/software_testing", "https://github.com/tianzhaotju/software_testing",},
			{"3017218072", "https://github.com/ZhaomengWang/software_testing", "https://github.com/ZhaomengWang/software_testing",},
		});
	}
	
    @Test
    public void testGitRepo() {
	    driver.get("http://103.120.226.190/selenium-demo/git-repo");
	    driver.manage().window().setSize(new Dimension(701, 643));
	    driver.findElement(By.name("user_number")).click();
	    driver.findElement(By.name("user_number")).sendKeys(this.user_number);
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys(this.password);
	    driver.findElement(By.cssSelector(".btn")).click();
	    assertEquals(this.information, driver.findElement(By.xpath("//form/div[last()-1]/code")).getText());
    }
}
