import java.util.Scanner;
public class Nomor2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int hargaLabubu = 300000;
        int hargaJenglot = 250000;
        int hargaVoodo = 200000;
        double totalTransaksi = 0;
        double jumlahUangYangDiterima = 0;
        int totalJumlahTransaksi = 0;
        String inputLagi;

        do {
            System.out.print("Masukkan nama produk (Labubu/Jenglot/Voodo): ");
            String namaProduk = scanner.nextLine();
            System.out.print("Masukkan jumlah pembelian: ");
            int jumlahPembelian = scanner.nextInt();
            scanner.nextLine(); 

            double subtotal = 0;

            switch (namaProduk) {
                case "Labubu":
                    subtotal = hargaLabubu * jumlahPembelian;
                    break;
                case "Jenglot":
                    subtotal = hargaJenglot * jumlahPembelian;
                    break;
                case "Voodo":
                    subtotal = hargaVoodo * jumlahPembelian;
                    break;
                default:
                    System.out.println("Nama produk tidak valid!");
                    return;
            }

            double diskon = 0;
            if (subtotal >= 1000000) {
                diskon = 0.15 * subtotal; 
            } else if (subtotal >= 500000) {
                diskon = 0.10 * subtotal; 
            }

            double hargaSetelahDiskon = subtotal - diskon;

            jumlahUangYangDiterima += hargaSetelahDiskon;
            totalJumlahTransaksi++;

            System.out.println("Total Transaksi: " + hargaSetelahDiskon);

            System.out.print("Input lagi (Y/N)?: ");
            inputLagi = scanner.nextLine();

        } while (inputLagi.equalsIgnoreCase("Y"));

        System.out.println("Total transaksi yang terjadi = " + totalJumlahTransaksi);
        System.out.println("Jumlah uang yang diterima = " + jumlahUangYangDiterima);
    }
}

//Program MenentukanOmzet;

//Deklarasi
// hargaLabubu = 300000: integer;
// hargaJenglot = 250000: integer;
// hargaVoodo = 200000: integer;
//jumlahPembelian: integer;
// totalTransaksi, jumlahUangYangDiterima, totalJumlahTransaksi: double;
// namaProduk: String;

//Algoritma
//output ("Masukkan nama produk:");
//input (namaProduk);
//output ("Masukkan jumlah pembelian:");
//input (jumlahPembelian);
//switch (namaProduk) 
//  case ("Labubu"):
//      subtotal = hargaLabubu * jumlahPembelian;
//       break;
//  case ("Jenglot"):
//        subtotal = hargaJenglot * jumlahPembelian;
//       break;//   case ("Voodo"):
//       subtotal = hargaVoodo * jumlahPembelian;
//       break;
//   default:
//      output ("Nama Produk Tidak Valid!")
//       return;
// if (subtotal >= 1000000) then
//   diskon = 0.15 * subtotal; 
// else if (subtotal >= 500000) then 
//   diskon = 0.10 * subtotal; 

// hargaSetelahDiskon = subTotal - diskon;
// output("Harga Setelah Diskon:");
//  jumlahUangYangDiterima += hargaSetelahDiskon;
// output ("Jumlah Uang Yang Diterima:");
//  totalJumlahTransaksi++;
// output ("Total transaksi = Harga setelah diskon");
// input (Y/N?)
// output("Total transaksi yang terjadi = " + totalJumlahTransaksi);
// output ("Jumlah uang yang diterima = " + jumlahUangYangDiterima);
