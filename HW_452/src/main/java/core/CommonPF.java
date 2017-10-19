package core;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPF {

	static WebDriver driver;
	//PageFactory.initElements(driver, CommonPF.class);
	public static void open(String url) {
		String USERAGENT = "macOS / Safari 10:               Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12) AppleWebKit/602.2.14 (KHTML, like Gecko) Version/10.0.1 Safari/602.2.14";
		Logger.getLogger("").setLevel(Level.OFF);
		driver = new HtmlUnitDriver();
		PageFactory.initElements(driver, CommonPF.class);
		((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		((HtmlUnitDriver) driver).getBrowserVersion().setUserAgent(USERAGENT);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("UserAgent: " + (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;"));
		System.out.println("Page URL: " + driver.getCurrentUrl());
	}
	public static void openSafari(String url) {
		//public static void main (String [] args) {
			Logger logger = Logger.getLogger("");
			logger.setLevel(Level.OFF);
			
			if (!System.getProperty("os.name").contains("Mac")) {throw new IllegalArgumentException("Safari is available only on Mac");}
			
			driver = new SafariDriver();
			PageFactory.initElements(driver, CommonPF.class);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//String url = "http://alex.academy/exe/signup/v1/index.php";
			System.out.println("Page URL"+driver.getCurrentUrl());
			driver.get(url);}
	
	public static void quite() {
		driver.quit();
	}

	public static boolean isPresent(By by) {
		if (driver.findElements(by).size() > 0) return true;
		else return false;
	}
	
    public static boolean isPresentPF(WebElement element) {

        try {element.getTagName(); return true;}
        		catch (NoSuchElementException e) {return false;}
    }

	public static boolean isVisible(By by) {
		if ((driver.findElements(by).size() > 0) && driver.findElement(by).isDisplayed()) return true;
		else return false;
	}
	
public static void pageValidation(String test_case, By el) {
		System.out.println(test_case +	(Common.isPresent(el) ? "Exists" : "Not exist")); 
}

public static void pageValidationPF(String test_case, WebElement element) {
	System.out.println(test_case +	(isPresentPF(element) ? "Exists" : "Not exist")); 
}

					
	@FindBy(id="id_quotes")  static WebElement pf_1;
	
	
     @FindBy(id="id_current_location") static WebElement pf_2;
	@FindBy(id="id_weather_icon") static WebElement pf_3;
	@FindBy(id="id_temperature") static WebElement pf_4;
	@FindBy(id="id_f_title") static WebElement pf_5;
	@FindBy(how=How.ID,using="id_f_label_fn") static WebElement pf_6;
	@FindBy (how=How.ID,using="id_fname") static WebElement pf_7;
	@FindBy (how=How.ID,using="id_f_label_ln") static WebElement pf_8;
	@FindBy (how=How.ID,using="id_lname") static WebElement pf_9;
	@FindBy(how=How.ID,using="id_email") static WebElement pf_10;
	@FindBy(how=How.ID,using="id_f_label_pn") static WebElement pf_11;
	@FindBy(how=How.ID,using="id_phone") static WebElement pf_12;
	@FindBy(how=How.ID,using="id_rb_label_m") static WebElement pf_13;
	@FindBy(how=How.ID,using="id_gender_male") static WebElement pf_14;
	@FindBy(how=How.ID,using="id_rb_label_f") static WebElement pf_15;
	@FindBy(how=How.ID,using="id_gender_female") static WebElement pf_16;
	@FindBy(how=How.ID,using="id_state") static WebElement pf_18;
	@FindBy(how=How.XPATH,using="//*[@id='id_state']/option[6]") static WebElement pf_19;
	@FindBy(how=How.ID,using="id_cb_label_t") static WebElement pf_20;
	@FindBy(how=How.ID,using="id_terms") static WebElement pf_21;
	@FindBy(how=How.ID,using="id_img_facebook") static WebElement pf_22;
	@FindBy(how=How.ID,using="id_img_twitter") static WebElement pf_23;
	@FindBy(how=How.ID,using="id_img_youtube") static WebElement pf_24;
	@FindBy(how=How.ID,using="id_reset_button") static WebElement pf_25;
	@FindBy(how=How.ID,using="id_submit_button") static WebElement pf_26;
	@FindBy(how=How.ID,using="os_browser") static WebElement pf_27;
	@FindBy(how=How.ID,using="ErrorLine") static WebElement pf_28;
	@FindBy(how=How.ID,using="fname_error") static WebElement pf_29;
	@FindBy(how=How.ID,using="lname_error") static WebElement pf_30;
	@FindBy(how=How.ID,using="email_error") static WebElement pf_31;
	@FindBy(how=How.ID,using="phone_error") static WebElement pf_32;
	@FindBy(how=How.ID,using="id_gender") static WebElement pf_33;
    @FindBy(how=How.ID,using="id_back_button") static WebElement pf_34;
    @FindBy(how=How.XPATH,using="//*[@id='fname_error']/img") static WebElement pf_35;
    @FindBy(how=How.XPATH,using="//*[@id='lname_error']/img") static WebElement pf_36;
    @FindBy(how=How.XPATH,using="//*[@id='email_error']/img") static WebElement pf_37;
    @FindBy(how=How.XPATH,using="//*[@id='phone_error']/img") static WebElement pf_38;
	
	

	
	
}
