class MClass {
    public static void main(String[] args) {
        String str="narayan";
        int a[]=new int[256];
        for(char ch:str.toCharArray()){
            a[ch]++;
        }
        for(int i=0;i<256;i++){
            if(a[i]>0){
                System.out.println((char)i+"->"+a[i]);
            }
        }

    }
}
