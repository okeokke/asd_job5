# Jobsheet 5 / Brute Force dan Divide Conquer

# [Tugas](#tugas-1)  
# [Daftar_Percobaan](#daftar_percobaan-1)  

# TUGAS  
### TUGAS_1    
Soal :  
Sebuah kampus memiliki daftar nilai mahasiswa dengan data sesuai tabel berikut:

| Nama |     NIM      | Tahun Masuk | UTS | UAS |
|------|--------------|-------------|-----|-----|
| Ahmad | 220101001 | 2022 | 78 | 82 |
| Budi | 220101002 | 2022 | 85 | 88 |
| Cindy | 220101003 | 2021 | 90 | 87 |
| Dian | 220101004 | 2021 | 76 | 79 |
| Eko | 220101005 | 2023 | 92 | 95 |
| Fajar | 220101006 | 2020 | 88 | 85 |
| Gina | 220101007 | 2023 | 80 | 83 |
| Hadi | 220101008 | 2020 | 82 | 84 |

Tentukan:  
a) Nilai UTS tertinggi menggunakan Divide and Conquer!  
b) Nilai UTS terendah menggunakan Divide and Conquer!  
c) Rata-rata nilai UAS dari semua mahasiswa menggunakan Brute Force!


---  

# Daftar_Percobaan
1. [Percobaan 1](#percobaan-1)
- [Pertanyaan](#pertanyaan)
    * [Jawaban](#jawaban)
2. [Percobaan 2](#percobaan-2)
- [Pertanyaan](#pertanyaan-1)
    * [Jawaban](#jawaban-1)
3. [Percobaan 3](#percobaan-3)
- [Pertanyaan](#pertanyaan-2)
    * [Jawaban](#jawaban-2)

---

## Percobaan 1

[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)

### Pertanyaan
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
2. Apakah memungkinkan perulangan pada method `faktorialBF()` diubah selain menggunakan for? Buktikan!
3. Jelaskan perbedaan antara `fakto *= i;` dan `int fakto = n * faktorialDC(n-1);`!
4. Buat Kesimpulan tentang perbedaan cara kerja method `faktorialBF()` dan `faktorialDC()`!
  
[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)

### Jawaban


[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)

---

## Percobaan 2

[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)

### Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu `pangkatBF()` dan `pangkatDC()`!
2. Apakah tahap combine sudah termasuk dalam kode tersebut? Tunjukkan!
3. Pada method `pangkatBF()` terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class `Pangkat` telah ada atribut `nilai` dan `pangkat`, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method `pangkatBF()` tanpa parameter?
4. Tarik kesimpulan tentang cara kerja method `pangkatBF()` dan `pangkatDC()`!

[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)

### Jawaban   


[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)

---

## Percobaan 3

[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)

### Pertanyaan
1. Kenapa dibutuhkan variable `mid` pada method `TotalDC()`?
2. Untuk apakah statement dibawah ini dilakukan dalam `TotalDC()`?
```java
double lsum = totalDC(arr, l, mid);
double rsum = totalDC(arr, mid + 1, r);
```
3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti dibawah ini?
```java
return lsum + rsum;
```
4. Apakah base case dari `totalDC()`?
5. Tarik kesimpulan tentang cara kerja `totalDC()`!

[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)

### Jawaban


[Kembali ke #Daftar_Percobaan](#daftar_percobaan-1)
