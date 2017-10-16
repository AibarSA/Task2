package HomeWork;

public class Main {
    public static void main(String[] args) {

        boolean number1 = isItInAscendingOrder(12345);
        boolean number2 = isItInAscendingOrder(321);
        boolean number3 = isItInAscendingOrder(224);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    }

    public static boolean isItInAscendingOrder(int number) {

        String strRepresOfNumber = String.valueOf(number);
        String[] massive = new String[strRepresOfNumber.length()];

        for (int i = 0; i <strRepresOfNumber.length() ; i++) {
            massive [i] = String.valueOf(strRepresOfNumber.charAt(i));
        }

        boolean res = true;
        for (int i = 0; i < massive.length - 1; i++) {
            if (Integer.parseInt(massive[i]) >= Integer.parseInt(massive[i + 1])) res = false;
        }
        return res;
    }


}
