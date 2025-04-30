//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final String saludoConst = "Hello and welcome!";
        int[] listaNum = new int[]{5,4,3,2,1};

        System.out.println(saludoConst);

        for(var x: listaNum){
            System.out.println("i = " + x);
        }

        System.out.println("****************");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}