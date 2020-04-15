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
public class XeNgoaiThanh extends ChuyenXe {
    public String noiden;
    public int songaydiduoc;
    
    public XeNgoaiThanh(String mschuyen, String hotentaixe, String soxe, double doanhthu, String noiden, int songaydiduoc) {
        super(mschuyen, hotentaixe, soxe, doanhthu);
        this.noiden = noiden;
        this.songaydiduoc = songaydiduoc;
    }

    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("Noi den: " + this.noiden 
        + "\nSo Ngay Di Duoc: " + this.songaydiduoc + "\n");
    } 
}
