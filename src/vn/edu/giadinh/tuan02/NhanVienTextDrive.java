package vn.edu.giadinh.tuan02;

public class NhanVienTextDrive {
    public static void main(String[] args) {
        NhanVien nhanVien;
        nhanVien = new NhanVien();
        nhanVien.tenNhanVien = "Nguyễn Hồ Hải Anh";
        nhanVien.luong = 1000000;
        nhanVien.diaChi = "90/6 Yên Thế, P.2,Q.Tân Bình";
        nhanVien.boPhanLamViec = "Thiết kế";
        nhanVien.ngaySinh = "9";

        nhanVien.inNhanVien();
    }
    
}
