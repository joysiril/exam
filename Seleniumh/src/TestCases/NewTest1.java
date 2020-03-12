package TestCases;

import org.testng.annotations.Test;

import Basicclass.launch;
import Pages_pack.pages;

import org.testng.annotations.BeforeClass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest1 extends launch

{
	WebDriver dr;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  
		  dr=lanc();
		 
		 
	  }
  @Test
  public void f() throws InterruptedException {
	 
	  pages pa=new pages(dr);
	 pa.pagestotal();
	 String   downloadPath = System.getProperty("user.dir") + File.separator + "downloads";
	 File f=new File(downloadPath+"\\IEDriverServer_x64_3.150.1.zip");
	 boolean b=true;
	 b=f.exists();
	 if(b==true) {
		 Assert.assertTrue(b, "meet the requirements");
	 }
	 else {
		 Assert.assertTrue(b,"Dont meet the requirements");
	 }
  }
  

  @AfterClass
  public void afterClass() {
	  dr.close();
	 
	  
	  
  }

}
