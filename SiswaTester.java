public class SiswaTester {
    public static void main(String[] args) {
//membuat Object
//namaClass namaObject = new
//Constructor();
Siswa natan = new Siswa();
Siswa arka = new Siswa();
Siswa nero = new Siswa();
Siswa fadil = new Siswa();
Siswa royan = new Siswa();


natan.id = 27;
natan.nama = "Natanz";
natan.ipk = 86.6;
arka.id = 17;
arka.nama = "Arka";
arka.ipk = 85.8;
nero.id = 11;
nero.nama = "Dinero";
nero.ipk = 10.0;
fadil.id = 19;
fadil.nama = "Fadli";
fadil.ipk = 81.2;
royan.id = 1;
royan.nama = "Royyan";
royan.ipk = 99.9; 

natan.print();
arka.print();
nero.print();
fadil.print();
royan.print();
    }
}
