package com.feiyue.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(Cucumber.class)
//@RunWith(SpringRunner.class)
@CucumberOptions(
        features = {"src/test/resources/feature/"},
        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        glue = {"com.feiyue"},
        tags = {"@CalculatorTest"}
)
@SpringBootTest
public class CucumberApplicationTests {

}
