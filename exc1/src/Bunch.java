public class Bunch {
    private int[] arr_bunch=new int[10];
    public int count_arr_bunch=0;

    public int getArr_bunch(int i) {
        return arr_bunch[i];
    }

    public void setArr_bunch(int arr_bunch) {
        this.arr_bunch[count_arr_bunch] = arr_bunch;
        heapify(count_arr_bunch);
        count_arr_bunch++;
    }

    public void heapify(int i)
    {
        int left =2*i+1;
        int right =2*i+2;
        int swap_el=0;

        int largest=i;

        if (left<count_arr_bunch && arr_bunch[left]>arr_bunch[i])
            largest=left;

        if (right<count_arr_bunch && arr_bunch[right]>arr_bunch[largest])
            largest=right;

            if (largest!=i)
            {
                swap_el=arr_bunch[i];
                arr_bunch[i]=arr_bunch[largest];
                arr_bunch[largest]=swap_el;
            }

            heapify(largest);
    }


}
