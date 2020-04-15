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
public class NhanVien {
    String ten;
    int tuoi;
    String diachi;
    double tienluong;
    int sgiolam;
    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diachi, double tienluong, int sgiolam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.tienluong = tienluong;
        this.sgiolam = sgiolam;
    }
 
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public int getSgiolam() {
        return sgiolam;
    }

    public void setSgiolam(int tonggiolam) {
        this.sgiolam = tonggiolam;
    }
      public String getThongTin()
    {
        return "Ten: "+ ten +"\n"
                +"Tuoi: " + tuoi+"\n"
                +"Dia chi: "+ diachi +"\n"
                +"Tien luong: "+ tienluong +"\n"
                +"Tong gio lam: "+ sgiolam +"\n"
                +"Tinh thuong: " +tinhThuong();  }
      
     public double tinhThuong()
    {
        if (sgiolam>=200)
        {
            return tienluong *0.2;
        } 
        else 
        {
            if (sgiolam>=100) 
            {
                return tienluong *0.1;
            } else
            {
                return 0;
            }
        }
    }
}
