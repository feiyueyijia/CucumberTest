package com.feiyue.cucumber.service;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


/**
 * Created by jisongZhou on 2019/7/29.
 **/
public class Param {

    int temp;
    @Given("^param打开计算器面板$")
    public void openCalc() {
        System.out.println("打开计算器进行计算");
    }

    @When("^输入 \"([^\"]*)\" and \"([^\"]*)\" 并计算结果$")
    public int addition(int a1, int a2) {
        temp=a1 + a2;
        return temp;
    }

    @Then("^param等待计算结果 \"([^\"]*)\"")
    public void verifyResult(int result) {
        //验证实际计算和预期结果是否一致
        Assert.assertEquals(temp, result);
    }

}
