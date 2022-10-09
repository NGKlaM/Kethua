package kethua;

public class Student extends Person{
private String MaSV;
private float DiemTB;
private String Email;

    public Student(String Ten, int Ngaysing, String sex, String Diachi, String maSV, float diemTB, String email) {
        super(Ten, Ngaysing, sex, Diachi);
        MaSV = maSV;
        DiemTB = diemTB;
        Email = email;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public float getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(float diemTB) {
        DiemTB = diemTB;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    //    public Student nhapthongtin(String Ten, int Ngaysing, String sex, String Diachi,String MaSV,float DiemTB,String Email) {
//        return  new Student(Ten, Ngaysing, sex, Diachi,MaSV,DiemTB,Email);
//    }
    public void getInfo(){
        super.getInfo();
        System.out.println("ma sv:"+this.MaSV);
        System.out.println("Diêm trung binh:"+this.DiemTB);
        System.out.println("Email:"+this.Email);
    }
}
