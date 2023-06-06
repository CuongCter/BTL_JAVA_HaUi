/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Model.LichThi;
import Model.SinhVien;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Đặng Huy
 */
public class LichThiService {

    public static void writeFile(String fileName, List list) throws Exception {
        try (BufferedWriter write = new BufferedWriter(new FileWriter(fileName))) {
            for (Object obj : list) {
                write.write(obj.toString());
                write.newLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    public static List<LichThi> lichThiFromFile(String fileName) throws Exception {
        List<LichThi> list = new ArrayList<>();

        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = read.readLine()) != null) {
                LichThi lichthi = new LichThi();
                String[] data = line.split(",");
                lichthi.setTenKyThi(data[0].trim());
                lichthi.setMonThi(data[1].trim());
                lichthi.setNgayThi(data[2].trim());
                lichthi.setCaThi(data[3].trim());
                lichthi.setPhongThi(data[4].trim());
                lichthi.setDiemThi(data[5].trim());
                lichthi.setSoSV(Integer.parseInt(data[6].trim()));
                List<String> listSV = new ArrayList<>();
                for (int i = 0; i < lichthi.getSoSV(); i++) {
                    String dataSV = read.readLine();
                    listSV.add(dataSV);
                }
                lichthi.setListSV(listSV);
                list.add(lichthi);
                read.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        return list;
    }

    public static List<SinhVien> SVFromFile(String fileName) throws Exception {
        List<SinhVien> listSV = new ArrayList<>();
        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = read.readLine()) != null) {
                SinhVien sv = new SinhVien();
                String[] data = line.split(",");
                sv.setMaSV(data[0]);
                sv.setTenSV(data[1]);
                sv.setKhoa(data[2]);
                sv.setNgaySinh(data[3]);
                sv.setGioiTinh(data[4]);
                listSV.add(sv);
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        return listSV;
    }

    public static SinhVien getListSVById(List<SinhVien> list, String maSV) {
        for (SinhVien sv : list) {
            if (sv.getMaSV().equalsIgnoreCase(maSV)) {
                return sv;
            }
        }
        return null;
    }
}
