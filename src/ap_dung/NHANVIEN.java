//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ap_dung;

import java.util.Scanner;

public class NHANVIEN extends NGUOI {
    private String manv;
    private String vitri;

    public NHANVIEN() {
    }

    public void Nhapnv() {
        super.Nhapnguoi();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien:");
        this.manv = sc.nextLine();
        System.out.print("Nhap vi tri cong viec:");
        this.vitri = sc.nextLine();
    }

    public void Xuatnv() {
        super.Xuatnguoi();
        System.out.printf("%10s", this.manv);
        System.out.printf("%20s", this.vitri);
    }
}
