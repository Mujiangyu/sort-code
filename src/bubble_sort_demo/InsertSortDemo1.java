package bubble_sort_demo;

public class InsertSortDemo1 {
    public static void main(String[] args) {
        /*
         * 插入排序：
         * 将0索引的元素到N索引的元素看作是有序的，把N+1到最后一个元素看作是无序的
         * 遍历无序的数据，将遍历到的元素插入到有序序列当中适当的位置，如遇到相同的数据，插在后面
         * N的范围：0~最大索引
         * */

        //定义数组；
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 2, 46, 4, 19, 50, 48};

        //找到无序的数据的开始索引
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }
        //从startIndex开始到最后一个元素，依次得到无序数据中的每一个元素
        for (int i = startIndex; i < arr.length; i++) {
            //记录当前要插入数据的索引
            int j = i;

            while (j > 0 && arr[j] < arr[j - 1]) {
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j -1]= tmp;
                j--;
            }
        }
        printArr(arr);
    }
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
