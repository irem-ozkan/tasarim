# Faz 0 - Problemler

1. Kod içinde çok fazla if-else kullanılmıştır. Yeni indirim türü eklenince kod daha fazla büyüyecektir. Bu da hata oranını arttıracaktır.

2. Bütün işlemler tek class içinde yapılıyor. İleride kod büyürse düzeni korumak zor olabilir.

3. Yeni özellik eklemek için mevcut kodu değiştirmek gerekiyor. Bu durum kodun geliştirilmesini zorlaştırabilir.

4. İndirim işlemleri ayrı yapılmamış. Bu yüzden kodu tekrar kullanmak zor olabilir.

5. Kod şu an küçük olduğu için anlaşılabiliyor ama büyüdükçe karmaşık hale gelebilir.

# AI Analizi

Kodu ChatGPT ile birlikte analiz ettim.
AI da if-else kullanımının fazla olduğunu ve sistem büyüdükçe sorun çıkarabileceğini söyledi.

Ayrıca Strategy ve Factory gibi patternlerin kullanılabileceğini önerdi.

Benim gördüğüm problemler ile AI'ın söyledikleri büyük oranda benzerdi.