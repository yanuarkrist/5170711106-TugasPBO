package tugas17aprill;

import java.util.Scanner;

public class Manusia {
   protected String nama;
   protected int umur = 15;
    
Scanner input = new Scanner(System.in);

String inputNama() {
    System.out.print("Masukkan Nama : ");
    nama = input.next();
    return nama;
}
float inputUmur(){
    System.out.println("macam - macam umur ");
    return umur;
    
}
}