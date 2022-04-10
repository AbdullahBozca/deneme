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
    And Reset password butonuna tıklar
    Then sayfayi kapatir
    Examples: test data
      | Username      | Email         |
      | fkadmin       | qa@gmail.com  |

  Scenario Outline: TC05_"You don't have an account yet? Register a new account" secenegi olmalidir.
    Given kullanici "medunnaUrl" sayfasina gider
    Then account-menu iconuna tiklar
    And kullanici sing in elementine tiklar
    And You don't have an account yet?... butotuna tıklar
    And Registration (Kayit) yazisini kontrol eder
    Then SSN kutusuna "<ssn>" girer
    And First Name kutusuna "<Firstname>" girer
    And Last Name kutusuna "<Lastname>" girer
    And Username kutusuna yeni "<Username>" girer
    And Email kutusuna yeni "<Email>" girer
    And New pasword kutusuna yeni "<Password>" girer
    Then New password confirmation kutusuna "<DogrulamaPassword>" tekrar girer
    And Register butonuna tiklar
    And "Registration saved" bilgisini kontrol eder
    Then sayfayi kapatir
    Examples: test data
      | ssn         | Firstname | Lastname | Username | Email           | Password  | DogrulamaPassword  |
      | 764-86-1746 | Gomis     | DrGomis  | Golcu    | gomis@gmail.com |Admin99    |Admin99              |


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