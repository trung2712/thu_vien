package ap_dung;
import java.util.ArrayList;
import java.util.Scanner;

public class danh_sach_hoa_don {





        ArrayList<HOADON> lstHD;

        public void nhapdshd(){
            Scanner sc = new Scanner(System.in);
            int sohd;
            sohd = sc.nextInt();
            lstHD = new ArrayList<HOADON>();
            for(int i=0;i<sohd;i++){
                HOADON x = new HOADON();
                x.NhapHD();
                lstHD.add(x);
            }
        }
        public void xuatdshd(){
            for(HOADON hd: lstHD)
                hd.XuatHD();

        }


    public void tongtiencachoado()
    {
        float a= 0 ;
        for (HOADON hd : lstHD)
            a = a + hd.tongTienDV_2();
        System.out.println("\n tổng tiền của  các hóa đơn " + a);
    }
    }

