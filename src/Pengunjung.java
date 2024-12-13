public class Pengunjung extends wisata {
    private  int umur;
    private  String JenisTiket;

    public Pengunjung(String id, String name, int umur, String jenisTiket) {
        super(id, name);
        this.umur = umur;
        JenisTiket = jenisTiket;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJenisTiket() {
        return JenisTiket;
    }

    public void setJenisTiket(String jenisTiket) {
        JenisTiket = jenisTiket;
    }
}
