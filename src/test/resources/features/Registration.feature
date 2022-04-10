Feature: registration data test

  @UIRegistration
  Scenario Outline: registrants icin test data

    Given kullanici SNN girer "<SSN>"
    And kulanici firstname ve lastname girer "<firstname>" ve "<lastname>"
    And kullanici username girer "<username>"
    Then kullanici email girer "<email>"
    And kullanici password girer "<password>"
    And kullanicinin kayit yaptigini dogrula
    Then kayit olan kullanicinin datalarini kaydet

    Examples: test data
    |SSN|firstname|lastname|username|email|password|
    |111-95-9595|team95|Admin|team95admin|team95@medunna.com|Batch44+|
