
import java.util.Scanner;

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Memasukkan Nilai dari keyboard lalu menampilkannya
 *
 */
public class InputValue {

    public static void main(String[] args) {
        System.out.print("Masukkan nama anda : ");
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.next();
        System.out.println("Nama anda adalah " + nama);
    }
}
