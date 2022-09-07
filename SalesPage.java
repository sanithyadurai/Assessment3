package com.leaftaps.pages;



import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;



public class SalesPage extends ProjectSpecificMethods {
    public SalesPage clickToggleMenu() {
        click(locateElement(Locators.XPATH, "//div[@class='slds-icon-waffle']"));
        reportStep("Toggle Menu is clicked", "PASS");
        return this;
    }



   
    /*
     * public CreateOpportunity clickSales() { click(locateElement (Locators.XPATH,
     * "//button[@class='slds-button']")); click(locateElement (Locators.XPATH,
     * "//p[text()='Sales']")); reportStep("Sales is Clicked", "PASS"); return new
     * CreateOpportunity(); }
     */
     
    public ChatterPage selectContent() {
        click(locateElement (Locators.XPATH, "//button[@class='slds-button']"));
        clearAndType(locateElement(Locators.XPATH, "//input[@class='slds-input']"), "content");
        click(locateElement(Locators.XPATH, "//div[@class='slds-app-launcher__tile-body slds-truncate']"));
        reportStep("Content Menu is clicked", "PASS");
        return new ChatterPage();
    }



}