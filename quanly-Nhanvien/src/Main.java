import model.NhanVien;
import model.NhanVienFullTime;
import model.NhanVienPartTime;
import util.Configs;

public class Main {
    public static void main(String[] args) {
        NhanVienFullTime nhanVienFullTimesep = new NhanVienFullTime("Nguyen Quoc Tung");
        nhanVienFullTimesep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime nhanVienFullTimelinh1 = new NhanVienFullTime("Tran Van A");
        NhanVienFullTime nhanVienFullTimelinh2 = new NhanVienFullTime("Pham Van B", 5);

        NhanVienPartTime nhanVienPartTime1 = new NhanVienPartTime("Cao Thi C", 6);

        nhanVienFullTimesep.tinhluong();
        nhanVienFullTimelinh1.tinhluong();
        nhanVienFullTimelinh2.tinhluong();
        nhanVienPartTime1.tinhluong();

        nhanVienFullTimesep.xuatThongTin();
        System.out.println("-----");
        nhanVienFullTimelinh1.xuatThongTin();
        System.out.println("-----");
        nhanVienFullTimelinh2.xuatThongTin();
        System.out.println("-----");
        nhanVienPartTime1.xuatThongTin();


    }
}
