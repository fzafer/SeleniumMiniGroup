package Day01_Project1;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekTestPage {

    public static void main(String[] args) throws InterruptedException{

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //5-	Open webpage www.turkeyoutdoor.org
        driver.get("https://www.turkeyoutdoor.org");

        //6-	Click on “Forum” link
        WebElement forum = driver.findElement(By.linkText("FORUM"));
        forum.click();

        //7-	Click “İsim” input box and write a name
        WebElement isim = driver.findElement(By.id("isim"));
        isim.sendKeys("Test");

        //	Commit and Push
        //8-	Click “e-posta”  input box and write a email
        WebElement emailText=driver.findElement(By.id("e-posta"));
        emailText.sendKeys("vahap@gmail.com");
        //	Commit an push





        //9-	Click “mesaj” input box and write a name


        //driver.close();
        //	Commit and Push
        //10-   Click the "Bize Yazın" button
        //11-	 Verify the result box is contain "başarılı" Word
        //	Commit and Push
        //12- Take page the Previous Page
        //13-Verify the Title is “Türkiye'nin Outdoor Sayfası”












    }



}
