package bubble_sort_demo;

public class BubbleSortDemo1 {
    public static void main(String[] args) {
        //冒泡排序
        //定义数组
        int[] arr = {2, 4, 5, 3, 1};

        //第一轮，结束之后，最大值在数组的最右侧
        //外层循环表示执行的趟数
        for (int i = 0; i < arr.length - 1 ;i++) {
            //内层循环表示排序的次数
            // -i 是为了提高效率
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        printArr(arr);

        //第二轮，次大的数字出现在数组的右侧，并在最大值的左侧
//        for (int j = 0; j < arr.length - 1 - 1; j++) {
//            if (arr[j] > arr[j + 1]) {
//                int tmp = arr[j];
//                arr[j] = arr[j + 1];
//                arr[j + 1] = tmp;
//            }
//        }
//        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
