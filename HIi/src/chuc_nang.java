import java.util.Scanner;

public class chuc_nang {
    private int chonmon;
     private int tinhtien;
    private static int tien;
    private int thanhtien;

private int x   ;
private boolean c;
    public chuc_nang(){};

    public static Scanner scanner = new Scanner(System.in);
    public static   void menu(){
        System.out.println("Bạn muốn ăn gì ");
        System.out.println("1. Bún chả - 30k");
        System.out.println("2. Bún bò - 30k");
        System.out.println("3. Cơm -25k");
    };
        public static int ChonMon(chuc_nang a ){
            int chonmon =a.x;
            System.out.println("Chọn món:");
            chonmon= scanner.nextInt();
            while (chonmon != 1 && chonmon !=2 && chonmon !=3 ){
                System.out.println("Không có món này");
                break;
            };
            switch (chonmon){
                case 1 :
                    System.out.println("Bạn chọn món bún chả");
                    break;
                case 2:
                    System.out.println("Bạn chọn món bún bò");
            break;
                case 3: System.out.println("Bạn chọn Cơm");
                break;
                default:System.out.println("không có món này");
            };
            return chonmon ;
    }
    public static int tinhtien(chuc_nang d ){
            int tien = d.x;
            switch (tien){
                case 1 :
                    d.tien = d. tien +30;
                    break;
                case 2 :
                    d.tien = d.tien +30;
                    break;
                case 3 :
                    d.tien = d.tien + 25;
                    break;
            }
        return d.tien;
    }

    public static void main(String[] args) {
        chuc_nang b = new chuc_nang();
        b.menu();
       do {
           b.x=  ChonMon(b) ;
           b.thanhtien = tinhtien(b); //tinhtien(b) = b.x = ChonMon(b)
            System.out.println("Bạn muốn tiếp tục không 1-yes , 2 -no");

            int a = scanner.nextInt();
            if(a==1 ){
                b.c = true;

            } else {b.c = false;
                System.out.println(" Số tiền của bạn là : "+ b.thanhtien +"k");
            };

        } while (b.c == true

       );

    }
}
