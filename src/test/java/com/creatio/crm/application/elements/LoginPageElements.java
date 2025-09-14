package com.creatio.crm.application.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElements {

	@FindBy(xpath="//input[@aria-label='Business email']")
	protected WebElement businessEmail;
	
	@FindBy(xpath="//mat-icon[@aria-label='Tooltip.Mode.Error Business email']")
	protected  WebElement emailWarning;
	
	@FindBy(xpath="//input[@aria-label='Password']")
	protected WebElement passwordField;
	
	@FindBy(xpath="//mat-icon[@aria-label='Tooltip.Mode.Error Password']")
	protected  WebElement passwordWarning;
	
	@FindBy (xpath="//a[text()='Forgot password']")
	protected WebElement forgotPwd;
		
	@FindBy(xpath="//mat-icon[contains(@class,'eye-icon')]")
	protected  WebElement passwordShow;
	
	@FindBy(xpath="//crt-button[@class='login-button']")
	protected WebElement loginButton;
	
	@FindBy (xpath="//img[@alt='LinkedIn icon']")
	protected WebElement linkedInIcon;
	
	@FindBy (xpath="//img[@alt='Google icon']")
	protected WebElement googleIcon;
	
	@FindBy (xpath="//img[@alt='Facebook icon']")
	protected WebElement facebookIcon; 
	
	@FindBy (xpath="//span[text()=' SIGN UP ']")
	protected WebElement signUpIcon;
	
	@FindBy (xpath="//div[@id='CookiebotWidget']")
	protected WebElement cookieBot;

}
