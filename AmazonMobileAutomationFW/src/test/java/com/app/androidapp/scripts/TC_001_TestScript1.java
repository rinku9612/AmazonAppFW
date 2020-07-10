package com.app.androidapp.scripts;
import java.io.IOException;

import org.testng.annotations.Test;

import com.app.android.lib.BaseLib;
import com.app.androidapp.pages.AmazonLandingPage;
import com.app.androidapp.pages.AmazonSearchPage;
import com.app.androidapp.pages.SearchResultPage;
import com.app.androidapp.util.MobileActionUtil;

public class TC_001_TestScript1 extends BaseLib {

	
	@Test
	public void search_item() throws IOException, Throwable {
		AmazonLandingPage lp=new AmazonLandingPage(gv.driver);
		AmazonSearchPage sp=new AmazonSearchPage(gv.driver);
		SearchResultPage res=new SearchResultPage(gv.driver);
		lp.tapOnAppbtn();
		sp.tapOnSearchBtn();
		sp.setValue();
		MobileActionUtil.hideKeyboard(gv.driver);
		sp.selectEnter();
		res.tapOnSelectItem();
		
		
	}
}
