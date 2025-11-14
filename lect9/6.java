class sa6 {
    public int data(int a[][]){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                sum += a[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6}};
        sa6 obj = new sa6();
        System.out.println("sum is " + obj.data(a));
    }
}

