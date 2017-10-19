package core;

import org.openqa.selenium.WebDriver;

public class ConfirmationPF {
	
	public static void validate(WebDriver driver, String url) {
		
		CommonPF.open(url);
		
		CommonPF.pageValidationPF("03. Element [First Name (field)]: ", CommonPF.pf_5);
		CommonPF.pageValidationPF("01. Element [Title]: ", 				CommonPF.pf_6);
		CommonPF.pageValidationPF("02. Element [First Name (label)]: ",	CommonPF.pf_7);
		CommonPF.pageValidationPF("03. Element [First Name (field)]: ", 	CommonPF.pf_8);
		CommonPF.pageValidationPF("04. Element [Last Name (label)]: ",	CommonPF.pf_9);
		CommonPF.pageValidationPF("05. Element [Last Name (field)]: ",	CommonPF.pf_10);
			
		CommonPF.pageValidationPF("06. Element [Email (label)]: ", 		CommonPF.pf_11);
		CommonPF.pageValidationPF("07. Element [Email (filed)]: ", 		CommonPF.pf_12);
		CommonPF.pageValidationPF("08. Element [Phone (label)]: ", 		CommonPF.pf_13);
		CommonPF.pageValidationPF("09. Element [Phone (field)]: ", 		CommonPF.pf_32);
		CommonPF.pageValidationPF("10. Element [Genre (label)]: ", 		CommonPF.pf_33);
			

		}
}
