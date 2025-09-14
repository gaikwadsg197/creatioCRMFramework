package com.creatio.crm.application.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElements {
	
	@FindBy (xpath="//p[text()='Accounts']")
	protected WebElement accountIcon;
	
	@FindBy (xpath="//p[text()='Calendar']")
	protected WebElement calendarIcon;
	
	@FindBy (xpath="//p[text()='Tasks']")
	protected WebElement tasksIcon;
	
	
	@FindBy (xpath="//p[text()='Contacts']")
	protected WebElement contactsIcon;
	
	@FindBy (xpath="//p[text()='Campaigns']")
	protected WebElement campaignsIcon;
	
	@FindBy (xpath="//p[text()='Bulk emails']")
	protected WebElement bulkemailsIcon;
	
	@FindBy (xpath="//p[text()='Leads']") 
	protected WebElement leadsIcon;
	
	@FindBy (xpath="//p[text()='Orders']")
	protected WebElement ordersIcon;
	
	@FindBy (xpath="//p[text()='Cases']")
	protected WebElement casesIcon;
	
	@FindBy (xpath="//p[text()='Knowledge base']")
	protected WebElement knowledgebase;
	
	@FindBy (xpath="//p[text()='Opportunities']")
	protected WebElement opportunitiesIcon;
	
	
	//button[@aria-haspopup='menu' and @type='button']
}
