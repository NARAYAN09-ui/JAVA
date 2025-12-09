package lect19;

class five {
 public static void main(String[] args) {
    int a[]={5,-3,0,6,3,7};
    // k = 3;
    int max = 0;
    for(int i=0;i<=a.length;i++){
        for(int j=1;j<=a.length;j++){
     int b=a[i]+a[j];
     if (b>max) {
        max=b;
     }
    }
}
    System.out.println(max);
 }   
}
