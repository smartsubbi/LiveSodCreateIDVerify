package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MembershipPage 
{
	
    WebDriver driver;
    String oneMonthExpectedPrice = "$9.99";    
    String threeMonthsExpectedPrice = "$24.99";
    String threeMonthsExpectedSavings = "Save $4.98!"; 
    String sixMonthsExpectedPrice = "$47.99";
    String sixMonthsExpectedSavings = "Save $11.94!"; 
    String twelveMonthsExpectedPrice = "$84.99";
    String twelveMonthsExpectedSavings = "Save $34.92!"; 
    
    
    public MembershipPage(WebDriver driver)
	{
		this.driver = driver;
	}
    
	@FindBy(xpath="//a[@id='ctl00_mcp_btnMemberShip'][.='Membership']")
	WebElement memebershipPurchaseTab;	
	
	/* Monthly */
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-one-month'][@onclick='membership.selectOpt(1);']")
	WebElement oneMonthMembershipOption;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-one-month'][@onclick='membership.selectOpt(1);']/div[@class='membership-option'][.='Monthly']")
	WebElement monthlyText;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-one-month'][@onclick='membership.selectOpt(1);']/div[@class='membership-price']")
	WebElement monthlyPrice;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-one-month'][@onclick='membership.selectOpt(1);']/div[@class='membership-gemsmo monthlygems'][.='500 Gems/Mo.']")
	WebElement monthlyGems;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-one-month'][@onclick='membership.selectOpt(1);']/div[@class='membership-value'][.='($5 Value)']")
	WebElement monthlyValue;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-one-month'][@onclick='membership.selectOpt(1);']/div[@class='buy-mem-now-btn']")
	public WebElement monthlyBuyNowButton;
	
	/* 3 Months */
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-three-months'][@onclick='membership.selectOpt(2);']")	                 
	WebElement threeMonthMembershipOption;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-three-months'][@onclick='membership.selectOpt(2);']/div[@class='membership-option'][.='3 Months']")
	WebElement threeMonthsText;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-three-months'][@onclick='membership.selectOpt(2);']/div[@class='membership-price']")
	WebElement threeMonthsPrice;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-three-months'][@onclick='membership.selectOpt(2);']/div[@class='membership-savings']")
	WebElement threeMonthsSavings;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-three-months'][@onclick='membership.selectOpt(2);']/div[@class='membership-gemsmo'][.='500 Gems/Mo.']")
	WebElement threeMonthsGems;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-three-months'][@onclick='membership.selectOpt(2);']/div[@class='membership-value'][.='($15 Value)']")
	WebElement threeMonthsValue;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-three-months'][@onclick='membership.selectOpt(2);']/div[@class='buy-mem-now-btn']")
	WebElement threeMonthsBuyNowButton;	
	
	/* 6 months */
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-six-months '][@onclick='membership.selectOpt(3);']")	                 
	WebElement sixMonthsMembershipOption;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-six-months '][@onclick='membership.selectOpt(3);']/div[@class='membership-option'][.='6 Months']")
	WebElement sixMonthsText;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-six-months '][@onclick='membership.selectOpt(3);']/div[@class='membership-price']")
	WebElement sixMonthsPrice;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-six-months '][@onclick='membership.selectOpt(3);']/div[@class='membership-savings']")
	WebElement sixMonthsSavings;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-six-months '][@onclick='membership.selectOpt(3);']/div[@class='membership-gemsmo'][.='500 Gems/Mo.']")
	WebElement sixMonthsGems;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-six-months '][@onclick='membership.selectOpt(3);']/div[@class='membership-value'][.='($30 Value)']")
	WebElement sixMonthsValue;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-six-months '][@onclick='membership.selectOpt(3);']/div[@class='buy-mem-now-btn']")
	WebElement sixMonthsBuyNowButton;	
	
	/* 12 Months */
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-annual'][@onclick='membership.selectOpt(4);']")	                 
	WebElement twelveMonthsMembershipOption;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-annual'][@onclick='membership.selectOpt(4);']/div[@class='membership-option'][.='12 Months']")
	WebElement twelveMonthsText;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-annual'][@onclick='membership.selectOpt(4);']/div[@class='membership-price']")
	WebElement twelveMonthsPrice;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-annual'][@onclick='membership.selectOpt(4);']/div[@class='membership-savings']")
	WebElement twelveMonthsSavings;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-annual'][@onclick='membership.selectOpt(4);']/div[@class='membership-gemsmo'][.='500 Gems/Mo.']")
	WebElement twelveMonthsGems;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-annual'][@onclick='membership.selectOpt(4);']/div[@class='membership-value'][.='($60 Value)']")
	WebElement twelveMonthsValue;
	
	@FindBy(xpath="//div[@class='SFDMembershipOption option-annual'][@onclick='membership.selectOpt(4);']/div[@class='buy-mem-now-btn']")
	WebElement twelveMonthsBuyNowButton;	
	
	/* Membership Features */	
	  
	String[] elements = { 
			"//table[@id='tblMembershipFeatures']/tbody/tr[3]/td[1][.='Access to Icestorm Island Expansion Pack ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[3]/td[2]/a[@id='btn21'][@class='features-playbtn'][@href='javascript:showFeature(21);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[3]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[3]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[3]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[3]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[4]/td[1][.='500 Free Gems monthly! ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[4]/td[2]/a[@id='btn13'][@class='features-playbtn'][@href='javascript:showFeature(22);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[4]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[4]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[4]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[4]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[5]/td[1][.='Mystery Box of Dragon Eggs Monthly ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[5]/td[2]/a[@id='btn20'][@class='features-playbtn'][@href='javascript:showFeature(20);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[5]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[5]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[5]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[5]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[6]/td[1][.='All Flight Club Dragons ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[6]/td[2]/a[@id='btn8'][@class='features-playbtn'][@href='javascript:showFeature(23);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[6]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[6]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[6]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[6]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[7]/td[1][.='Increased Activity Rewards ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[7]/td[2]/a[@id='btn2'][@class='features-playbtn'][@href='javascript:showFeature(24);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[7]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[7]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[7]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[7]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[8]/td[1][.='20% off in the Store ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[8]/td[2]/a[@id='btn14'][@class='features-playbtn'][@href='javascript:showFeature(25);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[8]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[8]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[8]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[8]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[9]/td[1][.='Double player energy ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[9]/td[2]/a[@id='btn16'][@class='features-playbtn'][@href='javascript:showFeature(16);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[9]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[9]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[9]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[9]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[10]/td[1][contains(text(),'Hiccup')][contains(text(),'s Flight Suit ')]",
			"//table[@id='tblMembershipFeatures']/tbody/tr[10]/td[2]/a[@id='btn17'][@class='features-playbtn'][@href='javascript:showFeature(17);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[10]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[10]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[10]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[10]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[11]/td[1][.='No Ads ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[11]/td[2]/a[@id='btn15'][@class='features-playbtn'][@href='javascript:showFeature(15);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[11]/td[3][@class='tick1Month']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-monthly.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[11]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[11]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[11]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[12]/td[1][.='Your very own Toothless ']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[12]/td[2]/a[@id='btn18'][@class='features-playbtn'][@href='javascript:showFeature(18);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[12]/td[3]",
			"//table[@id='tblMembershipFeatures']/tbody/tr[12]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[12]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[12]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[13]/td[1][contains(text(),'Free ')][contains(text(),'Boulder Class')][contains(text(),'Stable ')]",
			"//table[@id='tblMembershipFeatures']/tbody/tr[13]/td[2]/a[@id='btn19'][@class='features-playbtn'][@href='javascript:showFeature(19);']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[13]/td[3]",
			"//table[@id='tblMembershipFeatures']/tbody/tr[13]/td[4][@class='tick3Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-3months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[13]/td[5][@class='tick6Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-6months.png']",
			"//table[@id='tblMembershipFeatures']/tbody/tr[13]/td[6][@class='tick12Months']/div[@class='checkmarks']/img[@width='19'][@height='20'][@src='//media.jumpstart.com/SODWebsite/Css/common/Default/Membership/Images/checkmark-12months.png']",
	};
	
	/* Payment Methods */
	
	@FindBy(xpath="//div[@id='dvPayPlus'][@class='payWallInGameOuter']")
	WebElement selectAPaymentMethodDB;
	
	@FindBy(xpath="//div[@id='dvPayPlus'][@class='payWallInGameOuter']/a[@id='close-btn'][@class='close'][@onclick='closecurrentPurchaseOverlay()']")
	WebElement selectAPaymentMethodDBCloseButton;
	
	@FindBy(xpath="//div[@id='dvPayPlus'][@class='payWallInGameOuter']/div[@id='dvPayPlusInner'][@class='payWallInGameInner']/div/h3[.='Select a payment method:']")
	WebElement selectAPaymentMethodText;
	
	@FindBy(xpath="//div[@id='dvPayPlus'][@class='payWallInGameOuter']/div[@id='dvPayPlusInner'][@class='payWallInGameInner']/a[@id='VISA'][@class='paymentMethodItem'][@onclick='javascript:DeepLink('VISA');']/div/img[@src='https://livegamer-cashin.s3.amazonaws.com/1/payments/sm-visa.png'][.='Visa']")
	public WebElement selectPaymentMethodVisa;
	
	@FindBy(xpath="//div[@id='dvPayPlus'][@class='payWallInGameOuter']/div[@id='dvPayPlusInner'][@class='payWallInGameInner']/a[@id='MASTERCARD'][@class='paymentMethodItem'][@onclick='javascript:DeepLink('MASTERCARD');']/div/img[@src='https://livegamer-cashin.s3.amazonaws.com/1/payments/sm-mastercard.png'][.='MasterCard']")
	WebElement selectPaymentMethodMasterCard;
	
	@FindBy(xpath="//iframe[@id='paywallFrame'][@class='payWallFrame'][@src='/Membership/paywall.aspx?subscription=Monthly&method=VISA'][@name='paywallFrame']")
	public WebElement visaPayWalliframe;
	
	/* payment method fields */
	
	@FindBy(xpath="//div[@id='field-row-firstName'][@class='field-row']/div[@id='field-firstName'][@class='field sub-field small-field first']/label[@class='rqd'][@for='input-firstName'][.='First Name:']")
	public WebElement firstNameTextPaymentMethodDB; 
	
	@FindBy(xpath="//div[@id='field-row-firstName'][@class='field-row']/div[@id='field-firstName'][@class='field sub-field small-field first']/input[@id='input-firstName'][@class='form-element text sub-field small-field first'][@type='text'][@name='firstName']")
	public WebElement firstNameTextInputFieldPaymentMethodDB;
	
	@FindBy(xpath="//div[@id='field-row-firstName'][@class='field-row']/div[@id='field-lastName'][@class='field sub-field small-field last']/label[@class='rqd'][@for='input-lastName'][.='Last Name:']")
	public WebElement lastNameTextPaymentMethodDB;
	
	@FindBy(xpath="//div[@id='field-row-firstName'][@class='field-row']/div[@id='field-lastName'][@class='field sub-field small-field last']/input[@id='input-lastName'][@class='form-element text sub-field small-field last'][@type='text'][@name='lastName']")
	public WebElement lastNameTextInputFieldPaymentMethodDB;	

	
	
	
	
    
	
	public void verifyMonthly()
	{
		Assert.assertTrue(oneMonthMembershipOption!=null);
		Assert.assertTrue(oneMonthMembershipOption.isDisplayed());
		Assert.assertTrue(monthlyText!=null);
		Assert.assertTrue(monthlyText.isDisplayed());
		
		Assert.assertTrue(monthlyPrice!=null);
		Assert.assertTrue(monthlyPrice.isDisplayed());
		String oneMonthActualPrice = monthlyPrice.getText();
		System.out.println(oneMonthActualPrice);	
		Assert.assertEquals(oneMonthActualPrice,oneMonthExpectedPrice);
		
		Assert.assertTrue(monthlyGems!=null);
		Assert.assertTrue(monthlyGems.isDisplayed());
		Assert.assertTrue(monthlyValue!=null);
		Assert.assertTrue(monthlyValue.isDisplayed());
		Assert.assertTrue(monthlyBuyNowButton!=null);
		Assert.assertTrue(monthlyBuyNowButton.isDisplayed());
	}
	
	public void verifyThreeMonthly()
	{
		Assert.assertTrue(threeMonthMembershipOption!=null);
		Assert.assertTrue(threeMonthMembershipOption.isDisplayed());
		Assert.assertTrue(threeMonthsText!=null);
		Assert.assertTrue(threeMonthsText.isDisplayed());		
		
		Assert.assertTrue(threeMonthsPrice!=null);
		Assert.assertTrue(threeMonthsPrice.isDisplayed());
		String threeMonthsActualPrice = threeMonthsPrice.getText();
		System.out.println(threeMonthsActualPrice);		
		Assert.assertEquals(threeMonthsActualPrice, threeMonthsExpectedPrice);		
		
		Assert.assertTrue(threeMonthsSavings!=null);
		Assert.assertTrue(threeMonthsSavings.isDisplayed());
		String threeMonthsActualSavings = threeMonthsSavings.getText();
		System.out.println(threeMonthsActualSavings);		
		Assert.assertEquals(threeMonthsActualSavings,threeMonthsExpectedSavings);		
		
		Assert.assertTrue(threeMonthsGems!=null);
		Assert.assertTrue(threeMonthsGems.isDisplayed());
		Assert.assertTrue(threeMonthsValue!=null);
		Assert.assertTrue(threeMonthsValue.isDisplayed());
		Assert.assertTrue(threeMonthsBuyNowButton!=null);
		Assert.assertTrue(threeMonthsBuyNowButton.isDisplayed());
	}
	
	public void verifySixMonthly()
	{
		Assert.assertTrue(sixMonthsMembershipOption!=null);
		Assert.assertTrue(sixMonthsMembershipOption.isDisplayed());
		Assert.assertTrue(sixMonthsText!=null);
		Assert.assertTrue(sixMonthsText.isDisplayed());		
		
		Assert.assertTrue(sixMonthsPrice!=null);
		Assert.assertTrue(sixMonthsPrice.isDisplayed());
		String sixMonthsActualPrice = sixMonthsPrice.getText();
		System.out.println(sixMonthsActualPrice);		
		Assert.assertEquals(sixMonthsActualPrice, sixMonthsExpectedPrice);		
		
		Assert.assertTrue(sixMonthsSavings!=null);
		Assert.assertTrue(sixMonthsSavings.isDisplayed());
		String sixMonthActualSavings = sixMonthsSavings.getText();
		System.out.println(sixMonthActualSavings);		
		Assert.assertEquals(sixMonthActualSavings,sixMonthsExpectedSavings);		
		
		Assert.assertTrue(sixMonthsGems!=null);
		Assert.assertTrue(sixMonthsGems.isDisplayed());
		Assert.assertTrue(sixMonthsValue!=null);
		Assert.assertTrue(sixMonthsValue.isDisplayed());
		Assert.assertTrue(sixMonthsBuyNowButton!=null);
		Assert.assertTrue(sixMonthsBuyNowButton.isDisplayed());
	}
	
	public void verifyTwelveMonths()
	{
		Assert.assertTrue(twelveMonthsMembershipOption!=null);
		Assert.assertTrue(twelveMonthsMembershipOption.isDisplayed());
		Assert.assertTrue(twelveMonthsText!=null);
		Assert.assertTrue(twelveMonthsText.isDisplayed());		
		
		Assert.assertTrue(twelveMonthsPrice!=null);
		Assert.assertTrue(twelveMonthsPrice.isDisplayed());
		String twelveMonthsActualPrice = twelveMonthsPrice.getText();
		System.out.println(twelveMonthsActualPrice);		
		Assert.assertEquals(twelveMonthsActualPrice, twelveMonthsExpectedPrice);		
		
		Assert.assertTrue(twelveMonthsSavings!=null);
		Assert.assertTrue(twelveMonthsSavings.isDisplayed());
		String TwelveMonthsActualSavings = twelveMonthsSavings.getText();
		System.out.println(TwelveMonthsActualSavings);		
		Assert.assertEquals(TwelveMonthsActualSavings,twelveMonthsExpectedSavings);		
		
		Assert.assertTrue(twelveMonthsGems!=null);
		Assert.assertTrue(twelveMonthsGems.isDisplayed());
		Assert.assertTrue(twelveMonthsValue!=null);
		Assert.assertTrue(twelveMonthsValue.isDisplayed());
		Assert.assertTrue(twelveMonthsBuyNowButton!=null);
		Assert.assertTrue(twelveMonthsBuyNowButton.isDisplayed());
	}
	
	public void verifyMembershipFeatures()
	{
		for(int i=0;i<elements.length;i++)
		{
			WebElement fetureCheck = driver.findElement(By.xpath(elements[i]));
			Assert.assertTrue(fetureCheck!=null);
			Assert.assertTrue(fetureCheck.isDisplayed());
		}
	}
	
	public void verifySelectAPaymentMethodDB()
	{
		Assert.assertTrue(selectAPaymentMethodDB!=null);
		Assert.assertTrue(selectAPaymentMethodDB.isDisplayed());
		Assert.assertTrue(selectAPaymentMethodDBCloseButton!=null);
		Assert.assertTrue(selectAPaymentMethodDBCloseButton.isDisplayed());
		Assert.assertTrue(selectAPaymentMethodText!=null);
		Assert.assertTrue(selectAPaymentMethodText.isDisplayed());
		Assert.assertTrue(selectPaymentMethodVisa!=null);
		Assert.assertTrue(selectPaymentMethodVisa.isDisplayed());	
		Assert.assertTrue(selectPaymentMethodMasterCard!=null);
		Assert.assertTrue(selectPaymentMethodMasterCard.isDisplayed());
	}
}