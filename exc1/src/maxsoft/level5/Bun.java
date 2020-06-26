package maxsoft.level5;
//Пирамидальная сорти ровка
public class Bun {

        public static void swap_bun(int[] a,int i, int j) {
            int tmp=a[i];
            a[i]=a[j];
            a[j]=tmp;
        }

        public static void heap_insert(int[] a,int n,int x) {
            a[n + 1] = x;
            for (int i = n + 1; i > 1; ) {
                if (a[i] > a[i / 2]) {
                    swap_bun(a, i, i / 2);
                    i = i / 2;
                } else {
                    break;
                }
            }
        }

        public static void heap_pop ( int[] a, int n){
                swap_bun(a, n, 1);
                for (int i = 1; 2 * i < n; ) {
                    i *= 2;
                    if (i + 1 < n && a[i] < a[i + 1]) {
                        i += 1;
                    }
                    if (a[i / 2] < a[i]) {
                        swap_bun(a, i / 2, i);
                    }
                }
        }

        public static void heap_sort(int[] data){
            int n=data.length;
            int[] buff=new int[n+1];
            for (int i=0;i<n;++i){
                heap_insert(buff,i,data[i]);
            }
            for (int i=0;i<n;++i){
                data[n-1-i]=buff[1];
                heap_pop(buff,n-i);
            }

        }

}
