public class demo1 {
    public static void main(String[] args) {
        //khai bao mang 1 chieu
        int[] array = new int[5];
        //kai bao mang kieu int gan gtri cho 5 ptu
        int[] array01 = {3, 5, 6, 7,9};

        //truy cap phan tu mang

        //th1: truy xuat de lay gia tri thong qua chir mucj
        System.out.println("gtri phan tu thu 3 cua array01:"+array01[2]);
        System.out.println("gtri phan tu thu 1 cua array01:"+array01[0]);

        //th2: truy suat de gans gia tri qua chi muc
        array[0]=8;
        array[1]=10;
        System.out.println("phan tu 1 cua array:"+ array[0]);
        //
    }
}
