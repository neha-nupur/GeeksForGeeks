public class MergeAndSort {
    static void merge(int arr[], int l, int m, int r) {
        int temp[] = new int[r-l+1];
        int i = l;
        int j = m+1;
        int k = 0;

        while (i <= m && j <= r) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= m) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= r) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (k = 0, i = l; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    static void mergeSort(int arr[], int l, int r) {
        if (l >= r) {
            return;
        }

        int m = l+(r-l)/2;

        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);

        merge(arr, l, m, r);
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        print(arr);
    }

    public static void print(int arr[]) {
        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

