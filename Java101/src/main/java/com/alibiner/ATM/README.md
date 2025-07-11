# Ödev

ATM işlemlerini "Switch-Case" kullanarak yapınız.

- Belirli sayıda hatalı giriş sonucunda hesabı bloke edin.
- Para yatırma işlemi
- Para çekme işlemi
- Bakiye Sorgulama İşlemi
- Çıkış Yap işlemi

## Örnek Çıktı:

    Kullanıcı adı giriniz: a
    Parola giriniz: 1
    Kullanıcı adı ve ya şifre hatalı! Lütfen tekrar giriniz.
    Kullanıcı adı giriniz: a
    Parola giriniz: 1
    Kullanıcı adı ve ya şifre hatalı! Lütfen tekrar giriniz.
    Kullanıcı adı giriniz: a
    Parola giriniz: 1
    Çok fazla hatalı giriş yapıldı. Hesabınız blokelenmiştir.

---

    Kullanıcı adı giriniz: alibiner
    Parola giriniz: 123456
    Giriş Başarılı
    Merhaba, BNR Bankasına Hoşgeldiniz!
    -------------------------------
    1-Para yatırma
    2-Para Çekme
    3-Bakiye Sorgula
    4-Çıkış Yap
    3
    Bakiye: 5432.32 TL
    -------------------------------
    1-Para yatırma
    2-Para Çekme
    3-Bakiye Sorgula
    4-Çıkış Yap
    1
    Yatırılacak para miktarını giriniz: -100
    Eksi tutar girilemez.
    -------------------------------
    1-Para yatırma
    2-Para Çekme
    3-Bakiye Sorgula
    4-Çıkış Yap
    1
    Yatırılacak para miktarını giriniz: 500
    Para yatırılmıştır. Bakiye: 5932.32
    -------------------------------
    1-Para yatırma
    2-Para Çekme
    3-Bakiye Sorgula
    4-Çıkış Yap
    3
    Bakiye: 5932.32 TL
    -------------------------------
    1-Para yatırma
    2-Para Çekme
    3-Bakiye Sorgula
    4-Çıkış Yap
    2
    
    Çekilecek para miktarını giriniz: -100
    Eksi tutar girilemez.
    -------------------------------
    1-Para yatırma
    2-Para Çekme
    3-Bakiye Sorgula
    4-Çıkış Yap
    2
    
    Çekilecek para miktarını giriniz: 6000
    Mevcut bakiyeden fazla para çekilemez. Bakiye: 5932.32
    -------------------------------
    1-Para yatırma
    2-Para Çekme
    3-Bakiye Sorgula
    4-Çıkış Yap
    2
    
    Çekilecek para miktarını giriniz: 5932.32
    Para çekilmiştir. Bakiye: 0.0
    -------------------------------
    1-Para yatırma
    2-Para Çekme
    3-Bakiye Sorgula
    4-Çıkış Yap
    3
    Bakiye: 0.0 TL
    -------------------------------
    1-Para yatırma
    2-Para Çekme
    3-Bakiye Sorgula
    4-Çıkış Yap
    4
    Çıkış Yapıldı.

