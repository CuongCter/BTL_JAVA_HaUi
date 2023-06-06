/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class SinhVien {
    protected String MaSV,TenSV,Khoa;
    protected String NgaySinh;
    protected String GioiTinh;

    public SinhVien() {
    }

    public SinhVien(String MaSV) {
        this.MaSV = MaSV;
    }

    public SinhVien(String MaSV, String TenSV, String Khoa, String NgaySinh, String GioiTinh) {
        this.MaSV = MaSV;
        this.TenSV = TenSV;
        this.Khoa = Khoa;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
    }

    
    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    
    @Override
    public String toString() {
        return  MaSV+","+ TenSV+ "," + Khoa +","+ NgaySinh +","+ GioiTinh;
    }

    public SinhVien(String MaSV, String TenSV) {
        this.MaSV = MaSV;
        this.TenSV = TenSV;
    }
    
    public SinhVien(String msv, String hoTen, String gioiTinh, String ngaySinh) {
        this.MaSV = msv;
        this.TenSV = hoTen;
        this.GioiTinh = gioiTinh;
        this.NgaySinh = ngaySinh;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SinhVien other = (SinhVien) obj;
        return Objects.equals(this.MaSV, other.MaSV);
    }  

}