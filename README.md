# Online Kurs Sistemi

Bu projede online kurs sistemi örneği yapılmıştır. Projede bazı tasarım desenleri kullanılmaya çalışılmıştır.
Kullanılan patternler ve kullanım amaçları:

## Factory Pattern
Indirim nesnelerini daha düzenli oluşturmak için kullanıldı.

## Decorator Pattern
Kurslara sonradan yeni özellik eklemek için kullanıldı.

## Facade Pattern
Karmaşık işlemleri tek bir class üzerinden yapmak için kullanıldı.

## Strategy Pattern
Farklı ödeme yöntemlerini seçebilmek için kullanıldı.

## Observer Pattern
Kullanıcılara bildirim göndermek için kullanıldı.


# Projede Yapılanlar

- Kurslara indirim uygulama
- Kurs paketi oluşturma
- Sertifika ve mentorluk ekleme
- Farklı ödeme yöntemleri kullanma
- Kullanıcılara bildirim gönderme


# Kullanılan Dosyalar

- Main.java
- KursIndirimFactory.java
- KursFacade.java
- OdemeIslemi.java
- KursBildirimSistemi.java


# Projeyi Çalıştırma

1. src klasöründeki dosyaları açın
2. Main.java dosyasını çalıştırın
3. Sonuçları konsolda görebilirsiniz


# Gelistirme Sureci Hakkinda Not

Proje ilk basta daha karisik bir sekilde geliştirilmeye başlanmıştır.
Daha sonra commit düzeninin ve proje yapısının daha anlaşılır olması için eski deneme dosyalarının bir kısmı temizlenmiştir.
Bu aşamadan sonra proje tekrar düzenli şekilde fazlara ayrılarak geliştirilmiştir.
Her faz için ayrı branch kullanılmaya çalışılmıştır.
Kod geliştirme sürecinde:
- yeni dosyalar tek tek eklenmiştir
- metodlar aşamalı şekilde yazılmıştır
- patternler sırayla projeye dahil edilmiştir
Bu nedenle commit geçmişinde hem eski denemeler hem de yeniden düzenlenen geliştirme süreci birlikte görülebilir.