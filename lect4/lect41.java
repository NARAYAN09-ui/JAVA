class lect41
{
    public static void main(String[] args)
    {
        String a="hello";
        int v=0;
        for(char ch: a.toCharArray()){
            if("aeiou".indexOf(ch) != -1){
                v++;
            }
        }
        System.out.println(v);
}

    }
    