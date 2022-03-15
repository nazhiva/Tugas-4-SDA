import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class tugas_queue {
    public static void main(String[] args) {
        
        System.out.println("Nama \t: Nazhiva Darma Fitri");
        System.out.println("NIM \t: 2111523004");
        System.out.println("Materi \t: Queue");
        System.out.println("----------------------");
        System.out.println("");
        
        String pelanggan;
        int i=0;
        boolean bool = true;

        Queue <String> antrian = new LinkedList<>();
        
        Scanner pilih = new Scanner(System.in);

        System.out.println("ANTRIAN PENGAMBILAN TUNAI");
        System.out.println("----------------------");

        
            System.out.println("1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. Elemen Awal");
            System.out.println("4. Bersihkan Antrian");
            System.out.println("5. Apakah Antrian kosong? ");
            System.out.println("6. Tampilkan Antrian");
            System.out.println("7. Banyaknya Antrian ");
            System.out.println("8. Selesai");
            System.out.print("MASUKAN PILIHAN [1-8]: ");
        do {
            int input=pilih.nextInt();
            switch(input){
                case 1: 
                    System.out.print("Banyak Data Yang Akan Ditambah: ");
                    i=0;
                    int h=pilih.nextInt();
                    do{
                        System.out.print("Masukan Nama Pelanggan: ");
                        pelanggan=pilih.next();
                        antrian.add(pelanggan);
                        i++;
                    }
                    while(i<h);
                    System.out.println("Antrian: "+antrian);
                    System.out.println("");
                    break;
                
                case 2:
                    System.out.println("Memanggil Nama: "+antrian.poll()); 
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Nama Paling Awal: "+antrian.peek()); 
                    System.out.println("");
                    break;
                
                case 4:
                    antrian.clear();
                    System.out.println("Antrian Telah Dibersihkan");
                    System.out.println("");
                    break;
                    
                case 5:
                    System.out.println("Apakah Antrian Kosong? "+antrian.isEmpty());
                    System.out.println("");
                    break;

                case 6:
                    System.out.println("Antrian: "+antrian);
                    System.out.println("");
                    break;

                case 7:
                    System.out.println("Banyak Antrian " +antrian.size());
                    System.out.println("");
                    break;
                
                case 8:
                    System.exit(0);
                    break;
                
                default:
                System.err.println("Pilihan Anda Salah");
                System.out.println("");
            }
        }
        while(bool);

    }
}