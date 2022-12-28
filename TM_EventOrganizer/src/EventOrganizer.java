import java.util.ArrayList;

public class EventOrganizer {

    private int CustId;
    private String CustName;
    private String CustAddr;
    private String CustEmail;
    private String CustPhone;

    //Getter and Setter
    public int getCustId() {
        return CustId;
    }

    public void setCustId(int custId) {
        CustId = custId;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public String getCustAddr() {
        return CustAddr;
    }

    public void setCustAddr(String custAddr) {
        CustAddr = custAddr;
    }

    public String getCustEmail() {
        return CustEmail;
    }

    public void setCustEmail(String custEmail) {
        CustEmail = custEmail;
    }

    public String getCustPhone() {
        return CustPhone;
    }

    public void setCustPhone(String custPhone) {
        CustPhone = custPhone;
    }

    //Constructor tanpa parameter
    public EventOrganizer() {

    }

    //Constructor dengan parameter
    public EventOrganizer(int custId, String custName, String custAddr, String custEmail, String custPhone) {
    this.CustId = custId;
    this.CustName = custName;
    this.CustAddr = custAddr;
    this.CustEmail = custEmail;
    this.CustPhone = custPhone;
    }

    //Method PrintGuests
    public void PrintGuests(ArrayList<EventOrganizer> guests){
        for (EventOrganizer guest : guests){
            System.out.println("======= Daftar Tamu =======");
            System.out.println("Id Tamu : " + guest.getCustId());
            System.out.println("Nama Tamu : " + guest.getCustName());
            System.out.println("Alamat Tamu : " + guest.getCustAddr());
            System.out.println("Email Tamu : " + guest.getCustEmail());
            System.out.println("Nomer HP Tamu : " + guest.getCustPhone());
            System.out.println("========================== ");
            System.out.println("");

        }
    }
}
