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
public abstract class ChuyenXe {
    public String mschuyen;
    public String hotentaixe;
    public String soxe;
    public double doanhthu;
    
    public ChuyenXe(String mschuyen, String hotentaixe, String soxe, double doanhthu) {
        this.mschuyen = mschuyen;
        this.hotentaixe = hotentaixe;
        this.soxe = soxe;
        this.doanhthu = doanhthu;
    }
     public void xuat() {
         System.out.println("Ma so chuyen xe: " + this.mschuyen
         + "\nHo ten tai xe: " + this.hotentaixe + "\nSo xe: "
         + this.soxe + "\nDoanh thu: " + this.doanhthu);
    }
}
