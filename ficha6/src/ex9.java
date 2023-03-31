import java.util.Scanner;

class ex9 {
    public static int[] vetor(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nQuantos valores quer introduzir? ");
        int x = input.nextInt();

        int [] vet = new int[x];

        System.out.println("\nIntroduza os " + x + " valores: ");
        for (int i = 0; i < x; ++i) {
            vet[i] = input.nextInt();
        }
        return vet;
    }
    public static int detMaior(int x[]) {

        int maior = 0;

        for (int i = 0; i < x.length ; ++i) {

            if (maior <= x[i]) {
                maior = x[i];
            }
        }

        return maior;
    }
    public static int detMenor(int x[]) {

        int menor = x[0];

        for (int i = 0; i < x.length ; ++i) {

            if (menor >= x[i]) {
                menor = x[i];
            }
        }

        return menor;
    }
    public static boolean crescente(int x[]) {

        int count=0;

        for (int i = 0; i < x.length; i++) {

            if (count <= x[i]){
                count = x[i];
            } else {
                return false;
            }
        }
        return true;
    }
    public static void menu(int x[]) {
        Scanner input = new Scanner(System.in);
        boolean valid;

        System.out.println("/nEscolha uma das seguintes opções:\n\n1 - Determinar  o maior número \n2 - Determinar o menor número\n3 - Determinar se a sequencia é crescente\n");

        do {
            int op = input.nextInt();
            valid = true;

            switch (op) {
                case 1:
                    int maior = detMaior(x);
                    System.out.println("\nO maior é: " + maior);
                    break;

                case 2:
                    int menor = detMenor(x);
                    System.out.println("o menor é: " + menor);
                    break;

                case 3:
                    if ( crescente(x)){
                        System.out.println("Introduziu por ordem crecente");
                    } else {
                        System.out.println("Não introduziu por ordem crescente");
                    }
                    break;

                default:
                    valid = false;
                    System.out.println("Escolha uma opção válida:");
            }
        } while (valid == false);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vet;
        menu(vet = (vet = vetor()));

    }
}