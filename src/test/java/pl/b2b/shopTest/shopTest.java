package pl.b2b.shopTest;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopTest {

	private WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	}

	// @Test
	// public void
	// sprzawdzCzyPoKliknieciuLogowaniaNastapiloPrawidlowePrzekierowanie() {
	// UtilAutomationStatic.klikniecieLogowania(driver);
	// assertEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account",
	// driver.getCurrentUrl());
	//
	// //
	// http://automationpractice.com/index.php?controller=authentication&back=my-account
	// }
	//
	// @Test
	// public void sprawdzCzyNastapiloPrzekierowanieNaContactUs() {
	// WebElement element =
	// driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a"));
	// element.click();
	//
	// assertEquals("http://automationpractice.com/index.php?controller=contact",
	// driver.getCurrentUrl());
	// }
	//
	// @Test
	// public void czyMoznaSieZalogowac() {
	// UtilAutomationStatic.logowanie(driver);
	// assertEquals("http://automationpractice.com/index.php?controller=my-account",
	// driver.getCurrentUrl());
	// }

	// @Test
	// public void przechodzenieDoStronyWomen() {
	// UtilAutomationStatic.logowanie(driver);
	// UtilAutomationStatic.wybieranieZakladkiWomen(driver);
	// assertEquals("http://automationpractice.com/index.php?id_category=3&controller=category",
	// driver.getCurrentUrl());
	//
	// }
	//
	// @Test
	// public void czyIloscKategoriiPoZalogowaniuSieOrazWybraniuSekcjiWomenWynosi2()
	// {
	// UtilAutomationStatic.logowanie(driver);
	// UtilAutomationStatic.wybieranieZakladkiWomen(driver);
	// List<WebElement> wybor =
	// UtilAutomationStatic.pobranieElementowKategorii(driver);
	// assertEquals(true, wybor.size() == 2);

	// }

	// @Test
	// public void
	// czyIloscWlasciwosciPoZalogowaniuSieOrazWybraniuSekcjiWomenWynosi5() {
	// UtilAutomationStatic.logowanie(driver);
	// UtilAutomationStatic.wybieranieZakladkiWomen(driver);
	// List<WebElement> wybor =
	// UtilAutomationStatic.pobranieElementowProperies(driver);
	//
	// assertEquals(true, wybor.size() == 5);
	// }
	//
	//
	// @Test
	// public void czyPoZalogowaniuOrazWejsciuWZakladkeWomenWsrodSizeJestOpcjaL() {
	// UtilAutomationStatic.logowanie(driver);
	// UtilAutomationStatic.wybieranieZakladkiWomen(driver);
	// List<WebElement> wybor = UtilAutomationStatic.pobranieElementowSize(driver);
	// boolean czyJestL =
	// UtilAutomationStatic.czyPoZalogowaniuOrazWejsciuWZakladkeWomenWsrodSizeJestOpcjaL(wybor);
	//
	//
	// assertEquals(true, czyJestL);
	//
	// }

	// @Test
	// public void
	// czyPoZalogowaniuOrazWejsciuWZakladkeTshirtsIloscKolorowJestRowna2() {
	// UtilAutomationStatic.logowanie(driver);
	// UtilAutomationStatic.wybieranieZakladkiTshirts(driver);
	// List<WebElement> wybor =
	// UtilAutomationStatic.pobieranieElementowColor(driver);
	//
	// assertEquals(true, wybor.size() == 2);

	// }

//	@Test
//	public void czyIloscKolorowNaZakladceDressesOrazTShirtsJestWiekszaOdDresses() {
//		UtilAutomationStatic.logowanie(driver);
//		UtilAutomationStatic.wybieranieZakladkiTshirts(driver);
//		List<WebElement> kolorTShirts = UtilAutomationStatic.pobieranieElementowColor(driver);
//
//		UtilAutomationStatic.wybieranieZakladkiDresses(driver);
//		List<WebElement> kolorDresses = UtilAutomationStatic.pobieranieElementowColor(driver);
//
//		assertEquals(true, kolorTShirts.size() > kolorDresses.size());
//	}
	
	@Test
	public void poZalogowaniuSieIWybraniuSekcjiDressesKliknijWSekcjiSizeRozmiarL() {
		UtilAutomationStatic.logowanie(driver);
		UtilAutomationStatic.wybieranieZakladkiDresses(driver);
		UtilAutomationStatic.wybieranieZakladkiCasual(driver);
		UtilAutomationStatic.wybieranieSukienki(driver);
		UtilAutomationStatic.wybieranieAddToCard(driver);
		//UtilAutomationStatic.wybieranieProceedToCheckout(driver);
		UtilAutomationStatic.przekierowanieDoKoszyka(driver);
		List<WebElement> wybor = UtilAutomationStatic.pobranieElementowTabeli(driver);
		
		assertEquals(true, wybor.size() == 1);
		
		}
	}
	
	// @After
	// public void close() {
	// driver.quit();
	// }


