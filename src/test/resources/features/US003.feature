@runUS03
Feature: US003 Registration sayfasında güçlü şifre girilmeli ve "Password strength" seviyeleri görülebilmelidir.

   Background:
     Given kullanici "medunnaUrl" sayfasina gider
     Then account-menu iconuna tiklar

   Then  Kullanici Register Sayfasina Gider

  Scenario Outline:  Kullanici dort karakter halinde password girer Ardindan Kullanici sifre tablo renginin bir oldugunu dogrular
    And TCBir Kullanici dort karakter halinde "<password>" girer Ardindan Kullanici sifre tablo renginin bir oldugunu dogrular
    Examples:
      |password|
      |  xyzq  |
      |  XYZQ  |
      |  9876  |
      |  /+-*  |
      |  Xy8+  |

  Scenario Outline:  Sifre en az 1 büyük harf içermeli ve Password strength seviyesinin değiştiği görülebilmelidir.
    And TCiki Kullanici yedi karakter iki kombinasyon "<password>" girer Kullanici sifre tablosu renginin ikinci seviye oldugunu dogrular.

    Examples:Test Data
      |   password   |
      |   xyzXYZQ    |
      |   6548xyz    |
      |   8956#!@    |
      |   cvbn123    |
      |   CVBN@#$    |

    Scenario Outline: Sifre en az 1 rakam icermeli ve Password strength seviyesinin degistigi görülebilmelidir.
      And TCuc Kullanici uc kombinasyonlu yedi karakterli "<password>" girer Kullanici sifre tablosu renginin uc oldugunu dogrular.
      Examples:
        | password |
        | CVfg564  |
        | /*-589MN |
        | 568jk+-  |
  Scenario Outline: Sifre en az 1 ozel karakter icermeli ve Password strength seviyesinin degistigi görülebilmelidir.
    And TCdort Kullanici dort kombinasyon yedi karakterli "<password>" girer Kullanici sifre tablosu renginin dort oldugunu dogrular.
    Examples:
      | password |
      | ZXfg85+ |
      | +58teTE  |
      | /12kjKJ  |

  Scenario Outline: Guclu bir parola icin en az yedi karakterden olusmalidir
    And TCbes Kullanici tum kombinasyonlari farkli uzunlukta "<password>" girer Kullanici tum girislerin uzunlugunu password seviyesini kontrol eder.
    And sayfayi kapatir
    Examples:
        | password |
        | XYZQ     |
        | rtyuHUT  |
        | /*589MN  |
        | 35vb+PO  |

