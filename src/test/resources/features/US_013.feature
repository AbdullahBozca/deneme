@RunOnuc
Feature: US_013 Physician (Doktor) "Test Results" islemleri yapabilmeli (My Appointments / Edit / Test Results)


 Scenario Outline: TC01 Test sonuclari talep edildikten ve Staff test sonuclarini guncellestirdikten sonra doktor "id, name(Urea, Sodium, Glucose etc..), default max value, default min value, test, description and the date" bilgilerini gorebilmeli

   Given kullanici "medunnaUrl" sayfasina gider

   And account-menu iconuna tiklar
   And kullanici sing in elementine tiklar
  And Kullanici "<staffUsername>" girer
  And Kullanici gecerli "<staffPassword>" girer
  And kullanici sing in butonuna tiklar
  And My Page menusune tiklar
  And Search patient butonuna tiklar
  Then Patient SSN kutucuguna hastanin SSN numarasini yazar
  And Show appointments butonuna tiklar
  And Show tests butonuna tiklar
  And View results butonuna tiklar
  And Glucose testin Edit butonuna tiklar
  And Staf guncelleme yapar Save butonuna tiklar
  And Urea testin Edit butonuna tiklar
  And Staf guncelleme yapar Save butonuna tiklar
  And Creatinine testin Edit butonuna tiklar
  And Staf guncelleme yapar Save butonuna tiklar
  And Sodium testin Edit butonuna tiklar
  And Staf guncelleme yapar Save butonuna tiklar
  And Potasium testin Edit butonuna tiklar
  And Staf guncelleme yapar Save butonuna tiklar
  And Total protein testin Edit butonuna tiklar
  And Staf guncelleme yapar Save butonuna tiklar
  And Hemoglobin testin Edit butonuna tiklar
  And Staf guncelleme yapar Save butonuna tiklar
  And Albumin testin Edit butonuna tiklar
  And Staf guncelleme yapar Save butonuna tiklar
   And account-menu iconuna tiklar
   And kullanici sing out elementine tiklar




  And account-menu iconuna tiklar
  And kullanici sing in elementine tiklar
  And Kullanici "<Username>" girer
  And Kullanici gecerli "<Password>" girer
  And kullanici sing in butonuna tiklar
  And My Page menusune tiklar
  And My appointements butonuna tiklar
  And Hastasini secip Edit butonuna tiklar
   And Show Test Results butonuna tiklar
   And View results butonuna tiklar
   And Test Results yazisinin goruldugunu test eder
   And account-menu iconuna tiklar
   And kullanici sing out elementine tiklar
   And sayfayi kapatir

   Examples: test data
    |staffUsername|staffPassword|Username|Password |
    |StaffHikmet|12345|DoctorHikmet|Caniminici121 |


 @RunOnuc

 Scenario Outline:cenario Outline: TC02 Test iceriginde "Glucose, Urea, Creatinine, Sodium  potassium, Total protein, Albumin, Hemoglobin" secenekleri olmali
  Given kullanici "medunnaUrl" sayfasina gider

  And account-menu iconuna tiklar
  And kullanici sing in elementine tiklar
  And Kullanici "<Username>" girer
  And Kullanici gecerli "<Password>" girer
  And kullanici sing in butonuna tiklar
  And My Page menusune tiklar
  And My appointements butonuna tiklar
  And Hastasini secip Edit butonuna tiklar
  And Request a inpatient butununa tiklar
   And Inpatient request appointements  yazisinin goruldugunu test eder
  And account-menu iconuna tiklar
  And kullanici sing out elementine tiklar
  And sayfayi kapatir



  Examples: test data
    | Username        | Password |
    | DoctorHikmet    | Caniminici121  |