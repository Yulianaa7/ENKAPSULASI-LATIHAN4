package ujibus3;

/**
 *
 * @author Yuliana
 */
public class Bus3 {
    //mendeklarasikan variabel akses modifier public
    public int penumpang;
    public int maxpenumpang;
    public double rata;
    
    //konstruktor kelas Buas
    public Bus3(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    //method mutator untuk menambahkan penumpang
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if(temp > maxpenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
        }
    }
    public void getpenumpang(int password){
        if (password == 24){
            System.out.println("Password Benar");
        }else{
            System.out.println("Password Salah");
        }
    }
    //method void cetakpenumpang untuk menampilkan jumlah penumpang sekarang dan maksimal penumpang
    public void cetakpenumpang(){
        System.out.println("Penumpang Bus Sekarang = "+ penumpang);
        System.out.println("Maksimun penumpang yang seharusnya adalah "+maxpenumpang);
    }
}