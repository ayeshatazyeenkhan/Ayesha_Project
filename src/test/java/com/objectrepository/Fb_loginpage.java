package com.objectrepository;

import org.openqa.selenium.By;

//locator i keep

//public final By PageName_elementName_elementType=By id("dd");

public class Fb_loginpage {
//public final By fblogin_Email_EditBox=By.id("Email");
//public final By fblogin_Password_EditBox=By.id("pasword");
//public final By fblogin_login_button=By.name("login");

	public final By Fb_loginpage_Email_EditBox=By.id("Email");
	public final By Fb_loginpage_Password_EditBox=By.id("pasword");
	public final By Fb_loginpage_Button=By.name("login");
	
	
	
	//openqa web locators
	public final By OpenQA_Search_EiditBox=By.name("search");
	public final By OpenQA_Search_Icon=By.xpath("//Button[type()'button']");
	public final By OpenQA_AddToCart_icon=By.xpath("//span[text()'Add to Cart']");
	public final By OpenQA_Cart_Total=By.id("cart-total");
	public final By OpenQA_View_Cart=By.xpath("//*[text()= 'View Cart']");
	public final By OpenQA_Continue=By.linkText("Checkout");
	public final By OpenQA_Redio_Button=By.name("account");
	public final By OpenQA_Continue_Icon=By.id("account");
	public final By OpenQA_First_Name=By.name("firstname");
	public final By OpenQA_Last_Name=By.name("lastname");
	//public final By OpenQA_Last_Name
	
	
	
	
}





//public final By OpenQA_search_EditBox=By.name("search");
//public final By OpenQA_Search_Icon=By.xpath("//button[@class='btn btn-default btn-lg']");
//public final By OpenQA_AddToCard_Icon=By.xpath("//span[text()='Add to Cart']");
//public final By OpenQA_Cart_total=By.id("cart-total");
//public final By OpenQA_view_cart=By.xpath("//*[text()=' View Cart']");
//public final By OpenQA_CheckOut_link=By.linkText("Checkout");
//public final By OpenQA_GustCheckOut_redioButton=By.name("account");
//public final By OpenQA_Countinue_Button=By.id("button-account");