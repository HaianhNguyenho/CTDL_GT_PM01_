/*
*   created date: 9/13/2021
*   author: Haianh
*/
package vn.edu.giadinh.tuan02;

public class SinhVienTextDrive {

    public static void main(String[] args) {
        SinhVien sinhVien;//khai báo biến tên sinhVien tham chiếu đối tượng kiểu sinhVien
        sinhVien = new SinhVien();//Tạo đối tượng sinhVien tham chiếu đối tượng kiểu sinhVien
        sinhVien.mssv ="2008110020";
        sinhVien.tenSinhVien = "Nguyễn Hồ Hải Anh";
        sinhVien.queQuan = "TPHCM";
        sinhVien.tuoi = 19;

        sinhVien.inThongTinSV();

    }
    
}
