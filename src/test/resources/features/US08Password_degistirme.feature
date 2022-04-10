@US08
Feature:  US008 Kullanici giris yaptiginda Password sekmesi duzenlenebilir olmalidir. Admin/Staff/Patient/Doctor

  Background:
    Given kullanici "medunnaUrl" sayfasina gider
    Then account-menu iconuna tiklar
    And kullanici sing in elementine tiklar

  @US08_TC01
  Scenario Outline: TC01_Kullanici giris yaptiginda Password sekmesi duzenlenebilir olmalidir

    And Kullanici "<Username>" girer
    And  Kullanici gecerli "<Password>" girer
    And kullanici sing in butonuna tiklar
    Then account-menu iconuna tiklar
    And Password butonuna tiklar
    And New password confirmation yazisi gorulur
    And sayfayi kapatir
    Examples: test data
      | Username              | Password |
      | us08_admin_team87     | 123456   |
      | us08_physician_team87 | 123456   |
      | us08_staff_team87     | 123456   |
      | us08_patient_team87   | 123456   |

  @US08_TC02
  Scenario Outline:  TC02_Daha guclu sifre icin en az 1 kucuk harf olmali ve "Password strength:" seviyesinin degistigi gorulebilmelidir

    And Kullanici "<Username>" girer
    And  Kullanici gecerli "<Password>" girer
    And kullanici sing in butonuna tiklar
    Then account-menu iconuna tiklar
    And Password butonuna tiklar
    And New password confirmation yazisi gorulur
    And New password text box sina "<New Password>" deger girilir
    And Password strength seviyesinin degistigi gorulmeli
    And sayfayi kapatir
    Examples: test data
      | Username              | Password | New Password |
      | us08_admin_team87     | 123456   | 123456a      |
      | us08_physician_team87 | 123456   | 123456a      |
      | us08_staff_team87     | 123456   | 123456a      |
      | us08_patient_team87   | 123456   | 123456a      |

  @US08_TC03
  Scenario Outline:TC03_Daha guclu sifre icin en az 1 buyuk harf olmali ve "Password strength:" seviyesinin degistigi gorulebilmelidir.

    And Kullanici "<Username>" girer
    And  Kullanici gecerli "<Password>" girer
    And kullanici sing in butonuna tiklar
    Then account-menu iconuna tiklar
    And Password butonuna tiklar
    And New password confirmation yazisi gorulur
    And New password text box sina "<New Password>" deger girilir
    And Password strength seviyesinin degistigi gorulmeli
    And sayfayi kapatir

    Examples: test data
      | Username              | Password | New Password |
      | us08_admin_team87     | 123456   | 123456A      |
      | us08_physician_team87 | 123456   | 123456A      |
      | us08_staff_team87     | 123456   | 123456A      |
      | us08_patient_team87   | 123456   | 123456A      |

  @US08_TC04
  Scenario Outline:TC04_Daha guclu sifre icin en az 1 rakam olmali ve "Password strength:" seviyesinin degistigi gorulebilmelidir.

    And Kullanici "<Username>" girer
    And  Kullanici gecerli "<Password>" girer
    And kullanici sing in butonuna tiklar
    Then account-menu iconuna tiklar
    And Password butonuna tiklar
    And New password confirmation yazisi gorulur
    And New password text box sina "<New Password>" deger girilir
    And Password strength seviyesinin degistigi gorulmeli
    And sayfayi kapatir

    Examples: test data
      | Username              | Password | New Password |
      | us08_admin_team87     | 123456   | abcdef1      |
      | us08_physician_team87 | 123456   | abcdef1      |
      | us08_staff_team87     | 123456   | abcdef1      |
      | us08_patient_team87   | 123456   | abcdef1      |

  @US08_TC05
  Scenario Outline:TC05_Daha guclu sifre icin en az 1 ozel karakter olmali ve "Password strength:" seviyesinin degistigi gorulebilmelidir.

    And Kullanici "<Username>" girer
    And  Kullanici gecerli "<Password>" girer
    And kullanici sing in butonuna tiklar
    Then account-menu iconuna tiklar
    And Password butonuna tiklar
    And New password confirmation yazisi gorulur
    And New password text box sina "<New Password>" deger girilir
    And Password strength seviyesinin degistigi gorulmeli
    And sayfayi kapatir

    Examples: test data
      | Username              | Password | New Password |
      | us08_admin_team87     | 123456   | 123456.      |
      | us08_physician_team87 | 123456   | 123456.      |
      | us08_staff_team87     | 123456   | 123456.      |
      | us08_patient_team87   | 123456   | 123456.      |

  @US08_TC06
  Scenario Outline:TC06_Guclu bir parola icin sifre en az 7 karakterden olusmali
    And Kullanici "<Username>" girer
    And  Kullanici gecerli "<Password>" girer
    And kullanici sing in butonuna tiklar
    Then account-menu iconuna tiklar
    And Password butonuna tiklar
    And New password confirmation yazisi gorulur
    And New password text box sina "<New Password>" deger girilir
    And Password strength guclu seviyede oldugu gorulmeli
    And Yeni Password kaydedilmelidir


    Examples: test data
      | Username              | Password | New Password |
      | us08_admin_team87     | 123456   | 1234aA.      |
      | us08_physician_team87 | 123456   | 1234aA.      |
      | us08_staff_team87     | 123456   | 1234aA.      |
      | us08_patient_team87   | 123456   | 1234aA.      |

  @US08_TC07
  Scenario Outline:TC07_Eski sifre kullanilamamali
    And Kullanici "<Username>" girer
    And  Kullanici gecerli "<Password>" girer
    And kullanici sing in butonuna tiklar
    Then account-menu iconuna tiklar
    And Password butonuna tiklar
    And New password text box sina "<New Password>" deger girilir
    And Yeni Password kaydedilmeli
    Then kullanici account-menu iconuna tiklar
    And kullanici sing out elementine tiklar
    Then account-menu iconuna tiklar
    And kullanici sing in elementine tiklar
    And Kullanici "<Username>" girer
    And  Kullanici gecerli "<Password>" girer
    And kullanici sing in butonuna tiklar
    Then Authentication information not connect. yazisi gorulur




    Examples: test data
      | Username              | Password | New Password |
      | us08_admin_team87     | 123456   | 1234aA.      |
      | us08_physician_team87 | 123456   | 1234aA.      |
      | us08_staff_team87     | 123456   | 1234aA.      |
      | us08_patient_team87   | 123456   | 1234aA.      |
