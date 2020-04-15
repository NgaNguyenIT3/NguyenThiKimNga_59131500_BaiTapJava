/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author nga
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienPoly svPoly = new SinhVienBiz("Le Binh","Kinh doanh thuong mai",6,6);
        SinhVienIT svIT = new SinhVienIT("Nguyen Thi Kim Tuyen","CNTT",6,8,10);
        SinhVienBiz svBiz = new SinhVienBiz("Trinh Tam","Marketing",9,9);
        
        svPoly.Xuat();
        System.out.println("Diem: " + svPoly.getDiem() 
                + "\nHoc luc: " + svPoly.getHocLuc() + "\n");
        svIT.Xuat();
        System.out.println("Diem: " + svIT.getDiem() 
                + "\nHoc luc: " + svIT.getHocLuc() + "\n");
        svBiz.Xuat();
        System.out.println("Diem: " + svBiz.getDiem() 
                + "\nHoc luc: " + svBiz.getHocLuc() );
    }
    
}
