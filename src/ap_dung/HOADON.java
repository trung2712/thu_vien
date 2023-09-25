package ap_dung;

import java.util.Scanner;

public class HOADON {
    int n;
    DICHVU[] dsDV;
    NHANVIEN nv = new NHANVIEN();
    CANHO ch = new CANHO();
    private String sohd;
    private String ngaylap;

    public HOADON() {
    }

    public void NhapHD() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay lap:");
        this.ngaylap = sc.nextLine();
        System.out.print("Nhap so hoa don:");
        this.sohd = sc.nextLine();

        System.out.print("Nhap thong tin can ho:");
        this.ch.Nhapch();
        System.out.print("Nhap thong tin nhan vien thu tien:");
        this.nv.Nhapnv();
        System.out.print("Nhap so luong dich vu:");
        this.n = sc.nextInt();
        this.dsDV = new DICHVU[this.n];

        for(int i = 0; i < this.n; ++i) {
            this.dsDV[i] = new DICHVU();
            this.dsDV[i].Nhapdv();
        }

    }

    public void XuatHD() {
        System.out.println("\n Thong tin can ho:");
        this.ch.Xuatch();
        System.out.println("\n Danh sach dich vu:");

        for(int i = 0; i < this.n; ++i) {
            this.dsDV[i].Xuatdv();
        }

        System.out.println("\n Nhan vien thu tien");
        this.nv.Xuatnv();
    }

    public void tongTienDV() {
        float s = 0.0F;

        for(int i = 0; i < this.n; ++i) {
            s += this.dsDV[i].thanhtien();
        }

        System.out.println("\n Tong tien dich vu:" + s);
    }

    public float tongTienDV_2() {
        float s = 0.0F;

        for(int i = 0; i < this.n; ++i) {
            s += this.dsDV[i].thanhtien();
        }

        return s;
    }

    public void tongSoluong() {
        int c = 0;

        for(int i = 0; i < this.n; ++i) {
            c += this.dsDV[i].getsoluong();
        }

        System.out.println("\n Tong so luong dich vu:" + c);
    }

    public int tongsoluong_2() {
        int c = 0;

        for(int i = 0; i < this.n; ++i) {
            c += this.dsDV[i].getsoluong();
        }

        return c;
    }
}
