package bai_tap;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        HOCSINH dshs[];
        GIAOVIEN dsgv[];
        int soHS , soGV;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hoc sinh ");
        soHS=sc.nextInt();
        System.out.println("nhap so giao vien ");
        soGV=sc.nextInt();
        dshs = new HOCSINH[soHS];
        for (int i=0;i<soHS;i++)
        {
            dshs[i]= new HOCSINH();
            dshs[i].nhapHS();
        }
        dsgv = new GIAOVIEN[soGV];
        for (int i=0;i<soGV;i++)
        {
            dsgv[i]= new GIAOVIEN();
            dsgv[i].nhapGV();
        }
        {
            System.out.println("DS hoc sinh");
        for (int i =0 ;i<soHS;i++)
            dshs[i].xuatHS();
        }

        {
            System.out.println("DS giao vien");
        for (int i =0 ;i<soGV;i++)
            dsgv[i].xuatGV();
        }
    }
}
