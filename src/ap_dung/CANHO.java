//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ap_dung;

import java.util.Scanner;

public class  CANHO extends NGUOI {
    private String mach;
    private int namvaoo;

    public CANHO() {
    }

    public void Nhapch() {
        super.Nhapnguoi();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma can ho:");
        this.mach = sc.nextLine();
        System.out.print("Nhap nam vao o:");
        this.namvaoo = sc.nextInt();
    }

    public void Xuatch() {
        super.Xuatnguoi();
        System.out.printf("%10s", this.mach);
        System.out.printf("%6d", this.namvaoo);
    }
}
