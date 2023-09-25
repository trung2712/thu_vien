//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ap_dung;

import java.util.Scanner;

public class NGUOI {
    private String hoten;
    private String email;
    private String sdt;

    public NGUOI() {
    }

    public void Nhapnguoi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ho ten:");
        this.hoten = sc.nextLine();
        System.out.print("Nhap so dien thoai:");
        this.email = sc.nextLine();
        System.out.print("Nhap email:");
        this.sdt = sc.nextLine();
    }

    public void Xuatnguoi() {
        System.out.printf("\n%25s", this.hoten);
        System.out.printf("%10s", this.sdt);
        System.out.printf("%25s", this.email);
    }
}
