package kethua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("nhap thong tin sinh vien");
        Scanner scanner=new Scanner(System.in);

        System.out.println("nhap ten sinh vien");
       String Ten = scanner.nextLine();
        System.out.println("nhap tuoi sinh vien");
       int Ngaysing = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap gioi ting sinh vien");
        String sex = scanner.nextLine();
        System.out.println("nhap dia chi sinh vien");
        String Diachi = scanner.nextLine();
        System.out.println("nhap ma Sinh Vien sinh vien");
        String MaSV = scanner.nextLine();
        System.out.println("nhap Diem TB sinh vien");
        float diemTB = Float.parseFloat(scanner.nextLine());
        System.out.println("nhap Email sinh vien");
        String Email = scanner.nextLine();
    }
}
