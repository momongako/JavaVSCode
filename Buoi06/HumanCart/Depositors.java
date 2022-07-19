package Buoi06.HumanCart;

public class Depositors implements Comparable<Depositors> {
    private String ma;
    private String diaChi;
    private int sdt;
    private int ngaySinh;

    public Depositors(String ma, String diaChi, int sdt, int ngaySinh) {
        this.ma = ma;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.ngaySinh = ngaySinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public int compareTo(Depositors o) {
        return ma.compareTo(o.ma);

    }

}
