package pl.b2b.shopTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilAutomationStatic {

	public static void klikniecieLogowania(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		element.click(); // developer musi sam wiedziec, ze znaleziony element jest klikalny

	}

	public static void logowanie(WebDriver driver) {
		klikniecieLogowania(driver);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("b2bnetworkwarszawa@gmail.com");

		WebElement haslo = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		haslo.sendKeys("n3tw0rk2017");

		WebElement submit = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		submit.click();
	}
	
	
	public static void wybieranieZakladkiWomen(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		element.click();////*[@id="block_top_menu"]/ul/li[1]/a
	}
	
	public static List<WebElement> pobranieElementowKategorii(WebDriver driver){
		WebElement kategorie = driver.findElement(By.xpath("//*[@id=\"ul_layered_category_0\"]"));
		List<WebElement> wybor = kategorie.findElements(By.tagName("li"));
		return wybor;
	}
	
	
	public static List<WebElement> pobranieElementowProperies(WebDriver driver) {
		WebElement kategorie1 = driver.findElement(By.xpath("//*[@id=\"ul_layered_id_feature_7\"]"));
		List<WebElement> wybor = kategorie1.findElements(By.tagName("li"));
		return wybor;
		
	}
	public static List<WebElement> pobranieElementowSize(WebDriver driver) {
	WebElement kategoria2 = driver.findElement(By.xpath("//*[@id=\"ul_layered_id_attribute_group_1\"]"));
	List<WebElement> wybor = kategoria2.findElements(By.tagName("li"));
	return wybor;
}
	public static boolean czyPoZalogowaniuOrazWejsciuWZakladkeWomenWsrodSizeJestOpcjaL(List<WebElement> wybor) {
	boolean czyJestL = false;
	for(WebElement element : wybor) {
	if (element.getText().contains("L")) {
		czyJestL = true;
	}
}return czyJestL;
	}
	
	public static void wybieranieZakladkiTshirts(WebDriver driver) {
	WebElement element = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
	element.click();////*[@id="block_top_menu"]/ul/li[1]/a
	}
	
	public static List<WebElement> pobieranieElementowColor(WebDriver driver){
		WebElement kategoria3 = driver.findElement(By.xpath("//*[@id=\"ul_layered_id_attribute_group_3\"]"));
		List<WebElement> wybor = kategoria3.findElements(By.tagName("li"));
		return wybor;
	}
	
	public static void wybieranieZakladkiDresses(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		element.click();////*[@id="block_top_menu"]/ul/li[1]/a
		}
	
	public static void wybieranieZakladkiCasual(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
		element.click();////*[@id="block_top_menu"]/ul/li[1]/a
		}
	public static void wybieranieSukienki(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		element.click();////*[@id="block_top_menu"]/ul/li[1]/a
		}
	public static void wybieranieAddToCard(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		element.click();////*[@id="block_top_menu"]/ul/li[1]/a
		}
	public static void wybieranieProceedToCheckout(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		element.click();////*[@id="block_top_menu"]/ul/li[1]/a
		}
	public static List<WebElement> pobranieElementowTabeli(WebDriver driver) {
		WebElement tabela = driver.findElement(By.xpath("//*[@id=\"cart_summary\"]/tbody"));
		List<WebElement> wybor = tabela.findElements(By.tagName("tr"));
		return wybor;
}
	public static void wybieranieGetCard(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b"));
		element.click();////*[@id="block_top_menu"]/ul/li[1]/a
}
	
	public static void przekierowanieDoKoszyka(WebDriver driver) {
		driver.navigate().to("http://automationpractice.com/index.php?controller=order");
}
}
