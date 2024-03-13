public class Data {
    private String matkul;
    String tugas;
    private String deadline;

    public Data(String matkul, String tugas, String deadline) {
        this.matkul = matkul;
        this.tugas = tugas;
        this.deadline = deadline;
    }

    public String getMatkul() {
        return matkul;
    }

    public String getTugas() {
        return tugas;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public void setTugas(String tugas) {
        this.tugas = tugas;
    }

    @Override
    public String toString() {
        return "\nMata Kuliah= " + matkul + "\nTugas= " + tugas + "\nDeadline= " + deadline + "\n";
    }
}