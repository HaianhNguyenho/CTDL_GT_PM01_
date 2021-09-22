package vn.edu.giadinh.tuan02;

import java.util.Date;

public class SinhVien {


        //1. thuộc tính

        String mssv;
        String tenSinhVien;
        int tuoi;
        String queQuan;
        Date ngaySinh;//kiểu ngày tháng


        //2. phương thức - method - function
        //<Kiểu trả về> <tên hàm> <(danh sách tham số)>
        void inThongTinSV(){
            System.out.println("Mã số sinh viên: " + mssv);
            System.out.println("Tên sinh viên: " + tenSinhVien);
            System.out.println("Tuổi sinh viên là: "+ tuoi);
            System.out.println("Quê quán sinh viên:" +queQuan);

        


    }
    
}
