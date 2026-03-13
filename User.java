class User {
    protected String username;

    // Constructor pada parent class
    public User (String username){
        this.username = username;
    }

    // Method untuk tampilkan hak akses
    public void tampilkanAkses(){
        System.out.println("Normal User");
    }
    
}
