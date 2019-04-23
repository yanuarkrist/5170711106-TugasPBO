package tugas17aprill;
public class Mahasiswa extends Manusia{


@Override
float inputUmur(){
     umur = umur + 4;
    System.out.println("Umur mahasiswa : "+ umur);
    return umur;
}    

     String inputNIM(){
        System.out.print("Masukkan No Induk Mahasiswa : ");
         String nim = input.next();
         return nim;
    }
}