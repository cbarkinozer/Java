
Object oriented UML software designs

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
