package org.example;



import java.util.Scanner;

class Siswa {
    String nama;
    double[] nilai;
    double rataRata;

    public Siswa(String nama, double[] nilai) {
        this.nama = nama;
        this.nilai = nilai;
        hitungRataRata();
    }

    private void hitungRataRata() {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        rataRata = total / nilai.length;
    }
}

public class HitungNilaiRataRata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi array untuk menyimpan siswa
        Siswa[] siswaArray;

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        // Inisialisasi array siswa
        siswaArray = new Siswa[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("\nMasukkan nama siswa ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan jumlah mata pelajaran: ");
            int jumlahMataPelajaran = scanner.nextInt();

            double[] nilai = new double[jumlahMataPelajaran];
            for (int j = 0; j < jumlahMataPelajaran; j++) {
                System.out.print("Masukkan nilai mata pelajaran ke-" + (j + 1) + ": ");
                nilai[j] = scanner.nextDouble();
            }
            scanner.nextLine(); // Membersihkan buffer

            // Buat objek Siswa dan masukkan ke dalam array
            siswaArray[i] = new Siswa(nama,  nilai);
        }

        // Output rincian nilai setiap siswa
        System.out.println("\n--- Rincian Nilai Siswa ---");
        for (Siswa siswa : siswaArray) {
            System.out.println("Nama Siswa: " + siswa.nama);
            System.out.println("Nilai Mata Pelajaran: ");
            for (double n : siswa.nilai) {
                System.out.println(" - " + n);
            }
            System.out.println("Rata-rata Nilai: " + siswa.rataRata);
            System.out.println();
        }
    }
}
