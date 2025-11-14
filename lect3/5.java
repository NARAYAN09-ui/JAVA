
class Main {

    public static void main(String[] args) {
        String a = "hello";
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        if (a.equals(b)) {
            System.out.println("palindrom");
        } else {
            System.out.println("not a palindrom");
        }
    }
}
