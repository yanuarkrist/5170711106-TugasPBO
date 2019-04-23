package tugas17aprill;
public class Sekolah extends Manusia{

@Override
float inputUmur(){
  umur = umur + 1;
    System.out.println("Umur sekolah (SMK): "+ umur);
    return umur;
}    

     String inputNIS(){
        System.out.print("Masukkan No Induk Siswa : ");
         String nis = input.next();
         return nis;
    }
}
