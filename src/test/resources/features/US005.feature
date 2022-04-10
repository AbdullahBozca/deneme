@sifirbes
  Feature:Hastalar (patients), hastahaneden randevu (Appointment) oluşturabilmelidir.

    Scenario Outline:TC01_Kullanicinin herhangi bir karakter iceren "First Name" yazmasi gerekir ve bos birakilamaz.
    Given kullanici "medunnaUrl" sayfasina gider
    Then  kullanici Make An Appointment butonuna tiklar.
    Then  kullanici First Name box tiklar.
    And   kullaici "<FirstName>"  girer.
    Examples:
    | FirstName    |
    | MustafaHasta |





