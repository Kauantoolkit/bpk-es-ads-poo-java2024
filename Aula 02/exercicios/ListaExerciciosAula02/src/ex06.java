public class ex06 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};                               // sintaxe bomba (int [] numeros = {})

        for (int i = 0; i < numeros.length; i++) {                          // length tipo em python
            System.out.println("Elemento " + (i + 1) + ": " + numeros[i]);
        }
    }
}

