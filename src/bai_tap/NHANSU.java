package bai_tap;

import java.util.Scanner;

class NHANSU {
     private String hoTen,address,gioitinh;
     private int tuoi;
     public void nhapNS(){
         Scanner sc = new Scanner(System.in);
         System.out.println("nhập họ tên ");
         hoTen=sc.nextLine();
         System.out.println("nhập gioi tinh");
         address=sc.nextLine();
         System.out.println("nhập dia chi ");
         gioitinh=sc.nextLine();
         System.out.println("nhập tuoi ");
         tuoi=sc.nextInt();

     }
     public void xuatNS(){
         System.out.println(hoTen);
         System.out.println(gioitinh);
         System.out.println(address);
         System.out.println(tuoi);
     }
}
// end of class NhanSu
