Feature: Registrant API TEST

  @ApiRegistrant
  Scenario Outline: Registrant Test

    Given kullanici gerekli path params ayarlar
    And Kullanici expected datalari girer "<firstname>" "<lastname>" "<SSN>" "<email>" "<username>" "<password>" ve "<lankey>"
    And kullanici request gonderir ve response alir
    When kullanici API kayitlarini dosyaya kaydeder
    Then kullanici API kayitlarini onaylar


    Examples: api test data
    |firstname|lastname|SSN|email|username|password|lankey|
    |API|api            |555-55-5555|api@medunna.com|apideapi|Api123+|Eng|
