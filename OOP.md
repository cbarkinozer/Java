**Object oriented UML software designs**

**1.Ödev- Üniversite Yönetim Sistemi**<br/>
Üniversiteye ait sınıflıklar, çalışma ofisleri ve departmanlar vardır.<br/>
Departmanlara ait ofisler vardır.<br/>
Üniversiteye ait çalışanlar vardır. Bu çalışanlar profesör veya memur olabilir.<br/>
Her çalışan bir ofiste çalışır.<br/>
Bu sistemi tasvir eden Class (Sınıf) diyagramını çiziniz.<br/>
Not : Sınıflara ait nitelik ve davranışların belirtilmesine gerek yoktur.<br/>
![UniversityAdministrationSystem](https://user-images.githubusercontent.com/43732258/126534367-7168d64d-ae4b-4714-ac92-271c224e5543.png)


**2.Ödev- Hayvanat Bahçesi**<br/>
Hayvanlar:<br/>
Atlar (atlar, zebralar, eşekler vb.), Kedigiller (kaplanlar, aslanlar vb.), Kemirgenler (sıçanlar, kunduzlar vb.) gibi gruplardaki türlerle karakterize edilir.<br/>
Hayvanlar hakkında depolanan bilgilerin çoğu(tür adı, ağırlığı, yaşı vb) tüm gruplamalar için aynıdır.<br/>
Sistem ayrıca her hayvan için belirli ilaçların dozajını alabilmeli => getDosage ()<br/>
Sistem Yem verme zamanlarını hesaplayabilmelidir => getFeedSchedule ()<br/>
Sistemin bu işlevleri yerine getirme mantığı, her gruplama için farklı olacaktır. Örneğin, atlar için yem verme algoritması farklı olup, kaplanlar için farklı olacaktır.<br/>
Polimorfizm modelini kullanarak, yukarıda açıklanan durumu ele almak için bir sınıf diyagramı tasarlayın.<br/>
![zoo](https://user-images.githubusercontent.com/43732258/126627251-036b6fb3-cb5c-4af0-a327-1dd195049711.png)

**3.Ödev- Uçuş Yönetim Sistemi**<br/>
Uçuşların ve pilotların yönetimi için bir sistem tasarlayın.<br/>
Havayolu şirketleri uçuşları gerçekleştirir. Her havayolunun bir kimliği vardır.<br/>
Havayolu şirketi, farklı tipteki uçaklara sahiptir.<br/>
Uçaklar çalışır veya onarım durumunda olabilir.<br/>
Her uçuşun benzersiz kimliği, kalkacağı ve ineceği havaalanı, kalkış ve iniş saatleri vardır.<br/>
Her uçuşun bir pilotu ve yardımcı pilotu vardır ve uçağı kullanırlar.<br/>
Havaalanlarının benzersiz kimlikleri ve isimleri vardır.<br/>
Havayolu şirketlerinin pilotları vardır ve her pilotun bir deneyim seviyesi mevcuttur.<br/>
Bir uçak tipi, belirli sayıda pilota ihtiyaç duyabilir.<br/>
Bu sistemi tasvir eden Class (Sınıf) diyagramını çiziniz.<br/>
![FlightAdministrationSystem](https://user-images.githubusercontent.com/43732258/126636924-8acb62ee-a0e5-4180-a7d8-42102a40bade.png)
<br/>*Not: getter ve setter'ları, onların varlıkları bariz olduğu için eklemedim.*<br/>


**4.Ödev-Online Film Sitesi**<br/>
Online film satan veya kiralayan uygulamanın sistemini tasarlayın.
Uygulamada filmler listenebilir, sıralanabilir ve kullanıcılar uygulamaya abone olabilir.<br/>
Kullanıcılar abonelik için sistem üzerinden kredi satın alır.<br/>
Sadece abone olan kullanıcılar, kredileri ile film kiralayabilir ve kiraladığı filmin kredi bedeli kadar hesabından düşülür.<br/>
Normal kullanıcılar ve aboneler film satın alabilirler.<br/>
Eğer film mevcut değilse ise talep edilebilir.<br/>
Bu sistemi tasvir eden Class (Sınıf) diyagramını çiziniz.<br/>

