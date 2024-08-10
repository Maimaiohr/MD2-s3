import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        //b1:khoi tao scanner
        Scanner scanner = new Scanner(System.in);
        //khai bao row col
        System.out.println("Mời bạn nhập vào số hang ");
        System.out.println("Mời bạn nhập vào số cot ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        //b3: khai abo mang
        int[][] a = new int[row][col];
        //b4
        int choice;
        do {
            System.out.println("=====MENU=====");
            System.out.println("1.Nhap phan tu cua array ");
            System.out.println("2. Hien thi phan tu cua array ");
            System.out.println("3. Tinh tong cac phan tu cua array ");
            System.out.println("4. In ra cac gia tri chan ");
            System.out.println("5. In ra dang ma tran ");
            System.out.println("6. Tong duong cheo chinh ");
            System.out.println("7. In ra duong bien ");
            System.out.println("8. Thoat");
            System.out.println("Mời bạn chọn 1 - 8");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < a.length; i++) {
                        for (int j = 0; j < a[i].length; j++) {
                            System.out.printf("arr[%d][%d] = ", i, j);
                            a[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    // hiển thị các phần tử mảng 2 chiều
                    for (int i = 0; i < a.length; i++) {
                        for (int j = 0; j < a[i].length; j++) {
                            System.out.printf("%d \n", a[i][j]);
                        }
                    }
                    break;
                case 3:
                    int total = 0;
                    for (int i = 0; i < a.length; i++) {
                        for (int j = 0; j < a[i].length; j++) {
                            total += a[i][j];
                        }
                    }
                    System.out.println("Tong cac phan tu la:" + total);
                    break;
                case 4:
                    for (int i = 0; i < a.length; i++) {
                        for (int j = 0; j < a[i].length; j++) {
                            if (a[i][j] % 2 == 0) {
                                System.out.println("Cac phan tu chan la:" + a[i][j]);
                            }
                        }
                    }
                    break;
                case 5:
                    // in dưới dạng ma trận
                    for (int i = 0; i < a.length; i++) {
                        for (int j = 0; j < a[i].length; j++) {
                            System.out.printf("\t %d", a[i][j]);
                        }
                        System.out.println(" ");
                    }break;
                case 6:
                    //tong duong cheo chinh
                    int t = 0;
                    for (int i = 0; i < a.length; i++) {
                        for (int j = 0; j < a[i].length; j++) {
                            if (i==j) {
                                System.out.println(a[i][j]);
                                t += a[i][j];
                            }
                        }
                    }
                    System.out.println("tong duong cheo chinh: "+t);
                    break;
                case 7:
                    //in duong bien
                    for (int i = 0; i < a.length; i++) {
                        for (int j = 0; j < a[i].length; j++) {
                            if(i == 0 || j == 0|| i == a.length - 1|| j == a[i].length - 1) {
                                System.out.printf("\t %d",a[i][j]);
                            } else {
                                System.out.printf("\t %s"," ");
                            }
                        }
                        System.out.println(" ");
                    }
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Sai lựa chọn vui lòng chọn lại");
                }


            } while (true);
        }

    }