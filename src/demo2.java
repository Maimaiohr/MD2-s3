import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số phần tử của mảng ");
        int n = scanner.nextInt();
        // khai báo mang có n phần tử
        int[] array = new int[n];
        int choice;
        do {
            System.out.println("=====MENU=====");
            System.out.println("1.Nhap phan tu cua array ");
            System.out.println("2. Hien thi phan tu cua array ");
            System.out.println("3. Tinh tong cac phan tu cua array ");
            System.out.println("4. In ra cac gia tri chan ");
            System.out.println("5. Thoat");
            System.out.println("Mời bạn chọn 1 - 5");
            choice = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập vào phần tử thứ "+(i+1));
                array[i] = scanner.nextInt();
            }
            switch (choice){
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập vào phần tử thứ "+(i+1));
                        array[i] = scanner.nextInt();
                    }break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        System.out.printf("Phần tử thứ %d = %d \n",i+1,array[i]);
                    }break;
                case 3:
                    int total =0;
                    for (int i = 0; i <n ; i++) {
                        total +=array[i];
                    }
                    System.out.println("Tong cac phan tu la:"+total);
                    break;
                case 4:
                    for (int i = 0; i < n; i++) {
                        if (array[i]%2==0){
                            System.out.println("Cac phan tu chan la:"+ array[i]);
                        }
                    }break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Sai lựa chọn vui lòng chọn lại");
            }
        } while (true);
    }
}


