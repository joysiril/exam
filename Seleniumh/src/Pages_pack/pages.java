package Pages_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pages {
	WebDriver dr;
	public pages(WebDriver dr) {
		this.dr=dr;
	}
	
	public void Download_btn() throws InterruptedException {
		dr.findElement(By.xpath("//*[@id=\"navbar\"]/a[1]")).click();
		Thread.sleep(2000);
	}
	public void iebroswe_btn() throws InterruptedException {
		
		dr.findElement(By.xpath("/html/body/div[2]/div[2]/p/a[2]")).click();
		//dr.findElement(By.xpath("//a[@href='https://selenium-release.storage.googleapis.com/3.150/IEDriverServer_x64_3.150.1.zip']"));
		Thread.sleep(5000);
	}
	public void pagestotal() throws InterruptedException {
		
		this.Download_btn();
		this.iebroswe_btn();
	}

}
