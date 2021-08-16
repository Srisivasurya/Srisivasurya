package Testans;

import java.util.HashSet;

class Comparec
{
    static void find(int a[], int b[], int n, int m)
    {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < m; i++)
            s.add(b[i]);
        for (int i = 0; i < n; i++)
            if (!s.contains(a[i]))
                System.out.print(a[i] + " ");
    }

    public static void main(String[] args)
    {
        int a[] = { 10,22,33,40,5};
        int b[] = { 2,3,10,0,5 };

        int n = a.length;
        int m = b.length;

        find(a, b, n, m);
    }
}