package bubble_sort_demo;

public class SelectSortDemo1 {
    public static void main(String[] args) {
        //选择排序
        //从0索引开始，跟后面的元素一一比较，
        //小弟元素放在前面，大的元素放在后面
        //第一次循环结束后，最小的数据已经确定，并在数组的最左侧
        //第二次循环从1索引开始

        //定义数组
        int[] arr = {5, 2, 3, 1, 4};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
