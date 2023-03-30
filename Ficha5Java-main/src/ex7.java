import java.util.Scanner;

class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduza 10 valores : ");

        int[] val = new int[10];
        int i, par=0;

        for(i = 0; i < 10; ++i) {

            val[i] = input.nextInt();

            if (val[i] % 2 == 0 && par < val[i]){
                par = val[i];
            }
        }

        if(par != 0) {
            System.out.println("O maior número par é: " + par);
        } else {
            System.out.println("Não existe nenhum número par!");
        }
    }
}
