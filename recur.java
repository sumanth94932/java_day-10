class r {
    int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);  // Corrected to use recursion
    }

    public static void main(String args[]) {
        Recur ob = new Recur();  // Corrected class name
        int res = ob.sum(10);
        System.out.println(res);
    }
}
 /*   55*/