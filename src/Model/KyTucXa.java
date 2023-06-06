package Model;

import java.util.List;

/**
 * The KyTucXa class represents a dormitory with a number of floors, rooms, and a list of rooms.
 */
public class KyTucXa {
    private int soTang;
    private int soPhong;
    private List<PhongKTX> dsPhongKTX;
    public KyTucXa(int soTang, int soPhong, List<PhongKTX> dsPhongKTX) {
        this.soTang = soTang;
        this.soPhong = soPhong;
        this.dsPhongKTX = dsPhongKTX;
    }
    public KyTucXa() {
    }
    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }
    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }
    public void setDsPhongKTX(List<PhongKTX> dsPhongKTX) {
        this.dsPhongKTX = dsPhongKTX;
    }
    public int getSoTang() {
        return soTang;
    }
    public int getSoPhong() {
        return soPhong;
    }
    public List<PhongKTX> getDsPhongKTX() {
        return dsPhongKTX;
    }
}
