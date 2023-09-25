package khai_niem;

//modifier  : xác định thuô tính của lớp được kế thừa gôm : public , final
//class_new : là tên lớp mới được định nghĩa (lớp dẫn xuất )
// class_old : là tên lớp được kế thừa , là lớp đã có (lớp cơ sở )
//[modifier] class class_new extends class_old
//{
// mô tả dữ liệu mới của lớp mới
// mô tả và định nghĩa phương thức của lớp mới
//}
// ví dụ
public class lop_ke_thua {
    class a {
        int x,y ;
        public a() {x=y=5 ;}
        public int suma() {return  x+y; }
    }
    class b extends a{
        int z ;
        public b(){z=7;}

    }

}
