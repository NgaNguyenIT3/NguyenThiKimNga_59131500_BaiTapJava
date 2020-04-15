/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap4;

import java.util.ArrayList;

/**
 *
 * @author nga
 */
public class QuanLyChuyenXe {
     public ArrayList<ChuyenXe> DSCX = new ArrayList<>();
    
    public void ThemCX(ChuyenXe x) {
        DSCX.add(x);
    }
    public void XuatCX() {
        for(int i=0; i < DSCX.size(); i++)
            DSCX.get(i).xuat();
    }
    
    public double TongDoanhThuNoiThanh() {
        double tong1 = 0;
        for(ChuyenXe y : DSCX) {
            if(y instanceof XeNoiThanh)
                tong1 += y.doanhthu;
        }
        return tong1;
    }
    public double TongDoanhThuNgoaiThanh() {
        double tong2 = 0;
        for(ChuyenXe z : DSCX) {
            if(z instanceof XeNgoaiThanh)
                tong2 += z.doanhthu;
        }
        return tong2;
    }
    public double TongDoanhThuCacChuyenXe() {
        double tong = 0;
        for(ChuyenXe t : DSCX)
            tong += t.doanhthu;
        return tong;
    }
}
