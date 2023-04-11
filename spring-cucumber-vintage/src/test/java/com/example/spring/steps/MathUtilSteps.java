package com.example.spring.steps;

import com.example.spring.MathUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@CucumberContextConfiguration
public class MathUtilSteps {

    @Autowired
    MathUtil mathUtil;

    @When("when mul is called with {int} and {int}")
//    @Then("the result should be a multiplication")
    public void testMul(Integer a, Integer b) {
        int result = a * b;
        Assert.assertEquals(result, mathUtil.mul(a, b));
    }

    @When("when div is called with {int} and {int}")
//    @Then("the result should be a division")
    public void testDiv(Integer a, Integer b) {
        int result = a / b;
        Assert.assertEquals(result, mathUtil.div(a, b));
    }
}
