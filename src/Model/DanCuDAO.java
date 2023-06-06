/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import Utils.MessageDialog;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import Model.DanCu;

/**
 *
 * 
 */
public class DanCuDAO {

    public void luuFile(List<DanCu> list,boolean  t) {
        try {
            FileWriter fw =new FileWriter("src/FileData/DanCu.txt",t);
            BufferedWriter bw=new BufferedWriter(fw);
            for (DanCu sv : list) {
                bw.write(sv.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<DanCu> docFile(){
        try {
            List<DanCu> list=new ArrayList<>();
            FileReader fr=new FileReader("src/FileData/DanCu.txt");
            BufferedReader br=new BufferedReader(fr);
            String line="";
            while(true){
                line=br.readLine();
                if(line==null){
                    break;
                }
                String txt[]=line.split(",");
                list.add(new DanCu(txt[0],txt[1] , txt[2], txt[3], txt[4]));
            }
            return list;
            
        } catch (Exception e) {
        }
        return null;
    }
    public boolean suaThanhVien(String MaSV,DanCu newSV,List<DanCu> list){
                DanCu sv = new DanCu(MaSV);
		if (!list.contains(sv))
			return false;
		list.set(list.indexOf(sv), newSV);
		return true;
    }
     public boolean xoaThanhVien(String MaSV,List<DanCu> list){
                DanCu sv = new DanCu(MaSV);
		if (!list.contains(sv))
			return false;
                else{
                    list.remove(sv);
                    return true;
                }
		
    }
     public DanCu getSVbyMaSV(String MaSV,List<DanCu> list){
                DanCu sv = new DanCu(MaSV);
//		if (!list.contains(sv))
//			return null;
		sv = list.get(list.indexOf(sv));
		return sv;
     }
}
