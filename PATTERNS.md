# Factory Pattern

Bu fazda Factory Pattern kullanildi.
Indirim sistemini daha düzenli yapmak için KursIndirimFactory classi oluşturuldu.
Boylece yeni indirim türleri eklemek daha kolay hale geldi.
Main.java içinde direkt if else yazmak yerine factory üzerinden nesne oluşturuldu.

# Decorator Pattern

Bu fazda Decorator Pattern kullanıldı.
Kurslara sonradan özellik eklemek için kullanıldı.
JavaKursu üzerine Sertifika ve Mentorluk eklendi.
Bu sayede kurs classını bozmadan yeni özellik ekleyebildik.

# Facade Pattern

Bu fazda Facade Pattern kullanıldı.
Kurs paketi oluşturma işlemi KursFacade classına alındı.
Main.java içinde tek tek kurs oluşturmak yerine javaKursPaketiOlustur metodu kullanıldı.
Bu sayede Main.java daha sade oldu.

# Strategy Pattern

Bu fazda Strategy Pattern kullanıldı.
Ödeme işlemlerini daha düzenli yapmak için farklı ödeme yöntemleri oluşturuldu.
Kredi kartı ve havale için ayrı classlar yazıldı.
OdemeIslemi classı üzerinden ödeme yöntemi seçilebilir hale getirildi.

# Observer Pattern

Bu fazda Observer Pattern kullanıldı.
Kullanıcılara bildirim göndermek için KursBildirimSistemi classı oluşturuldu.
Abone olan kullanıcılar bildirim alabildi.
Bu sayede bildirim sistemi daha düzenli hale geldi.