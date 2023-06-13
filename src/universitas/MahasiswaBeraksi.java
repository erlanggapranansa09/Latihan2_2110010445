
package universitas;


public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa Mahasiswa1 = new Mahasiswa();
        
        Mahasiswa1.setnama("Muhammad Erlangga Pranansa");
        Mahasiswa1.setprodi("TI");
        Mahasiswa1.setnpm(2110010445);
        
        System.out.println("nama     :"+Mahasiswa1.getnama());
        System.out.println("prodi    :"+Mahasiswa1.getprodi());
        System.out.println("npm      :"+Mahasiswa1.getnpm());
        
        
    }
    
}
