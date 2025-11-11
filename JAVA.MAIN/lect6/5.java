package lect6;

class five { 
    void countCharacters() {
        String str="aabbd";

int a[]=new int[256];
for(char ch:str.toCharArray()){
            a[ch]++;
        }
        for(int i=0;i<256;i++){
        if(a[i]>0){ 
        if(a[i]==1) {
        System.out.println((char)i+"->"+a[i]);
        return;
    }
    }
    }
    }
    public static void main(String[] args) {
       five obj = new five();
       obj.countCharacters();
    }
}   

