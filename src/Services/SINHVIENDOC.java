package Services;

import Model.DANHGIASINHVIEN;
import Model.SinhVien;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class SINHVIENDOC {
    public List<DANHGIASINHVIEN> list;
    public void ghifile(List<DANHGIASINHVIEN> list){
    try {
                        FileWriter fw = new FileWriter("src/FileData/DanhGiaSinhVien.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        for(DANHGIASINHVIEN sv:list){
                            bw.write(sv.toString());
                            bw.newLine();
                        }
                        bw.close();
                        fw.close();
                } catch (Exception e) {
                        System.out.println("Loi ghi file " + e.getMessage());
                }
}
    public List<SinhVien> docfile(){
            try {
            List<SinhVien> list=new ArrayList<>();
            FileReader fr=new FileReader("src/FileData/SinhVien.txt");
            BufferedReader br=new BufferedReader(fr);
            String line="";
            while(true){
                line=br.readLine();
                if(line==null){
                    break;
                }
                String txt[]=line.split(",");
                list.add(new SinhVien(txt[0],txt[1] , txt[2], txt[3], txt[4]));
            }
                
            return list;
            
        } catch (Exception e) {
        }
        return null;
    }
    public List<DANHGIASINHVIEN> docfiledg(){
            try {
            List<DANHGIASINHVIEN> list = new ArrayList<>();
            FileReader fr=new FileReader("src/FileData/DanhGiaSinhVien.txt");
            BufferedReader br=new BufferedReader(fr);
            String line="";
            while(true){
                line=br.readLine();
                if(line==null){
                    break;
                }
                String txt[]=line.split(",");System.out.println(txt[3]);
                list.add(new DANHGIASINHVIEN(txt[0],txt[1] , Integer.parseInt(txt[2]), txt[3]));
            }
                System.out.println(list);
            return list;
            
            
        } catch (Exception e) {
        }
        return null;
    }
}
