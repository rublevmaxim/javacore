public class Bunch {
    private int[] arr_bunch=new int[10];
    public int count_arr_bunch=0;

    public int getArr_bunch(int i) {
        return arr_bunch[i];
    }

    public void setArr_bunch(int arr_bunch) {
        //this.arr_bunch[count_arr_bunch] = arr_bunch;
        //int i=count_arr_bunch;
        //heapify(i);

        heap_insert(arr_bunch);
        count_arr_bunch++;

    }

    private void heap_insert(int x)
    {
        int tmp=0;
        arr_bunch[count_arr_bunch]=x;
        if (count_arr_bunch>0)
        {
            for (int i=count_arr_bunch; i>0;){
                if  (arr_bunch[i]> arr_bunch[i/2]){
                  tmp=  arr_bunch[i];
                  arr_bunch[i]=arr_bunch[i/2];
                  arr_bunch[i/2]=tmp;
                  i=i/2;
                }
                else
                {
                    break;
                }
            }

        }

    }
    //Извлечение вершины кучи
    public void heap_pop()
    {
        int tmp=  arr_bunch[count_arr_bunch-1];
        arr_bunch[count_arr_bunch-1]=arr_bunch[0];
        arr_bunch[0]=tmp;

     /*  for (int i =1 ;2*i<count_arr_bunch-1;) {
            i*=2;
            if (i+1<count_arr_bunch&&arr_bunch[i]<arr_bunch[i+1]) {
                i++;//i+=1;
            }
            if (arr_bunch[i/2]<arr_bunch[i]){
                tmp=  arr_bunch[i/2];
                arr_bunch[i/2]=arr_bunch[i];
                arr_bunch[i]=tmp;
            }
        }*/


        count_arr_bunch--;
    }

    public void heapify(int i)
    {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int swap_el = 0;

            int largest = i;

            if (left < count_arr_bunch && arr_bunch[left] > arr_bunch[i])
                largest = left;

            if (right < count_arr_bunch && arr_bunch[right] > arr_bunch[largest])
                largest = right;

            if (largest != i) {
                swap_el = arr_bunch[i];
                arr_bunch[i] = arr_bunch[largest];
                arr_bunch[largest] = swap_el;
            }

            heapify(largest);
    }


}
