package kethua;

public class Person {
    public String Ten;
    public int Ngaysing;
    public String sex;
    public String Diachi;
    public Person(String Ten,int Ngaysing,String sex,String Diachi){
        this.Ten = Ten;
        this.Ngaysing = Ngaysing;
        this.sex = sex;
        this.Diachi = Diachi;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getNgaysing() {
        return Ngaysing;
    }

    public void setNgaysing(int ngaysing) {
        Ngaysing = ngaysing;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }
    public void getInfo() {
        System.out.println("Ten:"+this.Ten);
        System.out.println("Ngay Sinh:"+this.Ngaysing);
        System.out.println("Sex:"+this.sex);
        System.out.println("Dia chi:"+this.Diachi);
    }
}
