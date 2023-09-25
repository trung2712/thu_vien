package bai_tap;

import java.util.Scanner;

class HOCSINH extends NHANSU{
    private String lop;
     private float  diem_toan,diem_van;
    public void nhapHS(){
        super.nhapNS();
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap lop hoc");
        lop=sc.nextLine();
        System.out.println("nhap diem toan");
        diem_toan=sc.nextFloat();
        System.out.println("nhap diem van");
        diem_van=sc.nextFloat();
    }
    public float diem_trung_binh(){
        return (diem_toan + diem_van) / 2 ;
    }


    public void xuatHS() {
        super.xuatNS();
        System.out.println(lop);
        System.out.println(diem_toan);
        System.out.println(diem_van);
        System.out.println("điểm trung bình là" +diem_trung_binh());
    }

}
