Feature: US010 Doktor (Physician) randevulari

Scenario Outline: TC01  Kullanici, randevu listesini ve zaman dilimlerini "My Appointments"
sekmesinden görebilmelidir.

  Given kullanici "medunnaUrl" sayfasina gider
  And insan ikonuna tiklar
  And sign in linkine tiklar
  And Kullanici "<Username>" ve "<Password>" bilgilerini girer
  Then Sign in butonuna tiklar
  And My Pages ve My Appointments linkine tiklar
  And Tum randevularin gorunur oldugunu dogrular
  Then sayfayi kapatir


  Examples: test data
    | Username | Password |
    | DoctorEmine |Batch44+  |

Scenario Outline: TC02 Kullanici "patient id, start date, end date, status" bilgilerini gorebilmeli

  Given kullanici "medunnaUrl" sayfasina gider
  And insan ikonuna tiklar
  And Kullanici "<Username>" ve "<Password>" bilgilerini girer
  And Sign in butonuna tiklar
  And My Pages ve My Appointments linkine tiklar
  Then Patient id bilgisnin goruntulenebilir oldugunu dogrulamali
  And Start Date bilgisinin goruntulenebilir oldugunu dogrulamali
  And End Date bilgisnin goruntulenebilir oldugunu dogrulamali
  And Status bilgisnin goruntulenebilir oldugunu dogrulamali
  Then sayfayi kapatir


  Examples:test data
    | Username    | Password |
    | DoctorEmine |Batch44+  |



