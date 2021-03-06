/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Buoi04;

/**
 *
 * @author ly.phong
 */
public class GiangVienThinhGiang extends GiangVien{
    
    private String coQuan;
    private String loaiGV = "Giang Vien Thinh Giang";
    public GiangVienThinhGiang(String ten, String email, String diaChi, String dienThoai, String coQuan) {
        super(ten, email, diaChi, dienThoai);
        this.coQuan = coQuan;
        this.setLuongTrenGio(200.000);
    }

    public String getCoQuan() {
        return coQuan;
    }

    public void setCoQuan(String coQuan) {
        this.coQuan = coQuan;
    }
    
    @Override
    public double tinhLuong() {
        double luong = this.getLuongTrenGio() * this.getSoGioDayThucTe();
        return luong;
    }
    
    @Override
    public String getLoaiGV() {
        return this.loaiGV;
    }
    
}
