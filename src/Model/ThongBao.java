/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 
 */
public class ThongBao implements Serializable {

    private String tenKyThi;
    private String monThi;
    private String ngayThi;
    private String caThi;
    private String phongThi;
    private String diemThi;
    private List<String> listSV;
    private int soSV = 0;

    public ThongBao() {
    }

    public ThongBao(String tenKyThi, String monThi, String ngayThi, String caThi, String phongThi, String diemThi, List<String> listSV) {
        this.tenKyThi = tenKyThi;
        this.monThi = monThi;
        this.ngayThi = ngayThi;
        this.caThi = caThi;
        this.phongThi = phongThi;
        this.diemThi = diemThi;
        this.listSV = listSV;
        this.soSV = listSV.size();
    }

    public String getTenKyThi() {
        return tenKyThi;
    }

    public void setTenKyThi(String tenKyThi) {
        this.tenKyThi = tenKyThi;
    }

    public String getMonThi() {
        return monThi;
    }

    public void setMonThi(String monThi) {
        this.monThi = monThi;
    }

    public String getNgayThi() {
        return ngayThi;
    }

    public void setNgayThi(String ngayThi) {
        this.ngayThi = ngayThi;
    }

    public String getCaThi() {
        return caThi;
    }

    public void setCaThi(String caThi) {
        this.caThi = caThi;
    }

    public String getPhongThi() {
        return phongThi;
    }

    public void setPhongThi(String phongThi) {
        this.phongThi = phongThi;
    }

    public String getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(String diemThi) {
        this.diemThi = diemThi;
    }

    public List<String> getListSV() {
        return listSV;
    }

    public void setListSV(List<String> listSV) {
        this.listSV = listSV;
    }

    public int getSoSV() {
        return soSV;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }
    public void xoaSV(List<String> needToRemove){
        listSV.removeAll(needToRemove);
    }
    public void themSV(String needToAdd){
        listSV.add(needToAdd);
    }
    @Override
    public String toString() {
        String data;
        data = String.format("%s,%s,%s,%s,%s,%s,%d\n", tenKyThi, monThi, ngayThi, caThi, phongThi, diemThi.toUpperCase(), listSV.size());
        for (int i = 0; i < this.listSV.size(); i++) {
            data += listSV.get(i)+"\n";
        }
        return data;
    }
}
