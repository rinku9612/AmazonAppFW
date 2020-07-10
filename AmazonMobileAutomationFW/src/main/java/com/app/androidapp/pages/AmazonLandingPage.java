package com.app.androidapp.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.app.androidapp.util.MobileActionUtil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AmazonLandingPage {
	
	AndroidDriver<WebElement> driver;
	@AndroidFindBy(id="com.amazon.mShop.android.shopping:id/skip_sign_in_button")
	private MobileElement skipBtn;
	
	public AmazonLandingPage(AndroidDriver<WebElement> driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void tapOnAppbtn() throws IOException, InterruptedException
	{
		MobileActionUtil.tapOnElement(skipBtn, driver);
	}
}

