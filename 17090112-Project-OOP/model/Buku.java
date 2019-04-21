package model;

public class Buku {

    private String kdBuku;
    private String jdlBuku;
    private String nmPengarang;
    private String penerbit;
    private String thnTerbit;


    public Buku() {}

    public Buku(String kdBuku, String jdlBuku, String nmPengarang, String penerbit, String thnTerbit) {
        this.kdBuku = kdBuku;
        this.jdlBuku = jdlBuku;
        this.nmPengarang = nmPengarang;
        this.penerbit = penerbit;
        this.thnTerbit = thnTerbit;
    }

    @Override
    public boolean equals(Object obj) {
        Buku bukuperpus = (Buku) obj;
        if(this.kdBuku.equals(bukuperpus.getKdBuku())) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "[ " + kdBuku + ", " + jdlBuku + ", " + nmPengarang + ", "+ penerbit + ", "+ thnTerbit + " ];";
    }

    

    public void setKdBuku(String kdBuku) { this.kdBuku = kdBuku; }

    public String getKdBuku() { return kdBuku; }

    public void setJdlBuku(String jdlBuku) { this.jdlBuku = jdlBuku; }

    public String getJdlBuku() { return jdlBuku; }

    public void setNmPengarang(String nmPengarang) { this.nmPengarang = nmPengarang; }

    public String getNmPengarang() { return nmPengarang; }

    public void setPenerbit(String penerbit) { this.penerbit = penerbit; }

    public String getPenerbit() { return penerbit; }

    public void setThnTerbit(String thnTerbit) { this.thnTerbit = thnTerbit; }

    public String getThnTerbit() { return thnTerbit; }

}