import java.util.ArrayList;
import java.util.Scanner;

public class GuestsRecord {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        //Membuat ArrayList
        ArrayList<EventOrganizer> guests = new ArrayList<>();
        System.out.println("Masukan Jumlah Tamu Undangan : ");
        int Jumlah_Tamu = Input.nextInt();
        for(int i = 0; i <Jumlah_Tamu; i++){
            System.out.println("Tamu Ke - " + (i+1) + " : " );
            System.out.println("Masukan ID Tamu : " );
            int id = Input.nextInt();
            Input.nextLine();
            System.out.println("Masukan Nama : ");
            String name = Input.nextLine();
            System.out.println("Masukan Alamat : ");
            String addr = Input.nextLine();
            System.out.println("Masukan Email : ");
            String email = Input.nextLine();
            System.out.println("Masukan Nomor HP : ");
            String phone = Input.nextLine();
            System.out.println("");
            
            //Mencetak Objek EventOrganizer
            EventOrganizer guest = new EventOrganizer(id, name,addr,email,phone);
            
            //Menambahkan Inputan Ke Arraylist
            guests.add(guest);
            
            //Mencetak Tamu yang Diinput 
            System.out.println("");
            EventOrganizer eventOrganizer = new EventOrganizer(0 , "", "", "", "");
            eventOrganizer.PrintGuests(guests);

        }
    }
}
