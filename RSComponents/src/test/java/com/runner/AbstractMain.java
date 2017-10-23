package com.runner;

import org.openqa.selenium.WebDriver;

import com.pages.BasketSummaryPage;
import com.pages.BrandPage;
import com.pages.CategoryLandingPage;
import com.pages.CommonPage;
import com.pages.DeliveryPage;
import com.pages.HomePage;
import com.pages.OrderReviewPage;
import com.pages.PaymentPage;
import com.pages.ProductListingPage;
import com.pages.SearchResultsPage;
import com.pages.SubCategoryLandingPage1;
import com.pages.SubCategoryLandingPage2;

public class AbstractMain {

	public static WebDriver driver;
	public static OrderReviewPage orderReviewPage = new OrderReviewPage();
	public static BasketSummaryPage basketSummaryPage = new BasketSummaryPage();
	public static CategoryLandingPage categoryLandingPage = new CategoryLandingPage();
	public static CommonPage commonPage = new CommonPage();
	public static DeliveryPage deliveryPage = new DeliveryPage();
	public static HomePage homePage = new HomePage();
	public static PaymentPage paymentPage = new PaymentPage();
	public static SearchResultsPage searchResultsPage = new SearchResultsPage();
	public static SubCategoryLandingPage1 subCategoryLandingPage1 = new SubCategoryLandingPage1();
	public static SubCategoryLandingPage2 subCategoryLandingPage2 = new SubCategoryLandingPage2();
	public static ProductListingPage productListingPage = new ProductListingPage();
	public static BrandPage brandPage = new BrandPage();
}
