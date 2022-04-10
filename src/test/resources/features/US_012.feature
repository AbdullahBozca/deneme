@RunOniki
Feature: US_012 Physician (Doktor) test isteyebilmeli

  Scenario Outline: TC01 Physician (Doktor) test isteyebilmeli
    Given kullanici "medunnaUrl" sayfasina gider

    And account-menu iconuna tiklar
    And kullanici sing in elementine tiklar
    And Kullanici "<Username>" girer
    And Kullanici gecerli "<Password>" girer
    And kullanici sing in butonuna tiklar
    And My Page menusune tiklar
    And My appointements butonuna tiklar
    And Hastasini secip Edit butonuna tiklar
    And Request a test butununa tiklar
    And Test Items yazisinin goruldugunu test eder
    And account-menu iconuna tiklar
    And kullanici sing out elementine tiklar
    And sayfayi kapatir


    Examples: test data
      | Username        | Password |
      | DoctorHikmet    | Caniminici121  |



  @RunOniki

  Scenario Outline: TC02 Test iceriginde "Glucose, Urea, Creatinine, Sodium
  Potassium, Total protein, Albumin, Hemoglobin" secenekleri olmali
    Given kullanici "medunnaUrl" sayfasina gider

    And account-menu iconuna tiklar
    And kullanici sing in elementine tiklar
    And Kullanici "<Username>" girer
    And Kullanici gecerli "<Password>" girer
    And kullanici sing in butonuna tiklar
    And My Page menusune tiklar
    And My appointements butonuna tiklar
    And Hastasini secip Edit butonuna tiklar
    And Request a test butununa tiklar
    And Test Items yazisinin goruldugunu test eder
    And Secilen testlerin sag taraftaki butonlarina tiklar
    And Save butonuna tiklar
    And A new  is created  with identifier  yazisinin goruldugunu test eder
    And account-menu iconuna tiklar
    And kullanici sing out elementine tiklar
    And sayfayi kapatir


    Examples: test data
      | Username        | Password |
      | DoctorHikmet    | Caniminici121  |

