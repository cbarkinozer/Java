Proje 1 <br/>
[22,27,16,2,18,6] -> Insertion Sort<br/>
Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.<br/>
[16,22,27,2,18,6]->[2,16,22,27,18,6]->[2,16,18,22,27,6]->[2,6,16,18,22,27]<br/>
Big-O gösterimini yazınız.<br/>
O(n^2)<br/>
Time Complexity:<br/>
Average case: O(36) ,Worst case: O(36), Best case: O(6) .<br/>
Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Average(close to the worst).<br/>
[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.<br/>
[3,7,5,8,2,9,4,15,6]->[3,5,7,8,2,9,4,15,6]->[2,3,5,7,8,9,4,15,6]->[2,3,4,5,7,8,9,15,6]<br/>


Proje 2<br/>
[16,21,11,8,12,22] -> Merge Sort<br/>
Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.<br/>
[16,21],[8,11],[12,22]->[8,11,16,21],[12,22]->[8,11,12,16,21,22]<br/>
Big-O gösterimini yazınız.<br/>
Average, best, worst: O(n*Log n)<br/>

Proje 3<br/>
[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.<br/>
Bulk loading değil sıra ile yüklendiği varsayılmıştır.<br/>
7-> 7 -> 7  ->  7   ->    7    ->  7    ->   7    ->   7     ->       7        <br/>
   5    5     5  8      5   8     5  8      5  8      5   8          5  8      <br/>
       1     1        1  6       1  6      1 6  9    1  6   9      1  6  9     <br/>
              3         3       0  3      0 3       0 3           0  3         <br/>
                                                       4            2  4       <br/>
 
![Ekran Görüntüsü (231)](https://user-images.githubusercontent.com/43732258/140581172-87516632-059e-426d-ab58-20a5f3d9186e.png)
