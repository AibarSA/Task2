package HomeWork;

public class Main {
    public static void main(String[] args) {

        boolean number1 = isItInAscendingOrder(123456);
        boolean number2 = isItInAscendingOrder(6153);
        System.out.println(number1);
        System.out.println(number2);

    }

    public static boolean isItInAscendingOrder(int a) {

        String s = String.valueOf(a);
        String[] m = new String[s.length()];

        for (int i = 0; i <s.length() ; i++) {
            m [i] = String.valueOf(s.charAt(i));
        }

        boolean res = true;
        for (int i = 0; i < m.length - 1; i++) {
            if (Integer.parseInt(m[i]) > Integer.parseInt(m[i + 1])) res = false;
        }
        return res;
    }


}
