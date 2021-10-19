public class InkrementacjaDekrementacja {
    public static void main(String[] args) {

        int numberA = 0;
        int numberB = numberA++;
        System.out.println();
        System.out.println(numberA);//nastapiło nadpisanie wartosci numberA - inkrememntacja
        System.out.println(numberB);//najpierw  przypisanie wartosci "pierwotnej'(0)
                                    // numberA do zmiennej numberB ,a potem inkrementacja(postinkrementacja)

        int numberC = 0;
        int numberD = ++numberC;
        System.out.println();
        System.out.println(numberC);// nastapiło nadpisanie wartosci nuberC inkrementacja
        System.out.println(numberD);// najpierw (preinkrementacja)  zwiekszenie wartosci NumberC o jeden ,
                                    // a potem przypisanie do zmiennej numberC

        int numberE = 0;
        int numberF = numberE--;
        System.out.println();
        System.out.println(numberE);//nastapiła dekrementacja zmiennej numberE
        System.out.println(numberF);//najpierw została przypisana stara wartosc zmiennej numberE (0) do zmiennej numberF
                                    // , a nastepnie (postdekrementacja) zmniejszenie o jeden zmiennej numberE

        int numberX = 0;
        int numberY = --numberX;
        System.out.println();
        System.out.println(numberX);//dekrementacja zmiennej NumberX o jeden
        System.out.println(numberY);//najpierw (predekrementacja) zmiennej numberX
                                    // , a potem jej przypisanie do zmiennej numberY

    }
}
