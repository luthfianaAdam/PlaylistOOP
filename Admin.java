class Admin extends User{

    // Constructor pada child class
    public Admin (String username){
        super(username);
    }

    // Override method parent class pada di child class
    @Override
    public void tampilkanAkses() {
        System.out.println("\nUser " + username + " adalah Admin, dapat menambahkan lagu ke playlist");
    }

    // Method untuk menambahkan lagu ke playlist
    public void tambahLagu(PlaylistOOP[] playlist, PlaylistOOP laguBaru) {
        for (int i = 0; i < playlist.length; i++){
            if (playlist[i] == null){
                playlist[i] = laguBaru;
                System.out.println("Lagu berhasil ditambahkan");
                break;
            }
        }
    }
}
