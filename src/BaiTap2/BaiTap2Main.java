/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.NhanVien;

/**
 *
 * @author nga
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IQuanLy QLNV = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien("Le Thach Thao", 21, "Phu Yen", 12000000, 210);
        NhanVien nv2 = new NhanVien("Nguyen Hoang Long", 22, "Nha Trang", 17000000, 140);
        NhanVien nv3 = new NhanVien("Tran Minh", 23, "Binh Duong", 10000000, 80);
        NhanVien nv4 = new NhanVien("Trinh My Tram", 22, "Phu Yen", 13000000, 180);
        NhanVien nv5 = new NhanVien("Nguyen Thi Kim Van", 21, "Nha Trang", 17000000, 140);
        QLNV.them(nv1);
        QLNV.them(nv2);
        QLNV.them(nv3);
        QLNV.them(nv3);
        QLNV.them(nv4);
        QLNV.them(nv5);
        QLNV.inDS();
        
    }
    
}
