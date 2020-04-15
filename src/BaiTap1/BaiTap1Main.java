/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author nga
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Thong tin nhan vien thu nhat");
        NhanVien nv1 = new NhanVien("Nguyen Thi Kim Nga", 21, "Phu Yen", 15000000, 240);
        System.out.println(nv1.getThongTin());
        System.out.println("Thong tin nhan vien thu 2");
        NhanVien nv2 = new NhanVien("Nguyen Le Hoang My", 23, "Nha Trang", 18000000, 195);
        System.out.println(nv2.getThongTin());
        System.out.println("Thong tin nhan vien thu 3");
        NhanVien nv3 = new NhanVien("Trinh Viet Long", 22, "Binh Dinh", 20000000, 98);
        System.out.println(nv3.getThongTin());
                
    }
    
}
