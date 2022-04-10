@US
Feature: US004 Giris sayfasi yalnizca gecerli kimlik bilgileriyle erisilebilmeli Admin/Staff/Patient/Doctor


  Scenario Outline: TC01_Giriste basari mesajini dogrulayan, gecerli kullanici adi ve sifre olmalidir.
    Given kullanici "medunnaUrl" sayfasina gider
    Then account-menu iconuna tiklar
    And kullanici sing in elementine tiklar
    And Kullanici "<Username>" girer
    And  Kullanici gecerli "<Password>" girer
    And kullanici sing in butonuna tiklar
    And "WELCOME TO MEDUNNA" mesaji gorulur
    And sayfayi kapatir
    Examples: test data
      | Username      | Password  |
      | fkadmin       | Admin99   |
      | fkstaff       | Admin99   |
      | fkpatient     | Admin99   |



  Scenario Outline: TC02_Gecersiz kullanici adi ve sifre ile "WELCOME TO MEDUNNA" basari mesaji gorulmemelidir.
    Given kullanici "medunnaUrl" sayfasina gider
    Then account-menu iconuna tiklar
    And kullanici sing in elementine tiklar
    And Kullanici "<Username>" girer
    And  Kullanici gecerli "<Password>" girer
    And kullanici sing in butonuna tiklar
    And "<WELCOME TO MEDUNNA>" mesaji kontrol edilir
    Then sayfayi kapatir
    Examples: test data
      | Username       | Password   |
      | fkadminx       | Admin990   |



  Scenario Outline:TC03_Kullanicinin kimlik bilgilerini her zaman kullanabilecegi bir beni hatirla secenegi olmalidir.
    Given kullanici "medunnaUrl" sayfasina gider
    Then account-menu iconuna tiklar
    And kullanici sing in elementine tiklar
    And Kullanici "<Username>" girer
    And  Kullanici gecerli "<Password>" girer
    And "<Remember me>" secenegi kontrol edilir
    Then sayfayi kapatir
    Examples: test data
      | Username      | Password  |
      | fkadmin       | Admin99   |



  Scenario Outline: TC04_"Did you forget your password?" secenegi olmalidir.
    Given kullanici "medunnaUrl" sayfasina gider
    Then account-menu iconuna tiklar
    And kullanici sing in elementine tiklar
    And Kullanici "<Username>" girer
    Then  Did you forget your password? butonuna tiklar
    And Reset your password bilgisi kontrol eder
    And gecerli "<Email>" adresini girer
    And Reset password butonuna tiklar
    Then sayfayi kapatir
    Examples: test data
      | Username      | Email         |
      | fkadmin       | qa@gmail.com  |


  Scenario Outline: TC05_"You don't have an account yet? Register a new account" secenegi olmalidir.
    Given kullanici "medunnaUrl" sayfasina gider
    Then account-menu iconuna tiklar
    And kullanici sing in elementine tiklar
    And Kullanici "<Username>" girer
    And You don't have an account yet?... butotuna tiklar
    Then kullanici "<ssn>" , "<Firstname>" , "<Lastname>" , "<Username>" , "<Email>" , "<Password>" , "<DogrulamaPassword>"  girer
    And Register butonuna tiklar
    And "<Registration Saved>" bilgisini kontrol eder
    Then sayfayi kapatir
    Examples: test data
      | ssn         | Firstname | Lastname | Username | Email           | Password  | DogrulamaPassword  |
      | 764-86-1716 | Gomis     | DrGomis  | Golcu    | gollmis@gmail.com | Admin99   | Admin99            |


  Scenario Outline: TC06_Cancel secenegi olmalidir.
    Given kullanici "medunnaUrl" sayfasina gider
    Then account-menu iconuna tiklar
    And kullanici sing in elementine tiklar
    And Kullanici "<Username>" girer
    And  Kullanici gecerli "<Password>" girer
    Then Cancel butonuna tiklar
    And sayfayi kapatir
    Examples: test data
      | Username      | Password  |
      | fkadmin       | Admin99   |
      | fkstaff       | Admin99   |
      | fkpatient     | Admin99   |
      | fkdoktor      | Admin99   |





  Scenario Outline: US07_TC01 Hastalar randevu tarihi olusturabilmelidir. (guncel tarihi secebilmelidir)
    Given kullanici "medunnaUrl" sayfasina gider
    And Make an Appointment butonuna tiklar
    Then kullanici "<Firstname>" , "<Lastname>" , "<ssn>" , "<Email>" , "<Phone>" , "<GuncelTarih>"  girer
    And Send an Appointment Request butonuna tiklar
    And "Appointment registration saved! We will call you as soon as possible." basari mesajini kontrol eder
    Then sayfayi kapatir
    Examples: test data
      | Firstname | Lastname |  ssn        | Email             | Phone        | GuncelTarih   |
      |  Gomis    | DrGomis  | 764-86-1726 | gollmis@gmail.com | 505-505-5055 | 09.04.2022    |



  Scenario Outline: US07_TC02 Hastalar randevu tarihi olusturabilmelidir. (ileri tarihi secebilmelidir)
    Given kullanici "medunnaUrl" sayfasina gider
    And Make an Appointment butonuna tiklar
    Then kullanici "<Firstname>" , "<Lastname>" , "<ssn>" , "<Email>" , "<Phone>" , "<IleriTarih>"  girer
    And Send an Appointment Request butonuna tiklar
    And "Appointment registration saved! We will call you as soon as possible." basari mesajini kontrol eder
    Then sayfayi kapatir
    Examples: test data
      | Firstname | Lastname |  ssn        | Email             | Phone        | IleriTarih   |
      |  Gomis    | DrGomis  | 764-86-1726 | gollmis@gmail.com | 505-505-5055 | 01.06.2022    |



  Scenario Outline: US07_TC03 Hastalar ay gun yil olarak randevu tarihi olusturabilmelidir.
    Given kullanici "medunnaUrl" sayfasina gider
    And Make an Appointment butonuna tiklar
    Then kullanici "<Firstname>" , "<Lastname>" , "<ssn>" , "<Email>" , "<Phone>" , "<IleriTarih>"  girer
    And Send an Appointment Request butonuna tiklar
    And "Appointment registration saved! We will call you as soon as possible." basari mesajini kontrol eder
    Then sayfayi kapatir
    Examples: test data
      | Firstname | Lastname |  ssn        | Email             | Phone        | IleriTarih   |
      |  Gomis    | DrGomis  | 764-86-1726 | gollmis@gmail.com | 505-505-5055 | 04.30.2022    |