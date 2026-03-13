class Member extends User{
    // Constructor pada child class
    public Member (String username){
        super(username);
    }

    // Override method parent class pada di child class
    @Override
    public void tampilkanAkses(){
        System.out.println("\nUser " + username + " adalah Member, dapat mmelihat playlist dan mencari lagy by judul");
    }

    // Mehtod untuk melihat semua lagu dalam playlist
    public void lihatPlaylist(PlaylistOOP[] playlist){
        System.out.println("=== PLAYLIST ===");
        for (PlaylistOOP lagu : playlist){
            if (lagu != null){
                lagu.tampilkanInfo();
            }
        }
    }

    // Method untuk mencari lagu dalam playlist berdasarkan judul
    public void cariLagu(PlaylistOOP[] playlist, String judul) {
        boolean ditemukan = false;

        for (PlaylistOOP lagu : playlist) {
            if (lagu != null && lagu.getJudul().equalsIgnoreCase(judul)) {
                System.out.println("\nLagu ditemukan.");
                lagu.tampilkanInfo();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("\nLagu tidak ditemukan.");
        }
    }
    
}
