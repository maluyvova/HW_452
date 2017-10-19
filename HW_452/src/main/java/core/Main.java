package core;

import org.openqa.selenium.WebDriver;

public class Main {
	static long start;
	static long finish;
	static WebDriver driver;
	public static void main(String[] args) {
		System.out.println("Browser: HtmlUnit");
		SignUpPF.validate(driver, "http://alex.academy/exe/signup/v1/index.php");
		ConfirmationPF.validate(driver, "http://alex.academy/exe/signup/v1/confirmation.php");
		CommonPF.quite();
	}

}
