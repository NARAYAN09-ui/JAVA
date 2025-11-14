package lect5;

class eight {
    public static void main(String[] args) {
  String str = "i love java";
    String a[] = str.split(" ");
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < a.length; i++) {
        result.append(new StringBuilder(a[i]).reverse()).append(" ");
    }
   
    System.out.println(result);
    }
}
