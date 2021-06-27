package stepdefs;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo_StepDefinitions {
	
	public static Scenario scenario=null;;
	static int scount;
	static int tcount;
	int diffirence;
	@AfterStep
	public void afterStep()
	{
		
	}

	@Given("^that the user (.*) is given a task to clear (.*) certification exam$")
	public void certificationName(String name, String certication) throws Throwable {
		System.out.println(name + "   " +certication);
	}

	@When("^(.*) got (\\d+) marks in exam$")
	public void gotMarks(String name, int marks) throws Throwable {
		System.out.println(name + "   " +marks);
	}

	@Then("^(.*) is known as (.*) certified$")
	public void certifiedYes(String name, String certification) throws Throwable {
		System.out.println(name + "   " +certification);
	}
	@Given("connection between two databases")
	public void connection_between_two_databases() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manje\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
	    
	}

	@Then("I execute a query on source database")
	public void i_execute_a_query_on_source_database() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		scount=100;
	Thread.sleep(5000);
		
	    
	}

	@Then("I execute a query on target database")
	public void i_execute_a_query_on_target_database() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		tcount=100;
		Thread.sleep(5000);
	}

	@Then("I should compare count")
	public void i_should_compare_count() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		  
	}


	@Given("Row count of source {int}")
	public void row_count_of_source(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		scount=int1;
		
	}

	@Given("Row count of target {int}")
	public void row_count_of_target(Integer int1) {
	   
	}

@Then("I should display diffirence betwwen source and target")
public void i_should_display_diffirence_betwwen_source_and_target() {
    // Write code here that turns the phrase above into concrete actions
	
	
}
	
	
	
}
