# Insertion Sort Projesi
## Proje 1

### Soru 1: 
[22,27,16,2,18,6] -> Insertion Sort

Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

### Cevap: 

- [**_22_**,27,16,2,18,6]   // 0. index 
- [22,**_27_**,16,2,18,6]   // 1.index
- [**_16_**,22,27,2,18,6]   // 2.index
- [**_2_**,16,22,27,18,6]  // 3. index
- [2,16,**_18_**,22,26,6]  // 4.index
- [2,**_6_**,16,18,22,26] // 5.index
- [2,6,16,18,22,27] // final

---

### Soru 2:

Big-O gösterimini yazınız.

### Cevap: 

- Birinci adım => n-(n-1) = 1
- İkinci adım => n-(n-2) = 2
- Üçüncü adım => n -(n-3) = 3
- ...
- n. adım => n - (n-n) = n

1+2+3+...+n = n.(n-1)/2

**O(n^2)**

---

### Soru 3:

Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız

Average case: Aradığımız sayının ortada olması
Worst case: Aradığımız sayının sonda olması
Best case: Aradığımız sayının dizinin en başında olması.

### Cevap:
Sıralı olduğu için ve 18 sayısı dizinin tam ortasında bulunduğu için **Avarage Case** kapsamına girmektedir.

---

### Soru 4:

[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.

### Cevap:
- [**_2_**,3,5,8,**_7_**,9,4,15,6] //1. adım
- [2,**_3_**,5,8,7,9,4,15,6] //2. adım
- [2,3,**_4_**,8,7,9,**_5_**,15,6] //3. adım
- [2,3,4,**_5_**,7,9,**_8_**,15,6] //4. adım