import java.util.Scanner;
public class Nomor1{
    public static void main(String[] args){
        int jumlahAnggotaKeluarga, tunjanganKesehatan, besarTunjanganKesehatan;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jumlah Anggota Keluarga:");
        jumlahAnggotaKeluarga = scanner.nextInt();

        if (jumlahAnggotaKeluarga <= 3){
           jumlahAnggotaKeluarga *= 100000.0;
           System.out.println("Maka tunjangan kesehatan yang diberikan sebesar:" + jumlahAnggotaKeluarga );
        }
        else if (jumlahAnggotaKeluarga > 3){
            jumlahAnggotaKeluarga = (jumlahAnggotaKeluarga * 100000) + (jumlahAnggotaKeluarga - 3) * 50000;
            System.out.println("Maka tunjangan kesehatan yang diberikan sebesar:" + jumlahAnggotaKeluarga);
        }
        System.out.println("Besar tunjangan kesehatan:");
        tunjanganKesehatan = (100000 * 3) + (jumlahAnggotaKeluarga - 3 ) * 50000;
    }
}


// Program MenghitungTunjanganKesehatan;

//Deklarasi
jumlahAnggotaKeluarga, tunjanganKesehatan, besarTunjanganKesehatan: integer;

//Algoritma
// Output ("Jumlah Anggota Keluarga:");
// Input (jumlahAnggotaKeluarga);

// if (jumlahAnggotaKeluarga <= 3) then
//   jumlahAnggotaKeluarga = jumlahAnggotaKeluarga * 100000;
// else if (jumlahAnggotaKeluarga > 3) then
//    jumlahAnggotaKeluarga = (jumlahAnggotaKeluarga * 100000) + (jumlahAnggotaKeluarga - 3) * 50000;

// output ("Besar Tunjangan Kesehatan:");
// tunjanganKesehatan = (100000 * 3) + (jumlahAnggotaKeluarga - 3 ) * 50000;
// end if
// end
