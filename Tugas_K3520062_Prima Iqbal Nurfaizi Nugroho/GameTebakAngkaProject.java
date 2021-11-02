/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameTebakAngkaProject;

/**
 *
 * @author PRIMA IQBAL
 */
public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // logika aplikasi kode TODO di sini
        int tebak;
        
        
        bilRandom rn =  baru bilRandom();
        int acak = rn . menghasilkan();
        Sistem . keluar . println(acak);
        
        Sistem . keluar . println( " Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!! " );
        Masukan pemindai =  Pemindai baru  ( System . in);
        
//        sementara(benar){
//             System.out.println("Masukan tebakan anda: ");
//             tebak = masukan.nextInt();
//            
//             jika(tebak < acak){
//                 System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
//                
//             } else if(tebak > acak){
//                 System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
//                
//             } else if(tebak == acak) {
//                 System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
//                 istirahat;
//             } lain{
//                 System.out.println("Masukan angka !!!");
//             }
//         }
        
        lakukan {
            Sistem . keluar . println( " Pastikan tebakan anda: " );
            tebak = masukan . nextInt();
            
            if (tebak < acak){
                Sistem . keluar . println( " Hehehe… Bilangan tebakan anda terlalu kecil " );
                
            } else  if (tebak > acak){
                Sistem . keluar . println( " Hehehe… Bilangan tebakan anda terlalu besar " );
                
            } lain {
                Sistem . keluar . println( " Yeeee… Bilangan tebakan anda BENAR :-) " );
                istirahat ;
            }
        } while (tebak != acak);
        
    }
    
    
}
    }
    
}
