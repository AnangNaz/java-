import java.util.Scanner;

public class laundry {
    public static void main(String[] args) {
        Scanner laundry = new Scanner(System.in);
        String[] layanan = { "standar (3 hari)", "cepat (1 hari)", "kilat (6 jam)" };
        double[] hargaPerKg = { 6000.0, 8000.0, 12000.0 };

        System.out.println("Selamat datang di NangEl laundry");
        System.out.println("Ini adalah beberapa layanan yang tersedia di NangEl laundry:");
        for (int i = 0; i < layanan.length; i++) {
            System.out.println((i + 1) + ". " + layanan[i]);
        }

        System.out.println("Silahkan isi data berikut:");
        System.out.println("Silahkan masukkan nama anda:");
        String nama = laundry.nextLine();

        int kategori = 0;
        while (kategori < 1 || kategori > 3) {
            System.out.println("Silahkan pilih layanan yang ingin anda pakai (1-3):");
            if (laundry.hasNextInt()) {
                kategori = laundry.nextInt();

                laundry.nextLine();
                if (kategori < 1 || kategori > 3) {
                    System.out.println("Anda salah memasukkan kategori layanan laundry. Silakan coba lagi.");
                }
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                laundry.next();
            }
        }

        System.out.println("Silahkan masukkan berat laundry anda (kg):");
        double beratLaundry = laundry.nextDouble();

        double totalHarga = beratLaundry * hargaPerKg[kategori - 1];
        System.out.println("\nNama: " + nama);
        System.out.println("Layanan yang dipilih: " + layanan[kategori - 1]);
        System.out.println("Berat laundry: " + beratLaundry + " kg");
        System.out.println("Total harga: Rp " + totalHarga);

        double bayar = 0;
        while (bayar < totalHarga) {
            System.out.println("bayar ");
            if (laundry.hasNextDouble()) {
                bayar = laundry.nextDouble();

                laundry.nextLine();
                if (bayar < totalHarga) {
                    System.out.println("jumlah bayar anda kurang dari total harga laundry, silahkan coba lagi");
                }
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                laundry.nextLine();
            }
        }
        double kembali = bayar - totalHarga;
        System.out.println("uang kembalian anda " + kembali);
    }
}