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
![OnlineMovieSystem (1)](https://user-images.githubusercontent.com/43732258/126642794-0e705aa8-02aa-4810-a889-c532b36ec08b.png)

**5.Ödev-Asansör Simülasyonu**<br/>
Aşağıdaki problem ifadesine göre bir sınıf diyagramı tasarlayın.<br/>
Nesne Yönelimli Programlamanın ilkelerini ve sınıflar arası ilişki durumlarını kullanmaya çalışın (Encapsulation, Inheritance, Polymorphism, Abstraction).<br/>
Kodluyoruz Sigorta Şirketi 12 katlı bir ofis binası inşa etmek ve onu en son asansör teknolojisi ile donatmak istiyor.<br/>
Şirket, bina içindeki trafik akışı ihtiyaçlarını karşılayıp karşılamayacaklarını görmek için binanın asansörlerinin işlemlerini modelleyen bir yazılım simülatörü oluşturmanızı istiyor.<br/>
Binada, her biri binanın 12 katına çıkabilecek beş asansör bulunacaktır.<br/>
Her asansörün yaklaşık altı yetişkin yolcu kapasitesi vardır.<br/>
Asansörler enerji tasarruflu olacak şekilde tasarlanmıştır, bu nedenle yalnızca gerektiğinde hareket ederler.<br/>
Her asansörün kendi kapısı, kat gösterge ışığı ve kontrol paneli vardır.<br/>
Kontrol panelinde hedef düğmeleri, kapı açma ve kapama düğmeleri ve bir acil durum sinyal düğmesi bulunur.<br/>
Binadaki her katta, beş asansör boşluğunun her biri için bir kapı ve her kapı için bir varış zili vardır.<br/>
Varış zili, asansörlerin bir kata vardığını gösterir.<br/>
Her kapının üzerinde bulunan bir sinyal ışığı, asansörün gelişini ve asansörün hareket ettiği yönü gösterir.<br/>
Her katta ayrıca üç set asansör çağrı düğmesi vardır.<br/>
Bir kişi uygun çağrı düğmesine (yukarı veya aşağı) basarak bir asansörü çağırır.<br/>
Bir programlayıcı, aramanın başladığı kata gitmek için beş asansörden birini görevlendirir.<br/>
Asansöre girdikten sonra, bir yolcu tipik olarak bir veya daha fazla hedef düğmesine basar.<br/>
Asansör kattan kata hareket ederken, asansörün içindeki bir gösterge ışığı yolcuları asansörün konumu hakkında bilgilendirir.<br/>
Bir asansörün bir kata varması, dış asansör kapısının üzerindeki göstergelambasının yakılması ve kat zilinin çalmasıyla belirtilir.<br/>
Bir asansör bir katta durduğunda, her iki kapı grubu da önceden belirlenmiş bir süre boyunca otomatik olarak açılarak yolcuların asansöre girip çıkmalarına izin verir.<br/>
Simülatör, gerçek zaman geçişini simüle etmek ve simülasyonda meydana gelen olayları zaman damgası ve günlüğe kaydetmek için bir "saat" kullanır.<br/>
Simülatör tarafından yolcu oluşturmak ve her yolcu için kalkış ve varış katlarını belirlemek için rastgele bir sayı üreteci kullanılır.<br/>
![ElevatorSimulation](https://user-images.githubusercontent.com/43732258/126760136-aa1e3d36-6d04-4443-9ca7-0599bc1b6bc6.png)
