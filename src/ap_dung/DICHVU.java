package ap_dung;




import java.util.Scanner;

    public class DICHVU {
        private String madv;
        private String tendv;
        private int soluong;
        private float donGia;

        public DICHVU() {
        }

        public void Nhapdv() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap ma dich vu:");
            this.madv = sc.nextLine();
            System.out.print("Nhap ten dich vu:");
            this.tendv = sc.nextLine();
            System.out.print("Nhap so luong:");
            this.soluong = sc.nextInt();
            System.out.print("Nhap don gia:");
            this.donGia = sc.nextFloat();
        }

        public void Xuatdv() {
            System.out.printf("\n%10s", this.madv);
            System.out.printf("%25s", this.tendv);
            System.out.printf("%5d", this.soluong);
            System.out.printf("%12.1f", this.donGia);
            System.out.printf("%15.1f", this.thanhtien());
        }

        public float thanhtien() {
            return (float)this.soluong * this.donGia;
        }

        public int getsoluong() {
            return this.soluong;
        }
    }


