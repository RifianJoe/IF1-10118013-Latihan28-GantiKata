/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan28.gantikata;
import java.util.Scanner;
/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-1
 * NIM : 10118013
 * Deskripsi Program : Menampilkan Hasil Pergantian Sebuah Kata
 */
public class IF110118013Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        String kalimatAwal = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        String kalimatGanti = scanner.next();
        System.out.print("Menjadi Kata : ");
        String kalimatBaru = scanner.next();
        String kalimatAkhir = kalimatAwal.replace(kalimatGanti, kalimatBaru);
        System.out.println("");
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Kalimat Awal : " + kalimatAwal);
        System.out.println("Kalimat Baru : " + kalimatAkhir);
        System.out.println("(Developed by : Rifian Joe Premilenio)");
        
    }
    
}
