Feature: User Certification

  Scenario: User is Passed
    Given that the user Tamil is given a task to clear Java certification exam
    When Tamil got 60 marks in exam
    Then Tamil is known as Java certified

  Scenario: row count diffirence between  source and  target
		Given Row count of source 10
		And Row count of target 8
		Then I should display diffirence betwwen source and target