import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Dz_4 {

    public static void main(String[] args) {
        arrText();
    }


    public static void arrText() {
        Scanner sc = new Scanner(System.in);
        String str = "";
        List <String> strArrList = new ArrayList<>();
        while (true) {

            str = sc.nextLine();
            String strLower = str.toLowerCase();
            if (strLower.equals("exit") ) {
                break;
            }
            else if (strLower.contains("print~")) {
                try {
                    String [] strin = str.split("~");
                    String numberPrint = strin [1];
                    try {
                        int numPrint = Integer.parseInt(numberPrint);
                        System.out.println(strArrList.get(numPrint));
                    } catch (Exception e) {
                        System.out.println("Введено не верное значение");
                    }
                } catch (Exception e) {
                    System.out.println("Введено не верное значение");
                }

            }

            else {
                try {
                    String [] strin = str.split("~");
                    String word = strin [0];
                    String numberString = strin [1];
                try {
                    int num = Integer.parseInt(numberString);
                    for (int i = 0; i <= num; i++) {
                        strArrList.add("Null");    
                    }
                    strArrList.set(num, word);
                    strArrList.toString();

                } catch (Exception e) {
                    System.out.println("Введено не верное значение");
                }
                } catch (Exception e) {
                    System.out.println("Введено не верное значение");
            }
        }
        }
    }
}