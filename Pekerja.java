package tugas17aprill;
public class Pekerja extends Manusia{
    

@Override
float inputUmur(){
    umur = umur + 7;
    System.out.println("Umur Pekerja : "+ umur);
    return super.umur;
}    
    String inputNIK(){
        System.out.print("Masukkan No Induk Karyawan : ");
        String nik = input.next();
        return nik;
    }
}