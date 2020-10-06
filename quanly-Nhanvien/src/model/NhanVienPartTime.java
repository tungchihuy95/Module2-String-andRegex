package model;

import util.Configs;

public class NhanVienPartTime extends NhanVien {
    private static int gioLamViec;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien part-time!";
    }

    public void tinhluong(){
        luong = gioLamViec * Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO;
    }
}
