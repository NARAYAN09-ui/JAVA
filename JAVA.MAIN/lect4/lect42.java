class Two
{
    public static void main(String[] args)
    {
        String a="hello";
        int count =0;
        for(int i=0;i<a.length();i++)
        switch (a.charAt(i))
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
             case 'I':
             case 'O':
             case 'U':
             count++;
            System.out.println(count);
            break;
             default:
                 System.out.println(count);
        }
    }
}