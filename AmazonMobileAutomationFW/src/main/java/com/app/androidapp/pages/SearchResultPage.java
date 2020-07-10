package com.app.androidapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchResultPage {
AndroidDriver<WebElement> driver;
	
	
	public SearchResultPage(AndroidDriver<WebElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Mi']")
	private MobileElement SelectedItem;
	
	
	@AndroidFindBy(id ="com.amazon.mShop.android.shopping:id/rs_search_src_text")
	private MobileElement searchbox;
	public void tapOnSelectItem()
	{
		SelectedItem.click();	
	}
}
