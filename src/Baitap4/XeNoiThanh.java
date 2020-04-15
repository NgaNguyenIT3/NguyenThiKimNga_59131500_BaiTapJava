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
public class XeNoiThanh extends ChuyenXe {
    public int sotuyen;
    public int sokm;
    
    public XeNoiThanh(String mschuyen, String hotentaixe, String soxe, double doanhthu, int sotuyen, int sokm) {
        super(mschuyen, hotentaixe, soxe, doanhthu);
        this.sotuyen = sotuyen;
        this.sokm = sokm;
    }

    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("So tuyen xe: " + this.sotuyen 
        + "\nSo km di duoc: " + this.sokm + "\n");
    }
}
