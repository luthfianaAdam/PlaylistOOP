package Team_Assignment_1;

public class PlaylistOOP {
    private String judul;
    private String artis;
    private double durasi;

    // Contructor
    public PlaylistOOP (String judul, String artis, double durasi){
        this.judul = judul;
        this.artis = artis;
        this.durasi = durasi;
    }

    // Getter
    public String getJudul(){
        return judul;
    }
    
    public String getArtis(){
        return artis;
    }

    public double durasi(){
        return durasi;
    }

    // Setter
    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setArtis(String artis){
        this.artis = artis;
    }

    public void setDurasi(double durasi){
        this.durasi = durasi;
    }

    // method untuk menampilkan informasi lagu
    public void tampilkanInfo(){
        System.out.println(artis + " - " + judul + " - " + secondsToMinutes(durasi));
    }
    
    // Convert seconds to minutes
    public String secondsToMinutes (double durasi){
        int minutes = (int) durasi / 60;
        int seconds = (int) durasi % 60;
        String timeFormat = String.format("%d:%02d", minutes, seconds);    
        return timeFormat;           
    }
}