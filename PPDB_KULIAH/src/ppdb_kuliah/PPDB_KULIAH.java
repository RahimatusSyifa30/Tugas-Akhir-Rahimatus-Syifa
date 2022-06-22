package ppdb_kuliah;
import Controller.MahasiswaControll;
import Controller.AllObjectModel;
import Entity.Mahasiswa;
import java.util.Scanner;

public class PPDB_KULIAH {
    
    public static Scanner input = new Scanner(System.in);
    public static MahasiswaControll Controller = new MahasiswaControll();
    
    public static void main(String[] args) throws Exception {
    //Controller.Sync();
    
    int pil;
    
    do {
        
        System.out.println("+----------------------+");
        System.out.println("|     PPDB KULIAH      |");
        System.out.println("+----------------------+");
        System.out.println("| 1. Regis             |");
        System.out.println("| 2. Login             |");
        System.out.println("| 3. Exit              |");
        System.out.println("-----------------------+");
       System.out.print("Masukan pilihan : ");
        pil = input.nextInt();
        input.nextLine();
        
       switch(pil){
            case 1 :
                insertData();
                break;
            
            case 2 :
                login();
                break;
            
            case 3 : 
                System.out.println("Keluar");
            }
    } while (pil <= 2);
    }
    


    static void insertData(){
        System.out.print(" Nama   = ");
        String nama = input.nextLine();
        System.out.print(" Npm  = ");
        String npm = input.nextLine();
        System.out.print(" No Telp   = ");
        String noTelp = input.nextLine();
       /* Controller.insertData(nama, npm, noTelp);   
    */}
    static void login(){
        System.out.println("+--------------------------------+");
        System.out.println("|       DATA KURSUS YG ADA       |");
        System.out.println("+--------------------------------+");
        
        /*KursusController.Display();
    */}}
   /** static void Read(){
        System.out.println("+--------------------------------+");
        System.out.println("|       DATA KURSUS YG ADA       |");
        System.out.println("+--------------------------------+");
        
        KursusController.Display();
    }

    static void Update(){
        System.out.print(" Data peserta yang akan diedit: ");
        String nama = input.nextLine();
        
        System.out.print(" Npm  = ");
        String npm = input.nextLine();
        System.out.print(" No Telp   = ");
        String noTelp= input.nextLine();
        
        KursusController.Update(nama, npm, noTelp);
    }

    static void Delete(){
        System.out.print(" Nama yang mau dihapus: ");
        String nama = input.nextLine();
        KursusController.Delete(nama);
    }
    **/

    
    

