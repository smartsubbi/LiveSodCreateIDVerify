package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.CaptureScreenshot;
import Utility.HighLighter;

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
    ExtentTest logger;   
    
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
	public WebElement selectAPaymentMethodDBCloseButton;
	
	@FindBy(xpath="//div[@id='dvPayPlus'][@class='payWallInGameOuter']/div[@id='dvPayPlusInner'][@class='payWallInGameInner']/div/h3[.='Select a payment method:']")
	WebElement selectAPaymentMethodText;
	
	@FindBy(xpath="//div[@id='dvPayPlus'][@class='payWallInGameOuter']/div[@id='dvPayPlusInner'][@class='payWallInGameInner']/a[@id='VISA'][@class='paymentMethodItem']/div/img[@src='https://livegamer-cashin.s3.amazonaws.com/1/payments/sm-visa.png']")
	public WebElement selectPaymentMethodVisa;
	
	@FindBy(xpath="//div[@id='dvPayPlus'][@class='payWallInGameOuter']/div[@id='dvPayPlusInner'][@class='payWallInGameInner']/a[@id='MASTERCARD'][@class='paymentMethodItem']/div/img[@src='https://livegamer-cashin.s3.amazonaws.com/1/payments/sm-mastercard.png']")
	public	WebElement selectPaymentMethodMasterCard;
	
	@FindBy(xpath="//iframe[@id='paywallFrame'][@class='payWallFrame'][@src='/Membership/paywall.aspx?subscription=Monthly&method=VISA'][@name='paywallFrame']")
	public WebElement visaPayWalliframe;
	
	/* payment method fields */
	
	@FindBy(xpath=".//*[@id='country']")
	public WebElement indiaFlag;
	
	@FindBy(xpath=".//*[@id='field-firstName']/label[@class='rqd'][@for='input-firstName'][contains(text(),'First Name')]")
	public WebElement firstNameTextPaymentMethodDB; 
	
	@FindBy(xpath=".//*[@id='input-firstName'][@class='form-element text sub-field small-field first'][@type='text'][@name='firstName']")
	public WebElement firstNameTextInputFieldPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='field-lastName']/label[@class='rqd'][@for='input-lastName'][contains(text(),'Last Name')]")
	public WebElement lastNameTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-lastName'][@class='form-element text sub-field small-field last'][@type='text'][@name='lastName']")
	public WebElement lastNameTextInputFieldPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='field-cardNumber']/label[@class='rqd'][@for='input-cardNumber'][contains(text(),'Card Number')]")
	public WebElement creditCardNumberTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-cardNumber'][@class='form-element text '][@type='text'][@title='Please enter a valid card number with no spaces or hyphens'][@name='cardNumber']")
	public WebElement creditCardNumberInputPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='field-expMonth']/label[@class='rqd'][@for='input-expMonth'][contains(text(),'Month')]")
	public WebElement monthTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-expMonth'][@class='form-element sub-field small-field first'][@name='expMonth']")
	public WebElement monthSelectPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='field-expYear']/label[@class='rqd'][@for='input-expYear'][contains(text(),'Year')]")
	public WebElement yearTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-expYear'][@class='form-element sub-field small-field last'][@name='expYear']")
	public WebElement yearSelectPaymentMethodDB;   
	
	@FindBy(xpath=".//*[@id='field-cvv']/label[@class='rqd'][@for='input-cvv'][contains(text(),'Security Code')]")
	public WebElement securityCodeTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-cvv'][@class='form-element text small-field'][@type='text'][@name='cvv']")
	public WebElement securityCodeInputPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-storeCard'][@class='form-element checkbox'][@type='checkbox'][@name='storeCard']")
	public WebElement checkBoxPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='field-storeCard']/label[@for='input-storeCard'][contains(text(),'Remember credit card for future purchases')]")
	public WebElement checkBoxTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='field-stateProvince']/label[@for='input-stateProvince'][contains(text(),'Province')]")
	public WebElement provinceTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-stateProvince'][@class='form-element text dynamic'][@type='text'][@name='stateProvince']")
	public WebElement provinceInputPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='field-city']/label[@for='input-city'][contains(text(),'City')]")
	public WebElement cityTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-city'][@class='form-element text dynamic'][@type='text'][@name='city']")
	public WebElement cityInputPaymentMethodDB;	
	
	@FindBy(xpath=".//*[@id='field-address']/label[@for='input-address'][contains(text(),'Address')]")
	public WebElement addressTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-address'][@class='form-element text dynamic'][@type='text'][@name='address']")
	public WebElement addressInputPaymentMethodDB;	
	
	@FindBy(xpath=".//*[@id='field-postalCode']/label[@for='input-postalCode'][contains(text(),'Postal Code')]")
	public WebElement postalCodeTextPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='input-postalCode'][@class='form-element text dynamic'][@type='text'][@name='postalCode']")
	public WebElement postalCodeInputPaymentMethodDB;	
	
	@FindBy(xpath=".//*[@id='form-footer']/div[2]/span[1]/a[@class='back'][@href='https://payplus.lgelements.com/paywall-payplus2.0/payplusprod/cashin/public/error'][.='Back']")
	public WebElement backButtonPaymentMethodDB;
	
	@FindBy(xpath=".//*[@id='buy-button'][@type='submit'][.='Buy']")
	public WebElement buyButtonPaymentMethodDB;	
	
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
	
	public void verifyVisaForm()
	{
//		Assert.assertTrue(visaPayWalliframe!=null);
//		Assert.assertTrue(visaPayWalliframe.isDisplayed());
		Assert.assertTrue(indiaFlag!=null);
		Assert.assertTrue(indiaFlag.isDisplayed());
		Assert.assertTrue(firstNameTextPaymentMethodDB!=null);
		Assert.assertTrue(firstNameTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(firstNameTextInputFieldPaymentMethodDB!=null);
		Assert.assertTrue(firstNameTextInputFieldPaymentMethodDB.isDisplayed());
		Assert.assertTrue(lastNameTextPaymentMethodDB!=null);
		Assert.assertTrue(lastNameTextPaymentMethodDB.isDisplayed());	
		Assert.assertTrue(lastNameTextInputFieldPaymentMethodDB!=null);
		Assert.assertTrue(lastNameTextInputFieldPaymentMethodDB.isDisplayed());
		Assert.assertTrue(creditCardNumberTextPaymentMethodDB!=null);
		Assert.assertTrue(creditCardNumberTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(creditCardNumberInputPaymentMethodDB!=null);
		Assert.assertTrue(creditCardNumberInputPaymentMethodDB.isDisplayed());
		Assert.assertTrue(monthTextPaymentMethodDB!=null);
		Assert.assertTrue(monthTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(monthSelectPaymentMethodDB!=null);
		Assert.assertTrue(monthSelectPaymentMethodDB.isDisplayed());
		Assert.assertTrue(yearTextPaymentMethodDB!=null);
		Assert.assertTrue(yearTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(yearSelectPaymentMethodDB!=null);
		Assert.assertTrue(yearSelectPaymentMethodDB.isDisplayed());
		Assert.assertTrue(securityCodeTextPaymentMethodDB!=null);
		Assert.assertTrue(securityCodeTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(securityCodeInputPaymentMethodDB!=null);
		Assert.assertTrue(securityCodeInputPaymentMethodDB.isDisplayed());
		Assert.assertTrue(checkBoxPaymentMethodDB!=null);
		Assert.assertTrue(checkBoxPaymentMethodDB.isDisplayed());
		Assert.assertTrue(checkBoxTextPaymentMethodDB!=null);
		Assert.assertTrue(checkBoxTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(provinceTextPaymentMethodDB!=null);
		Assert.assertTrue(provinceTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(provinceInputPaymentMethodDB!=null);
		Assert.assertTrue(provinceInputPaymentMethodDB.isDisplayed());
		Assert.assertTrue(cityTextPaymentMethodDB!=null);
		Assert.assertTrue(cityTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(cityInputPaymentMethodDB!=null);
		Assert.assertTrue(cityInputPaymentMethodDB.isDisplayed());
		Assert.assertTrue(addressTextPaymentMethodDB!=null);
		Assert.assertTrue(addressTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(addressInputPaymentMethodDB!=null);
		Assert.assertTrue(addressInputPaymentMethodDB.isDisplayed());
		Assert.assertTrue(postalCodeTextPaymentMethodDB!=null);
		Assert.assertTrue(postalCodeTextPaymentMethodDB.isDisplayed());
		Assert.assertTrue(postalCodeInputPaymentMethodDB!=null);
		Assert.assertTrue(postalCodeInputPaymentMethodDB.isDisplayed());
		Assert.assertTrue(backButtonPaymentMethodDB!=null);
		Assert.assertTrue(backButtonPaymentMethodDB.isDisplayed());
		Assert.assertTrue(buyButtonPaymentMethodDB!=null);
		Assert.assertTrue(buyButtonPaymentMethodDB.isDisplayed());		
	}
	
	public void verifyAllMembersipOptionsAndFeatures()
	{
		verifyMonthly();
		verifyThreeMonthly();
		verifySixMonthly();
		verifyTwelveMonths();		
		verifyMembershipFeatures();
	}
	
	public void verifySelectPaymentMethodDBandPaymentFormGeneral() throws Throwable
	{
		Thread.sleep(5000);			
	    verifySelectAPaymentMethodDB();
	    Thread.sleep(5000);
		selectPaymentMethodVisa.click();			
		Thread.sleep(5000);			
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		Thread.sleep(10000);			
		System.out.println("checking Visa form");
		verifyVisaForm();
		System.out.println("checking Visa form done");
		driver.switchTo().defaultContent();
		selectAPaymentMethodDBCloseButton.click();
		monthlyBuyNowButton.click();
		Thread.sleep(5000);			
		verifySelectAPaymentMethodDB();
		Thread.sleep(5000);			
		selectPaymentMethodMasterCard.click();			
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));
		Thread.sleep(10000);			
		System.out.println("checking MasterCard form");
		verifyVisaForm();
		System.out.println("checking MasterCard form done");	
		driver.switchTo().defaultContent();
		selectAPaymentMethodDBCloseButton.click();
	}
	
	public void verifyMonthlySelectPaymentMethodDBandPaymentForm(ExtentTest logger) throws Throwable
	{
		System.out.println("Verify monthly PaymentMethodDBandPaymentForm ");
		Thread.sleep(5000);
		monthlyBuyNowButton.isDisplayed();
		HighLighter.elementHighLight(driver, monthlyBuyNowButton);
		monthlyBuyNowButton.click();
		logger.log(LogStatus.INFO, "Clicked the buy now button for the monthly membership option");
		Thread.sleep(5000);					
		String monthlyBuyNowButtonScreenshot=logger.addScreenCapture(CaptureScreenshot.takeScreenshot(driver, "Application"));
		logger.log(LogStatus.INFO, monthlyBuyNowButtonScreenshot);		
		Thread.sleep(5000);		
		verifySelectPaymentMethodDBandPaymentFormGeneral();
		System.out.println("Verify monthly PaymentMethodDBandPaymentForm done");
	}
	
	public void verifyThreeMonthsSelectPaymentMethodDBandPaymentForm() throws Throwable
	{
		System.out.println("Verify three months PaymentMethodDBandPaymentForm ");
		Thread.sleep(5000);		
		threeMonthsBuyNowButton.click();		
		verifySelectPaymentMethodDBandPaymentFormGeneral();
		System.out.println("Verify three months PaymentMethodDBandPaymentForm done ");
	}
	
	public void verifySixMonthsSelectPaymentMethodDBandPaymentForm() throws Throwable
	{
		System.out.println("Verify six months PaymentMethodDBandPaymentForm ");
		Thread.sleep(5000);
		sixMonthsBuyNowButton.click();
		verifySelectPaymentMethodDBandPaymentFormGeneral();
		System.out.println("Verify six months PaymentMethodDBandPaymentForm ");
	}
	
	public void verifyTwelveMonthsSelectPaymentMethodDBandPaymentForm() throws Throwable
	{
		System.out.println("Verify twelve months PaymentMethodDBandPaymentForm ");
		Thread.sleep(5000);
		twelveMonthsBuyNowButton.click();
		verifySelectPaymentMethodDBandPaymentFormGeneral();
		System.out.println("Verify twelve Months PaymentMethodDBandPaymentForm ");
	}
	
	public void verifySelectPaymentMethodDBandPaymentForm(ExtentTest logger) throws Throwable
	{
		verifyMonthlySelectPaymentMethodDBandPaymentForm(logger);
		verifyThreeMonthsSelectPaymentMethodDBandPaymentForm();
		verifySixMonthsSelectPaymentMethodDBandPaymentForm();
		verifyTwelveMonthsSelectPaymentMethodDBandPaymentForm();
	}
	
}