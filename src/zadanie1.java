import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args){
        Scanner dane = new Scanner(System.in);
        int liczba;
        System.out.println("Jaka liczbe od 1 do 10 zapisac w systemie rzymskim?: ");
        liczba=dane.nextInt();
        switch(liczba) {
            case 1:
                System.out.println("Ta liczba to I");
                break;
            case 2:
                System.out.println("Ta liczba to II");
                break;
            case 3:
                System.out.println("Ta liczba to III");
                break;
            case 4:
                System.out.println("Ta liczba to IV");
                break;
            case 5:
                System.out.println("Ta liczba to V");
                break;
            case 6:
                System.out.println("Ta liczba to VI");
                break;
            case 7:
                System.out.println("Ta liczba to VII");
                break;
            case 8:
                System.out.println("Ta liczba to VII");
                break;
            case 9:
                System.out.println("Ta liczba to IX");
                break;
            case 10:
                System.out.println("Ta liczba to X");
                break;
        }

    }
}
