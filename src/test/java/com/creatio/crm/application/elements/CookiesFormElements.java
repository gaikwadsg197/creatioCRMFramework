package com.creatio.crm.application.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CookiesFormElements {
	
	
	@FindBy(xpath="//div[contains(@id,'DialogPoweredbyLink')]")
	protected WebElement cookiesFormLogo;
	
	@FindBy(xpath="//div[contains(@id,'BodyContentTitle')]")
	protected WebElement consentMessageHeader;
	
	@FindBy(xpath="//span[contains(text(),'We may use cookies')]")
	protected WebElement consentMessage;
	
	@FindBy (xpath="//input[@wfd-id='id0' and @type='checkbox']")
	protected WebElement necessaryButton;
	
	@FindBy (xpath="//input[@wfd-id='id1' and @type='checkbox']")
	protected WebElement preferenceButton;
	
	@FindBy (xpath="//input[contains(@id,'Statistics') and @wfd-id='id2']")
	protected WebElement statisticsButton;

	@FindBy (xpath="//input[contains(@id,'Marketing') and @wfd-id='id3']")
	protected WebElement marketingButton;
	
	@FindBy (xpath="//a[text()='Show details']")
	protected WebElement showDetailsButton;
	
	@FindBy (xpath="//button[contains(@id,'OptinAllowAll')]")
	protected WebElement allowAllButton;

	@FindBy (xpath="//button[contains(@id,'AllowallSelection')]")
	protected WebElement allowSelectionButton;
	
	@FindBy (xpath="//button[contains(@id,'BodyButtonDecline')]")
	protected WebElement denyButton;
	
	
		
}
