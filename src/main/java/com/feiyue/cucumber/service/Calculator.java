package com.feiyue.cucumber.service;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by jisongZhou on 2019/7/29.
 **/
public class Calculator {

    @Given("^calculator打开计算器面板$")
    public void openCalculator() throws Exception {
        System.out.println("打开计算器面板");
    }

    @When("^已经输入1并按下加号")
    public void alreadyInput1() {
        System.out.println("已经输入1并按下+");
    }


    @And("^输入 \"([^\"]*)\"$")
    public void input1(String num) throws Throwable {
        System.out.println("输入"+num);
    }

    @And("^按下=号")
    public void pressEaualButton(){
        System.out.println("按下=");
    }

    @Then("^calculator等待计算结果")
    public void waitTheQueryResult() throws InterruptedException {
        System.out.println("等待计算结果");
    }

}
