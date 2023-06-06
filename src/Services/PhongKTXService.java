package Service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import Model.PhongKTX;
import Model.SinhVienKTX;

/**
 * KyTucXaService
 */
public class PhongKTXService {
    static final String FILE_PATH = "src/FileData/KyTucXa.txt";
    
    public static List<PhongKTX> getListPhongFromFile() throws FileNotFoundException {
        List<PhongKTX> dsPhongKTX = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_PATH), "UTF-8"));

            int soPhong = Integer.parseInt(reader.readLine());

            for (int i = 0; i < soPhong; i++) {
                PhongKTX phongKTX = new PhongKTX();
                String [] infor = reader.readLine().split(", ");

                phongKTX.setTenPhong(infor[0]);
                phongKTX.setMaPhong(infor[1]);
                phongKTX.setLoaiPhong(Integer.parseInt(infor[2]));
                phongKTX.setSoSVToiDa(Integer.parseInt(infor[3]));
                phongKTX.setSoSVHienTai(Integer.parseInt(infor[4]));
                phongKTX.setTinhTrang(infor[5]);
                phongKTX.setTang(Integer.parseInt(infor[6]));
                
                List<SinhVienKTX> dsSV = new ArrayList<>();

                for (int j = 0; j < phongKTX.getSoSVHienTai(); j++) {
                    String[] infoSV = reader.readLine().split(", ");

                    SinhVienKTX sv = new SinhVienKTX(infoSV[0], infoSV[1], infoSV[2], infoSV[3], infoSV[4], infoSV[5]);

                    dsSV.add(sv);
                }

                phongKTX.setDsSV(dsSV);

                dsPhongKTX.add(phongKTX);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return dsPhongKTX;
    }

    public static PhongKTX getPhongKTXById(List<PhongKTX> ds,String id) {
        for (PhongKTX phongKTX : ds) {
            if(phongKTX.getMaPhong().equals(id)) 
                return phongKTX;
        }
        return null;
    }

    public static void updateFile(PhongKTX phongMoi) throws IOException {
        PhongKTX phongCu = getPhongKTXById(getListPhongFromFile(), phongMoi.getMaPhong());
        if(phongMoi.toString().equals(phongCu.toString())) return;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_PATH), "UTF-8"));

            StringBuilder fileContent = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
            reader.close();

            int startIndex = fileContent.indexOf(phongCu.toString());
            
            if(startIndex != -1) {
                int endIndex = startIndex + phongCu.toString().length();
                
                fileContent.replace(startIndex, endIndex, phongMoi.toString());
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(PhongKTXService.FILE_PATH));
            writer.write(fileContent.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean daThuocKTX(String msv) {
        try {
            List<PhongKTX> dsPhong = getListPhongFromFile();
            List<SinhVienKTX> dsSV = new ArrayList<>();
            for (PhongKTX phongKTX : dsPhong) {
                for (SinhVienKTX sv : phongKTX.getDsSV()) {
                    dsSV.add(sv);
                }
            }
            
            for (SinhVienKTX sv : dsSV) {
                if(sv.getMaSV().equals(msv)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<PhongKTX> phongs = getListPhongFromFile();

        try {
            updateFile(phongs.get(3));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}