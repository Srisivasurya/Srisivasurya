class Comparew
{
    static void find(int a[], int b[], int n, int m)
    {
        for (int i = 0; i < n; i++)
        {
            int j;

            for (j = 0; j < m; j++)
                if (a[i] == b[j])
                    break;

            if (j == m)
                System.out.print(a[i] + " ");
        }
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

