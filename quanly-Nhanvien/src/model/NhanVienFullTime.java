package model;

import util.Configs;

public class NhanVienFullTime extends NhanVien {
    private int ngayLamThem;
    private int loaiChucVu;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(String ten) {
        super(ten);
        this.loaiChucVu = Configs.NHAN_VIEN_LINH;
    }

    public NhanVienFullTime(String ten, int ngayLamThem) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = Configs.NHAN_VIEN_LINH;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien(){
        if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
            return "Linh full-time";
        }
        else {
            return "Sep full-time";
        }
    }

    public void tinhluong(){
        if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        }
        else {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        }
    }
}
