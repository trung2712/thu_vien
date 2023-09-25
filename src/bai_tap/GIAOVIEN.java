package bai_tap;

import java.util.Scanner;

class GIAOVIEN extends NHANSU{
    private String mon_day;
    private float  he_so_luong;
    private float lcb;
    public void nhapGV(){
        super.nhapNS();
        Scanner sc= new Scanner(System.in);
        System.out.println("mon day ");
        mon_day=sc.nextLine();
        System.out.println("he so luong");
        he_so_luong=sc.nextFloat();
        System.out.println(" so luong");
        lcb=sc.nextFloat();
    }
    public float luong(){
        return (he_so_luong*lcb);
    }


    public void xuatGV() {
        super.xuatNS();
        System.out.println(mon_day);
        System.out.println(he_so_luong);
        System.out.println("lương của nhân viên là " + luong());
    }


}
