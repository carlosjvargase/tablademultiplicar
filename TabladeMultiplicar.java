public class TabladeMultiplicar {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            System.out.println("\n************************** " + i);
            System.out.println("\nTABLA DE MULTIPLICAR DEL " + i);
            for (int j=1; j<=10; j++) {
                System.out.println(i + " x " + j + " = " + i*j );
            }
        }
    }
}
