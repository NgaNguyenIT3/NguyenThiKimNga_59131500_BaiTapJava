/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap4;

/**
 *
 * @author nga
 */
public class BaiTap4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyChuyenXe QLCX = new QuanLyChuyenXe();
        ChuyenXe xnt1 = new XeNoiThanh("C01","Tran An","XNT01",8000000,01,70);
        ChuyenXe xnt2 = new XeNoiThanh("C02","Nguyen Vinh","XNT02",10000000,02,90);
        ChuyenXe xnt3 = new XeNoiThanh("C03","Ly Trong","XNT03",6000000,03,50);
        ChuyenXe xngt1 = new XeNgoaiThanh("C04","Le Anh","XNGT01",18000000,"HN",3);
        ChuyenXe xngt2 = new XeNgoaiThanh("C05","Nguyen Hien","XNGT02",12000000,"DN",1);
        ChuyenXe xngt3 = new XeNgoaiThanh("C06","Trinh Quang","XNGT03",15000000,"SG",2);
        QLCX.ThemCX(xnt1);
        QLCX.ThemCX(xnt2);
        QLCX.ThemCX(xnt3);
        QLCX.ThemCX(xngt1);
        QLCX.ThemCX(xngt2);
        QLCX.ThemCX(xngt3);
        QLCX.XuatCX();
        System.out.println("\nTong doanh thu chuyen xe noi thanh: " + QLCX.TongDoanhThuNoiThanh()
        + "\nTong doanh thu chuyen xe ngoai thanh: " + QLCX.TongDoanhThuNgoaiThanh()
        + "\nTong doanh thu cac chuyen xe: " + QLCX.TongDoanhThuCacChuyenXe());
    }
}
