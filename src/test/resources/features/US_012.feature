Feature: US_012 Physician (Doktor) test isteyebilmeli
  @Run
  Scenario Outline: TC01 Physician (Doktor) test isteyebilmeli
    Given kullanici "medunnaUrl" sayfasina gider

    And account-menu iconuna tiklar
    And kullanici sing in elementine tiklar
    And Kullanici "<Username>" girer
    And Kullanici gecerli "<Password>" girer
    And kullanici sing in butonuna tiklar
   And My Page menusune tiklar
   And My appointements butonuna tiklar
   And Hastasını secip Edit butonuna tiklar
   And Request a test butununa tiklar
   And Test Items yazisinin goruldugunu test eder
   #And Insan figurune tiklar
   #And Sign out butonuna tiklar


    Examples: test data
      | Username        | Password |
      | DoctorHikmet    | Caniminici121  |





  #Scenario Outline: TC02 Test iceriginde "Glucose, Urea, Creatinine, Sodium
  #Potassium, Total protein, Albumin, Hemoglobin" secenekleri olmali
  #Given Test iceriginde "Glucose, Urea, Creatinine, Sodium Potassium, Total protein, Albumin, Hemoglobin" secenekleri olmali
  #Then Kullanici "https://medunna.com/" sayfasina gider
  #And Insan figurune" tiklar
  #And "Sign in" butonuna tiklar
  #And "Username"kutusuna gecerli bir username girer
  #And "Pasword" kutusuna geçerli bir pasword girer
  #And "Sing in" butonuna tiklar
  #And "My Page" menüsüne tiklar
  #And "My appointements" butonuna tiklar
  #And Hastasını secip "Edit" butonuna tiklar
  #Then "Request a test" butununa tiklar
  #And "Test Items" yazisinin goruldugunu test eder.
  #And "Secilen testlerin sag taraftaki butonlarina tiklar
  #And "Save" butonuna tiklar
  #And "A new  is created  with identifier"  yazisinin goruldugunu test eder
  #And "Insan figurune" tiklar
  #And "Sign out" butonuna tiklar


  #  Examples: test data
  #    | Username              | Password |
  #    | us012_admin_team87     | 123456   |
  #    | us012_physician_team87 | 123456   |
  #    | us012_staff_team87     | 123456   |
  #    | us012_patient_team87   | 123456   |

