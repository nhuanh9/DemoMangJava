package ChuaBai;

import java.util.Scanner;

public class BaiTapMang {
    public static void main(String[] args) {
        // Nhập và số lượng, nhập vào số phần tử
        Scanner mayQuet = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử: ");
        int soLuong = mayQuet.nextInt();
        int[] arr = new int[soLuong];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            arr[i] = mayQuet.nextInt();
        }

        inMang(arr);
        // Tính tổng chẵn
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("\nTổng là: " + sum);
        //
        System.out.println("Nhập vào số cần tìm: ");
        int soCanTim = mayQuet.nextInt();
        System.out.println("Vị trí trong mảng là: "+timViTriPhanTu(arr, soCanTim));
        System.out.println("Nhập vào số cần xoá: ");
        int soCanXoa = mayQuet.nextInt();
        int viTriCanXoa = timViTriPhanTu(arr, soCanXoa);
        // Xoá:
//        for (int i=viTriCanXoa; i<arr.length-1; i++) {
//            arr[i] = arr[i+1];
//        }
//        arr[arr.length-1] = -999;
//        inMang(arr);
//        Xoá real:
        int[] newArr = new int[arr.length-1];
        for (int i=0; i<viTriCanXoa; i++) {
            newArr[i] = arr[i];
        }
        for (int i=viTriCanXoa; i<arr.length-1; i++) {
            newArr[i] = arr[i+1];
        }
        arr = newArr;
        inMang(arr);
    }

    static int timViTriPhanTu(int[] mang, int soCanTim) {
        int viTri = -1;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == soCanTim) {
                viTri = i;
            }
        }
        return viTri;
    }

    static void inMang(int[] mang) {
        System.out.println("Mảng là: ");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i]+"\t");
        }
    }
}
