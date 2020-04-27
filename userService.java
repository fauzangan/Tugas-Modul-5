package tugas.modul.pkg5;

public class userService {
    private String[][] data = new String[2][3];
    private String[][] histories = new String[2][4];
    private String email, password, roles, roles1, roles2, roles3, roles4 = "";
    
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"Fauzankelompok19@gmail.com", "12345", "supedAdmin"},
            {"Firdikelompok19@gmail.com", "12345", "user"} 
        };
        String[][] histories = 
        {
            {"Fauzankelompok19@gmail.com", "Fisika Dasar", "Dasar Komputer dan Pemrograman", "27-04-2020"},
            {"Firdikelompok19@gmail.com", "Dasar Komputer dan Pemrograman", "Konsep Jaringan Komputer", "27-04-2020"}
        };
        this.data = data;
                this.histories = histories;
    }
    
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    roles = data[i][2];
                    roles1 = histories[i][1];
                    roles2 = histories[i][2];
                    roles3 = histories[i][3];
                    
                    return true;
                }
            }
        }
        return false;
    }
  
    
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
            System.out.println(""+ roles1);
            System.out.println("" + roles2);
            System.out.println("Tanggal Peminjaman = " + roles3);
        }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }
}

