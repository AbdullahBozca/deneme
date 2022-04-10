@US09FullTests
Feature: US09 Staff (Personel), hasta bilgilerini görebilmeli, düzenleyebilmeli ve silebilmelidir.

  Background: Medunnaya staff olarak giris
    Given kullanici "medunnaUrl" sayfasina gider
    Then account-menu iconuna tiklar
    And kullanici sing in elementine tiklar
    And Kullanici "us08_staff_team87" girer
    And  Kullanici gecerli "123456" girer
    And kullanici sing in butonuna tiklar
    Then My Pages menusune tiklar
    And Search Patient secenegine tiklar

  @US09_TC1
 Scenario: TC001 "My Pages" sekmesinden hasta bilgilerini görebilmelidir.
   And hasta bilgilerinin gorulebildigini dogrular


    @US09_TC2
    Scenario:TC02 Kullanıcı "id" bilgisini düzenleyebilmelidir.
      And herhangi bir edit butonuna tiklar
      And id'yi duzenler
      And id'deki duzenlemenin gerceklestigini dogrular



  @US09_TC3-15
 Scenario Outline: : TC003-015 Kullanıcı bütün hasta bilgilerini "firstname, lastname, birthdate, email, phone, gender,
 blood group, address, description, user, country and state/city" düzenleyebilmelidir.
   And herhangi bir edit butonuna tiklar
   And "<TextBox>" in duzenler
   Then Save butonuna tiklar.
    And update isleminin gerceklestigi uyarisinin ciktigini dogrular

   Examples:
     |TextBox    |
     |BirthDate  |
     |First Name |
     |Last Name  |
     |Email      |
     |Phone      |
     |Gender     |
     |Blood Group|
     |adress     |
     |description|
     |user       |
     |country    |
     |State City |

  @US09_TC16

  Scenario: TC016 Kullanıcı, SSN'lerine göre aradigi bir başvuru sahibinin tüm
  kayıt bilgilerinin doldurulduğunu görebilmelidir.
    Then search textbox'ina ssn bilgisi girer
    And cikan patient'in tum bilgilerinin dolduruldugunu gorur.

  @US09_TC19
  Scenario Outline: TC019 Kullanici herhangi bir hasta bilgisini silebilir.
    And herhangi bir edit butonuna tiklar
    Then "<hasta bilgisi>"'ni temizler
    And Save butonuna tiklar.
    And update isleminin gerceklestigi uyarisinin ciktigini dogrular

    Examples:
    |hasta bilgisi|
    |adress       |
    |description  |
    |First Name   |
    |Last Name    |

  @US09_TC20
  Scenario: TC020 Kullanici hastalari silemez.
    And herhangi bir delete butonu olmadigini dogrular
    Then herhangi bir edit butonuna tiklar
    And herhangi bir delete butonu olmadigini dogrular

  @US09_TC21
  Scenario: TC021 Staff, hastaları SSN kimliklerine göre arayabilir.
    And search textbox'ina ssn bilgisi girer
    Then aranan ssne sahip patientin ciktigini test eder


  @US09_TC22
  Scenario: TC022 aranan hastaların SSN kimlikleri unique(tek,essiz)'dir.
    And search textbox'ina ssn bilgisi girer
    Then aranan ssne sahip patientin essiz oldugunu test eder
