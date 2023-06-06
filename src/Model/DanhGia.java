package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 
 */
public class DanhGia extends DanCu{
    private int score;
    private String xeploai;

    public DanhGia() {
    }

    public DanhGia(String MaSV, String TenSV,int score, String xeploai) {
        super(MaSV, TenSV);
        this.score = score;
        this.xeploai = xeploai.isEmpty()?"":xeploai;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }
    

    @Override
    public String toString() {
        return  super.getMaSV()+","+ super.getTenSV()+ "," + score +","+ xeploai ;
    }
    
    
    
}
