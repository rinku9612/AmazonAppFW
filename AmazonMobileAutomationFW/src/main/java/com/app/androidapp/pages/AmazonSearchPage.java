package com.app.androidapp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.app.android.lib.GenericLibrary;
import com.app.androidapp.init.Constants;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AmazonSearchPage {
	
	AndroidDriver<WebElement> driver;
	
	
	public AmazonSearchPage(AndroidDriver<WebElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id ="com.amazon.mShop.android.shopping:id/rs_search_src_text")
	private MobileElement searchbtn;
	
	
	@AndroidFindBy(id ="com.amazon.mShop.android.shopping:id/rs_search_src_text")
	private MobileElement searchbox;
	public void tapOnSearchBtn()
	{
		searchbtn.click();	
	}

	public void setValue() {
		searchbtn.sendKeys(GenericLibrary.getProprtyValue(Constants.DCfile, "search_item"));	
	}
	public void selectEnter() {
		searchbtn.sendKeys(Keys.ENTER);
	}
}
