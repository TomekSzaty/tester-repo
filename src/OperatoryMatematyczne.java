public class OperatoryMatematyczne {
    public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 6;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        double divisionD = (double) firstNumber / secondNumber;
        int modulo = firstNumber%secondNumber;

        System.out.println("wynik dodoawania " + addition);
        System.out.println("wynik odejmowania " + subtraction);
        System.out.println("wynik mnozenia " + multiplication);
        System.out.println("wynik dzielenia " + division);
        System.out.println("wynik dzielenia " + divisionD);
        System.out.println("wynik modulo " + modulo);

        firstNumber += secondNumber;
        System.out.println("Po dodaniu i nadpisaniu " + firstNumber);//10
        firstNumber -= secondNumber;
        System.out.println("Po odjęciu i nadpisaniu " + firstNumber);//4
        firstNumber *= secondNumber;
        System.out.println("Pp mnozeniu i nadpisaniu " + firstNumber);//24
        firstNumber /= secondNumber;
        System.out.println("Po dzieleniu i nadpisaninu "+ firstNumber);//4
        firstNumber %= secondNumber;
        System.out.println("reszta z dzielenia po nadpisaniu " +firstNumber);//4
    }
}
