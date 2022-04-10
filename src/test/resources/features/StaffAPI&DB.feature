@US09FullTests
Feature: US09 Staff (Personel), hasta bilgilerini görebilmeli, düzenleyebilmeli ve silebilmelidir.

  @ApiStaff
  Scenario: TC17 Kullanıcı, API kullanarak tüm hasta bilgilerini doğrulamalıdır.

    Given Kullanici hasta sorgusu icin gerekli path params ayarlar