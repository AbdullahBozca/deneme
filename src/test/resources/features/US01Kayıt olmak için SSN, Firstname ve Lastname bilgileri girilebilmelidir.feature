@US01
Feature: US_001  Kayıt olmak için SSN, Firstname ve Lastname bilgileri girilebilmelidir

  Background:
    Given  kullanici "medunnaUrl" sayfasina gider
    And kullanici register sayfasina tiklar


  Scenario: TC01_Geçerli bir SSN, 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır.
    Given kullanici  gecerli SSN girilmesini saglar ve hata gormedigini test eder
    Then Registration sayfasinda bu isaretler girilmeden  SSN kutucuguna ucuncu ve besinci rakamdan sonra - ozel isareti konulmadiginda uyari yazisi ciktigini test eder
    And sayfayi kapatir


  Scenario: TC02_SSN boş bırakilamaz
    And Ssn bos birakildiginda Your SSN is required. yazisinin ciktigini test eder
    And sayfayi kapatir



  Scenario: TC03_Herhangi bir karakter içeren ve boş bırakilamayan geçerli bir "First Name" olmalıdır
    Given And firstname kutusuna herhangi bir karakter girdiginde uyari yazisi cikmadigini test eder
    And firstname bos birakildiginda Your FirstName is required. yazisinin ciktigini test eder
    And sayfayi kapatir


  Scenario: TC04_Herhangi bir karakter içeren ve boş bırakilamayan geçerli bir "Last Name" olmalıdır
    And lastname kutusuna herhangi bir karakter girdiginde uyari yazisi cikmadigini test eder
    Then lastname  bos birakildiginda Your LastName is required. yazisinin ciktigini test eder
    And sayfayi kapatir
