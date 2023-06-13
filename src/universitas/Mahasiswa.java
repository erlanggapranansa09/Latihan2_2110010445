
package universitas;


public class Mahasiswa {
    private String nama, prodi;
    protected int npm;
    
     public void setnama(String nama) {
        this.nama = nama;
    }
    
     public void setprodi(String prodi) {
        this.prodi = prodi;
    }
     
     public void setnpm(int npm) {
        this.npm = npm;
    } 
     
     public String getnama() {
         return nama;
     }
     
     public String getprodi() {
         return prodi;
     }
     
     public int getnpm() {
         System.out.println("superclass");
         return npm;
     }
}
