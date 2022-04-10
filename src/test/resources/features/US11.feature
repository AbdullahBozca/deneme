Feature: US11 My Appointments Physician Doctor tarafindan duzenlenebilmeli

  Scenario Outline:TC01 Yeni bir randevu olusturulabilmeli
    Given kullanici "medunnaUrl" sayfasina gider
    And insan ikonuna tiklar
    And Kullanici "<username>" ve "<password>" bilgilerini girer
    And Sign in butonuna tiklar
    And My Pages ve My Appointments linkine tiklar
    And My Appointments sayfasinda sayfanin en alt kisminda Make an appointment linkine tiklar
    And First name, Last name,SSN,Email,Phone ve Appointment Date Time bilgileri doldurulur
    And Send an appointment request butonuna tiklanir
    Then Appointment registration saved mesaji goruntulendigi dogrulanmali

    Examples:
      |username|password|
      |DoctorEmine|Batch44+|

  Scenario Outline: TC02 Mevcut bir randevu duzenlenebilmeli
    Given kullanici "medunnaUrl" sayfasina gider
    And insan ikonuna tiklar
    And Kullanici "<username>" ve "<password>" bilgilerini girer
    And Sign in butonuna tiklar
    And My Pages ve My Appointments linkine tiklar
    Then Tum randevularin gorunur oldugunu dogrular
    And Duzenlemek istedigi hastanin Edit butonuna tiklar
    Then ilgili datayi guncelledikten sonra save butonuna tiklar

    Examples: test data
      |username|password|
      |DoctorEmine|Batch44+|

  Scenario Outline: TC03 Bir randevu guncellendiginde; kullanici (doktor), hastanin asagidaki bilgilerini gormelidir.
  "id, start and end date, Status, physician and patient"

    Given kullanici "medunnaUrl" sayfasina gider
    And insan ikonuna tiklar
    And Kullanici "<username>" ve "<password>" bilgilerini girer
    And Sign in butonuna tiklar
    And My Pages ve My Appointments linkine tiklar
    Then Tum randevularin gorunur oldugunu dogrular
    And Duzenlemek istedigi hastanin Edit butonuna tiklar
    And Patient id goruntulenebilir oldugu dogrulanmali
    Then Start Date Time goruntulenebilir oldugu dogrulanmali
    And End Date Time  goruntulenebilir oldugu dogrulanmali
    And Status  goruntulenebilir oldugu dogrulanmali
    And Physician  goruntulenebilir oldugu dogrulanmali
    Then Patient  goruntulenebilir oldugu dogrulanmali

    Examples:
      |username|password|
      |DoctorEmine|Batch44+|

  Scenario Outline: TC04 Doktor gerekli alanlara Anamnesis, Treatment ve Diagnosis yazabilmelidir.

    Given kullanici "medunnaUrl" sayfasina gider
    And insan ikonuna tiklar
    And Kullanici "<username>" ve "<password>" bilgilerini girer
    And Sign in butonuna tiklar
    And My Pages ve My Appointments linkine tiklar
    Then Tum randevularin gorunur oldugunu dogrular
    And Duzenlemek istedigi hastanin Edit butonuna tiklar
    And Anamnesis alanina ilgili data girilebilmelidir
    And Treatment  alanina ilgili data girilebilmelidir
    And Diagnosis  alanina ilgili data girilebilmelidir
    Then save butonuna tiklar
    Then sayfayi kapatir

    Examples:
      |username|password|
      |DoctorEmine|Batch44+|

  Scenario Outline: TC05 prescription ve description istege bagli olmalidir.
    Given kullanici "medunnaUrl" sayfasina gider
    And insan ikonuna tiklar
    And Kullanici "<username>" ve "<password>" bilgilerini girer
    And Sign in butonuna tiklar
    And My Pages ve My Appointments linkine tiklar
    Then Tum randevularin gorunur oldugunu dogrular
    And Duzenlemek istedigi hastanin Edit butonuna tiklar
    And Prescription ve Description alanlarina istege bagli olarak bilgi girilir
    Then save butonuna tiklar
    And sayfayi kapatir

    Examples:
      |username|password|
      |DoctorEmine|Batch44+|


  Scenario Outline: TC06 "Status" doktor tarafından COMPLETED olarak secilebilmeli
    Given kullanici "medunnaUrl" sayfasina gider
    And insan ikonuna tiklar
    And Kullanici "<username>" ve "<password>" bilgilerini girer
    And Sign in butonuna tiklar
    And My Pages ve My Appointments linkine tiklar
    Then Tum randevularin gorunur oldugunu dogrular
    And Duzenlemek istedigi hastanin Edit butonuna tiklar
    Then Status seceneginde COMPLETED secilir
    Then save butonuna tiklar
    Then The Appointment is update with identifier yazisinin goruntulendigini dogrulamali
    And sayfayi kapatir


    Examples:
      |username|password|
      |DoctorEmine|Batch44+|

  Scenario Outline: TC07 "Status" doktor tarafından  PENDING olarak secilebilmeli
    Given kullanici "medunnaUrl" sayfasina gider
    And insan ikonuna tiklar
    And Kullanici "<username>" ve "<password>" bilgilerini girer
    And Sign in butonuna tiklar
    And My Pages ve My Appointments linkine tiklar
    Then Tum randevularin gorunur oldugunu dogrular
    And Duzenlemek istedigi hastanin Edit butonuna tiklar
    And Status seceneginde PENDING secilir
    Then save butonuna tiklar
    Then The Appointment is update with identifier yazisinin goruntulendigini dogrulamali
    And sayfayi kapatir
    Examples:
      |username|password|
      |DoctorEmine|Batch44+|

  Scenario Outline: TC08 Status doktor tarafından CANCELLED olarak secilebilmeli
    Given kullanici "medunnaUrl" sayfasina gider
    And insan ikonuna tiklar
    And Kullanici "<username>" ve "<password>" bilgilerini girer
    And Sign in butonuna tiklar
    And My Pages ve My Appointments linkine tiklar
    Then Tum randevularin gorunur oldugunu dogrular
    And Duzenlemek istedigi hastanin Edit butonuna tiklar
    And Status seceneginde CANCELED secilir
    Then save butonuna tiklar
    And The Appointment is update with identifier yazisinin goruntulendigini dogrulamali
    Then  sayfayi kapatir

    Examples:
      |username|password|
      |DoctorEmine|Batch44+|
