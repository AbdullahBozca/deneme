@US02
Feature: US_002  Kayit olmak icin email and username bilgileri girilebilmelidir.

  Background:
    Given  kullanici "medunnaUrl" sayfasina gider
    Then account-menu iconuna tiklar
    And kullanici register elementine tiklar


  Scenario Outline: TC01_Herhangi bir karakter iceren ve bos birakilamayan gecerli bir "Username" olmalidir
    Given Username kutusuna herhangi bir karakter girildiginde uyari cikmadigini test eder
    Then Bos birakildiginda Your username is required. yazisinin ciktigini test eder (Negative test)
    And sayfayi kapatir


  Scenario Outline: TC03_Email adresi "@" ve "." karakterleri olmadan doldurulamamalidir.
    Given Email kutusuna @ ve . karakteri iceren bir String girer
    Then Bu sekilde girilen email sonucunda uyari yazisi cikmadigini test eder
    And "<email>" Bu karakterler girilmediginde This field is invalid yazisinin ciktigini test eder (Negative test)
    And sayfayi kapatir

    Examples: test data
      | email               |
      | falanfilan@gmailcom |
      | falanfilangmail.com |
      | falanfilangmailcom  |

  Scenario Outline: TC04_E-mail bos birakilamaz
    Given Email kutusu bos birakildiginda Your email is required. yazisinin ciktigini test eder (Negative test)
    And sayfayi kapatir

