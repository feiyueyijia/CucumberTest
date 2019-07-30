package com.feiyue.cucumber.service;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jisongZhou on 2019/7/29.
 **/
public class Calculator {

    private static Logger logger = LoggerFactory.getLogger(Calculator.class);

    @Given("^calculator打开计算器面板$")
    public void openCalculator() {
        logger.info("打开计算器面板");
    }

    @When("^已经输入1并按下加号")
    public void alreadyInput1() {
        logger.info("已经输入1并按下+");
    }


    @And("^输入 \"([^\"]*)\"$")
    public void input1(String num) {
        logger.debug("输入" + num);
    }

    @And("^按下=号")
    public void pressEaualButton() {
        logger.info("按下=");
    }

    @Then("^calculator等待计算结果")
    public void waitTheQueryResult() {
        logger.info("等待计算结果");
    }

}
