package Services;

import Model.DanhGia;
import Model.DanCu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class SINHVIENDOC {
    public List<DanhGia> list;
    public void ghifile(List<DanhGia> list){
    try {
                        FileWriter fw = new FileWriter("src/FileData/DanhGia.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        for(DanhGia sv:list){
                            bw.write(sv.toString());
                            bw.newLine();
                        }
                        bw.close();
                        fw.close();
                } catch (Exception e) {
                        System.out.println("Loi ghi file " + e.getMessage());
                }
}
    public List<DanCu> docfile(){
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
    public List<DanhGia> docfiledg(){
            try {
            List<DanhGia> list = new ArrayList<>();
            FileReader fr=new FileReader("src/FileData/DanhGia.txt");
            BufferedReader br=new BufferedReader(fr);
            String line="";
            while(true){
                line=br.readLine();
                if(line==null){
                    break;
                }
                String txt[]=line.split(",");System.out.println(txt[3]);
                list.add(new DanhGia(txt[0],txt[1] , Integer.parseInt(txt[2]), txt[3]));
            }
                System.out.println(list);
            return list;
            
            
        } catch (Exception e) {
        }
        return null;
    }
}
