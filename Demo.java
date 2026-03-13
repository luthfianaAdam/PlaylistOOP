/*
Group 6:
1. LUTHFIANA ADAM MALDINI (2902724045)
2. IMAM SASMITA PURNA SAKTI (2902739684)
3. MAHESA RANGGA GUNTARA (2902739715)
4. ARLINA YUNANTINING TYAS (2902738290)
5. RINI S. MARPAUNG (2902700713)
 */

public class Demo {
    public static void main(String[] args) {
        // Pembuatan object untuk berinteraksi dengan class lain
        PlaylistOOP[] playlist = new PlaylistOOP[20];
        Admin admin = new Admin("Luthfiana");
        Member member = new Member("Maldini");

        // Akses method class admin menggunakan object
        admin.tampilkanAkses();
        admin.tambahLagu(playlist, new PlaylistOOP("Love of My Life", "Queen", 222));
        admin.tambahLagu(playlist, new PlaylistOOP("Breakaway", "Avril Lavigne", 225));
        admin.tambahLagu(playlist, new PlaylistOOP("Die With A Smile", "Bruno Mars", 253));
        admin.tambahLagu(playlist, new PlaylistOOP("Remember Summer Days", "ANRI", 296));

        // Akses method class member menggunakan object
        member.tampilkanAkses();
        member.lihatPlaylist(playlist);
        member.cariLagu(playlist, "Breakaway");

    }
    
}
