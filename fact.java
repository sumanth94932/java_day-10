class fact{
    int sum(int n){
        if(n==0) return 1;
        return n*sum(n-1);
    }
    public static void main (String arg[]) {
        fact a=new fact();
        int res=a.sum(5);
        System.out.println(res);
    }
}/* 120  */