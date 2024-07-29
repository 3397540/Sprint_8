import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {

        System.out.println("Введите имя и фамилию:");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        Account account = new Account(name);

        if (account.checkNameToEmboss()) {
            System.out.println("Emboss");
        } else {
            System.out.println("Not Emboss");
        }


        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
    }
}
