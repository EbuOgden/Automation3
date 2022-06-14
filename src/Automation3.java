import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Automation3 {

  static public WebDriver driver;

  public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "/Users/ebu/Desktop/SEL/chromedriver");

    String website = "https://www.carfax.com";
    String expectedTitle = "Used Car";
    String[] teslaModels = {"Model 3", "Model S", "Model X", "Model Y"};
    String expectedCurrentPageContentSecondPage = "Step 2 - Show me cars with";
    String expectedTeslaModels = "Tesla Model S";

    driver = new ChromeDriver();
    driver.manage().window().maximize();

    String[] cookies = {
      "optimizelyEndUserId=oeu1655182097905r0.10489003278858977",
      "_gcl_au=1.1.552803572.1655182098",
      "sessionID_cookie=108413960",
      "AMCVS_AAC63BC75245B47C0A490D4D%40AdobeOrg=1",
      "_biz_sid=2da614",
      "s_ecid=MCMID%7C06792540293142476273963944776125869669",
      "AMCV_AAC63BC75245B47C0A490D4D%40AdobeOrg=1585540135%7CMCIDTS%7C19158%7CMCMID%7C06792540293142476273963944776125869669%7CMCAAMLH-1655786898%7C7%7CMCAAMB-1655786898%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1655189298s%7CNONE%7CMCAID%7CNONE%7CvVersion%7C4.4.0",
      "gpv_v151=Homepage",
      "s_visit=1",
      "s_tp=3064",
      "_biz_uid=1c61bb7918e843c4cd0d402ef440a11b",
      "_biz_flagsA=%7B%22Version%22%3A1%2C%22Ecid%22%3A%22-110477062%22%2C%22ViewThrough%22%3A%221%22%2C%22XDomain%22%3A%221%22%7D",
      "_ga=GA1.2.1818585200.1655182098",
      "_gid=GA1.2.18344910.1655182098",
      "QSI_HistorySession=https%3A%2F%2Fwww.carfax.com%2F~1655182098608",
      "_clck=1s8zysw|1|f2b|0",
      "uuid=16fd9f6e-ba8b-4762-af7e-33bb3ab53a36",
      "d_l_a=%7B%22fname%22%3A%22%22%2C%22lname%22%3A%22%22%2C%22hzip%22%3A%22%22%2C%22emailHashed256%22%3A%22%22%2C%22pno%22%3A%22%22%7D",
      "crv=2.345.0",
      "abt=notEligible",
      "s_sess=%20s_cc%3Dtrue%3B",
      "_gat_UA-25773335-1=1",
      "datadome=.C_4NIny2nJ2Don-LCQIsHxXfkOjlzJ~lkETjHMjEr3D9G52aaArslq5uKw~cdewmeUFT3okKJBNkZ.9C.YDX9gp8yrIuSWPAOU87tJlpGZPwz3Ia~9Igq9bUllA8MLn",
      "cto_bundle=kHvmiV9tWXQ4SE5saU95YlRydGR1N3hkY3d5aTRlSzlCbXlnYUFuVGsxS1N5SFBDUE9SWUolMkZZV2hlMmhWZ21SdXh5MHUzaGQlMkZXQmFQelJjVWlOJTJGQXg5UGdDdiUyQldHZ29hQ1NVVlYwVUd4THFaTWFPWjZHSjlsYkZxVWhxZ0ZCWVpuem9WWDhieW0yeDFnbnJWVnBuWWxrVTZoeWJwTG1zbmJkNkpBZXhRaFA0SEpTUEdHOUdyUjNNY0plbWJLRjVDOHVWdg",
      "s_pers=%20gpv_p17%3Dno%2520value%7C1655184045644%3B%20gpv_p18%3Dno%2520value%7C1655184045646%3B",
      "_biz_nA=12",
      "s_ppv=Homepage%2C15%2C15%2C453",
      "s_cc=true",
      "_biz_pendingA=%5B%5D",
      "OptanonConsent=isIABGlobal=false&datestamp=Tue+Jun+14+2022+00%3A50%3A46+GMT-0400+(Eastern+Daylight+Time)&version=6.31.0&hosts=&landingPath=NotLandingPage&groups=C0001%3A1%2CC0002%3A1%2CC0003%3A1%2CC0004%3A1&AwaitingReconsent=false&geolocation=US%3BVA",
      "OptanonAlertBoxClosed=2022-06-14T04:50:46.338Z",
      "s_ht=1655182246359",
      "s_hc=1%7C0%7C0%7C0%7C0",
      "QSI_S_SI_bxPJMe6bjt0TnGR=r:2:6",
      "s_ptc=pt.rdr%240.00%5E%5Ept.apc%240.00%5E%5Ept.dns%240.00%5E%5Ept.tcp%240.00%5E%5Ept.req%240.21%5E%5Ept.rsp%240.00%5E%5Ept.prc%240.58%5E%5Ept.onl%240.05%5E%5Ept.tot%240.87%5E%5Ept.pfi%241",
      "_uetsid=35aab640eb9d11ecb64b7d836ec35d61",
      "_uetvid=35ab2f50eb9d11ec91c84710064417ce",
      "_clsk=l2n47b|1655182247192|10|0|i.clarity.ms/collect",
      "s_tps=6",
      "s_pvs=5",
      "s_sq=carfaxcom%3D%2526c.%2526a.%2526activitymap.%2526page%253DHomepage%2526link%253DFind%252520a%252520Used%252520Car%2526region%253Dhero-buttons-container%2526pageIDType%253D1%2526.activitymap%2526.a%2526.c%2526pid%253DHomepage%2526pidt%253D1%2526oid%253Dhttps%25253A%25252F%25252Fwww.carfax.com%25252Fcars-for-sale%2526ot%253DA"
    };



    driver.get(website);
    Thread.sleep(randNumber(1000, 2333));
    driver.manage().deleteAllCookies();

    for (String cookie : cookies) {
      String[] cook = cookie.split("=");
      driver.manage().addCookie(new Cookie(cook[0], cook[1]));
    }
    Thread.sleep(randNumber(750, 1922));

    WebElement carsForSaleLink = getElementByXPath("//a[@href='/cars-for-sale']");
    Thread.sleep(randNumber(933, 1544));
    carsForSaleLink.click();

    String currentPageTitle = driver.getTitle();

    Assert.assertTrue(currentPageTitle.contains(expectedTitle));

    Select carMakes = new Select(getElementByXPath("//select[@name='make']"));

    Thread.sleep(randNumber(999, 4000));
    carMakes.selectByIndex(31);

    Select carModels = new Select(getElementByXPath("//select[@name='model']"));

    Thread.sleep(randNumber(1000, 2350));

    List<WebElement> modelsSelect = carModels.getOptions();

    Thread.sleep(randNumber(900, 1734));

    for(int i = 0; i < teslaModels.length; i++){
      Assert.assertTrue(modelsSelect.get(i+1).getText().contains(teslaModels[i]));
    }

    carModels.selectByIndex(2);

    Thread.sleep(randNumber(494, 1234));

    sendKeysElementXPath("//input[@name='zip']", "22182");

    Thread.sleep(randNumber(259, 773));
    clickElementById("make-model-form-submit-button");

    String currentPageContent = driver.getPageSource();

    Thread.sleep(randNumber(1000, 2000));
    Assert.assertTrue(currentPageContent.contains(expectedCurrentPageContentSecondPage));

    Thread.sleep(randNumber(259, 773));

    WebElement noAccidentBox = getElementByXPath("//div[@class='noAccident']/following-sibling::span[2]");

    noAccidentBox.click();

    Thread.sleep(randNumber(339, 813));

    WebElement oneOwner = getElementByXPath("//div[@class='owner1']/following-sibling::span[2]");

    oneOwner.click();

    Thread.sleep(randNumber(444, 777));

    WebElement personalUse = getElementByXPath("//div[@class='personal']/following-sibling::span[2]");

    personalUse.click();

    Thread.sleep(randNumber(319, 555));

    WebElement serviceHistory = getElementByXPath("//div[@class='service']/following-sibling::span[2]");

    serviceHistory.click();

    Thread.sleep(randNumber(319, 555));

    WebElement showMeResultsNumber = getElementByClassName("totalRecordsText");

    String showMeResultsNumberText = showMeResultsNumber.getText();

    Thread.sleep(randNumber(200, 400));

    clickElementByXPath("//span[@class='totalRecordsText']/parent::button");

    Thread.sleep(randNumber(2000, 2090));

    List<WebElement> carResultsList = getElementsByXPath("//*[starts-with(@id, 'listing_')]");
    List<Integer> carPrices = new ArrayList<>();
    List<Integer> carMiles = new ArrayList<>();
    List<Integer> carYears = new ArrayList<>();

    Thread.sleep(randNumber(200, 309));

    Assert.assertEquals(showMeResultsNumberText, String.valueOf(carResultsList.size()));


    for(WebElement carResult : carResultsList){
      Assert.assertTrue(carResult.findElement(By.className("srp-list-item-basic-info-model")).getText().contains(expectedTeslaModels));
    }

    for(int i = 0; i < carResultsList.size() - 1; i++){
      carPrices.add(Integer.valueOf(carResultsList.get(i).findElement(By.className("srp-list-item-price")).getText().split("\\$")[1].replace(",", "")));
      carMiles.add(Integer.valueOf(carResultsList.get(i).findElement(By.className("srp-list-item-basic-info-value")).getText().split(" ")[1].replace(",", "")));
      carYears.add(Integer.valueOf(carResultsList.get(i).findElement(By.className("srp-list-item-basic-info-model")).getText().split(" ")[0].replace(",", "")));
    }

    Collections.sort(carPrices, Collections.reverseOrder()); // high to low car prices
    Collections.sort(carMiles); // low to high miles
    Collections.sort(carYears, Collections.reverseOrder()); // new to old years

    Select selectSort = new Select(getElementByXPath("//select[@aria-label=\"SelectSort\"]"));
    Thread.sleep(randNumber(437, 771));

    selectSort.selectByIndex(1);

    Thread.sleep(randNumber(1203, 1367));

    carResultsList = getElementsByXPath("//*[starts-with(@id, 'listing_')]");

    for(int i = 0; i < carResultsList.size() - 1; i++){
      Integer currentCarPrice = Integer.valueOf(carResultsList.get(i).findElement(By.className("srp-list-item-price")).getText().split("\\$")[1].replace(",", ""));
      Assert.assertEquals(currentCarPrice, carPrices.get(i));
    }

    Thread.sleep(randNumber(139, 237));

    selectSort.selectByIndex(4);

    Thread.sleep(randNumber(1339, 2019));

    carResultsList = getElementsByXPath("//*[starts-with(@id, 'listing_')]");

    for(int i = 0; i < carResultsList.size() - 1; i++){
      Integer currentCarMileage = Integer.valueOf(carResultsList.get(i).findElement(By.className("srp-list-item-basic-info-value")).getText().split(" ")[1].replace(",", ""));
      Assert.assertEquals(currentCarMileage, carMiles.get(i));
    }

    Thread.sleep(randNumber(227, 419));

    selectSort.selectByIndex(5);

    Thread.sleep(randNumber(1275, 1992));

    carResultsList = getElementsByXPath("//*[starts-with(@id, 'listing_')]");

    for(int i = 0; i < carResultsList.size() - 1; i++){
      Integer currentCarYear = Integer.valueOf(carResultsList.get(i).findElement(By.className("srp-list-item-basic-info-model")).getText().split(" ")[0].replace(",", ""));
      Assert.assertEquals(currentCarYear, carYears.get(i));
    }

    driver.quit();

  }

  public static void clickElementById(String element){
    driver.findElement(By.id(element)).click();
  }

  public static void clickElementByXPath(String xPath){
    driver.findElement(By.xpath(xPath)).click();
  }

  public static void sendKeysElementById(String element, String keys){
    driver.findElement(By.id(element)).sendKeys(keys);
  }

  public static void sendKeysElementXPath(String element, String keys){
    driver.findElement(By.xpath(element)).sendKeys(keys);
  }

  public static WebElement getElementById(String element){
    return driver.findElement(By.id(element));
  }

  public static WebElement getElementByClassName(String element){
    return driver.findElement(By.className(element));
  }

  public static WebElement getElementByXPath(String element){
    return driver.findElement(By.xpath(element));
  }

  public static List<WebElement> getElementsByXPath(String element){
    return driver.findElements(By.xpath(element));
  }

  public static int randNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }

}

