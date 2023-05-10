package bubble_sort_demo;

public class QuickSortDemo1 {
    public static void main(String[] args) {
        /*
         * 快速排序：
         * 第一轮，以0索引为基准数，确定基准数在数组中正确的位置。
         * 比基准数小的数字都在左边，比基准数大数字都在右边
         * 后面依次类推
         * */

        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quicksort(arr,0,arr.length-1);
        for (int i = 0 ; i<arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void quicksort(int[]arr, int i,int j){
        //定义两个变量记录要查找的范围
        int start = i;
        int end = j;
        if(start>end){
            return;
        }
        //记录基准数
        int baseNumber = arr[i];
        while (start!=end){
            //利用end从后往前找比基准数小的数字
            while (true){
                if(end <= start || arr[end]<baseNumber){
                    break;
                }
                end--;
            }
            //利用start从前往后找比基准数大的数字
            while (true){
                if(end <= start || arr[start]>baseNumber){
                    break;
                }
                start++;
            }
            //把end和start指向的数字进行交换
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
        }

        //当start和end指向了同一个元素的时候，上面的循环就会结束
        //表示已经找到了基准数应存入的位置
        //基准书归位：
        int tmp = arr[i];
        arr[i] = arr[start];//也可以写成arr[end],因为二者指向了同一个索引
        arr[start] = tmp;

        quicksort(arr,i,start-1);
        quicksort(arr,start+1,j);

    }
}
