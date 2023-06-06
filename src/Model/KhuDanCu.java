package Model;

import java.util.List;

/**
 * 
 */
public class KhuDanCu {
    private int soTang;
    private int soPhong;
    private List<Phong> dsPhongKTX;
    public KhuDanCu(int soTang, int soPhong, List<Phong> dsPhongKTX) {
        this.soTang = soTang;
        this.soPhong = soPhong;
        this.dsPhongKTX = dsPhongKTX;
    }
    public KhuDanCu() {
    }
    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }
    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }
    public void setDsPhongKTX(List<Phong> dsPhongKTX) {
        this.dsPhongKTX = dsPhongKTX;
    }
    public int getSoTang() {
        return soTang;
    }
    public int getSoPhong() {
        return soPhong;
    }
    public List<Phong> getDsPhongKTX() {
        return dsPhongKTX;
    }
}
