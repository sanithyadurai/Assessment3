package com.leaftaps.pages;



import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;



public class ChatterPage extends ProjectSpecificMethods{
    
    /*
     * public ChatterPage clickChatter() { click(locateElement (Locators.XPATH,
     * "//span[text()='Chatter']")); reportStep("Chater Menu is clicked", "PASS");
     * return this;
     * }
     */
    public ChatterPage clickChatter() {
        clickUsingJs(locateElement (Locators.XPATH, "(//span[text()='Chatter'])"));
        reportStep("Chatter Menu is clicked", "PASS");
        return this;
    }    



   
      public ChatterPage verifyChatter() {
      pause(3000);
      verifyTitle("Chatter Home | Salesforce");
      reportStep("Chater Title is displayed", "PASS"); return this; }
     
    public ChatterPage clickQuestionTab() {
        click(locateElement(Locators.XPATH, "//span[text()='Question']"));
        reportStep("Question Tab is selected", "PASS");
        return this;
    }    
    public ChatterPage typeQuestion(String question) {
        clearAndType(locateElement(Locators.XPATH, "//textarea[@role='textbox']"),question);
        reportStep("Question is entered", "PASS");
        return this;
    }    
    public ChatterPage clickAsk() {
        click(locateElement(Locators.XPATH, "//button[@class='slds-button slds-button_brand cuf-publisherShareButton qe-questionPostDesktop MEDIUM']"));
        reportStep("Ask is clicked", "PASS");
        return this;
    }
    public ChatterPage verifyQuestion() {
        click(locateElement(Locators.XPATH, "//span[text()='Question2 added by RJ']"));
        reportStep("Question added successfully", "PASS");
        return this;
    }
    
    }