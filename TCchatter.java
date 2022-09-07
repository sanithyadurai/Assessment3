package com.leaftaps.testcases;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;



public class TCchatter extends ProjectSpecificMethods{



       @BeforeTest
        public void createOpportunity() {
            testcaseName = "addQuestion";
            testDescription ="Verify Add Question";
            authors="Chinna";
            category ="Smoke";
            excelFileName="Login";
        }
    
    @Test(dataProvider = "fetchData")
    public void createOpportunity(String username, String password, String question) {
        new LoginPage()
        .enterUsername(username)
        .enterPassword(password)
        .clickLogin()
        .verifyHomePage()
        .clickToggleMenu()
        /*.clickSales()
        .clickOpportunityTab()
        .clickNewButton()
        .createOppName()
        .chooseDate()
        .selectStage()
        .clickSave()
        .verifyOpp();
*/
        .selectContent()
                /* .clickChatter() */
        .clickChatter()
        .verifyChatter()
        .clickQuestionTab()
        .typeQuestion(question)
        .clickAsk()
        .verifyQuestion();
    }



}