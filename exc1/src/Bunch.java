import maxsoft.level5.Bun;

import static maxsoft.level5.Bun.swap_bun;

//Quick sort. Сортировка Хоара
public class Bunch {

    public static void quick_sort(int[] a, int i_,int j_){
        int i=i_;
        int j=j_-1;
        boolean side=false;
        if ((i<0) || (i>=j_-1)|| (j<0)||(j>=j_)) return;
        while (i!=j){
            if (a[i]>a[j]) {
                swap_bun (a, i, j);
                side=!side;
            }
            if (side){
                ++i;
            }else{
                --j;
            }
        }
        if (i>1) quick_sort (a,0,i);
        if (j_>i+1) quick_sort (a,i+1,j_-(i+1));
    }


}
