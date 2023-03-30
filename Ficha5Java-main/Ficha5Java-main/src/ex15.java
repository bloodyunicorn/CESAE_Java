import java.util.Scanner;
class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int salario, vencDia = 0, x;
        double[] salarioLiq = new double[2], despesaTotal = new double[2];
        double subAl = 0, irs, ssTrab = 0, ssEmp = 0, ssTotal, totalSubAl, bonus = 0, totalSalAnual = 0, totalDespAnual = 0;
        String codFunc, diass, tipo = "f";
        boolean out = false;

        do {
            System.out.print("\nIndique o código do trabalhador: ");
            codFunc = input.next();

            if (codFunc.equals("q")) {
                out = true;
            } else {

                System.out.print("\nE - Empregado \nC - Chefe \nA - Administrador \n ");

                do {
                    System.out.print("\nIndique um tipo de trabalhador válido: ");
                    tipo = input.next();
                    tipo = tipo.toUpperCase();

                    if (tipo.equals("Q")) {
                        out = true;

                    } else {

                        switch (tipo) {

                            case "E":
                                vencDia = 40;
                                subAl = 5;
                                break;
                            case "C":
                                vencDia = 60;
                                subAl = 7.5;
                                break;
                            case "A":
                                vencDia = 80;
                                subAl = 7.5;
                                break;
                            default:
                                tipo = "F";
                        }

                        System.out.print("\nIndique a quantidade de dias trabalhados: \n");

                        for (x = 0; x < 2 && out == false; x++) {
                            System.out.println((x + 1) + "º mês: ");
                            diass = input.next();

                            if (diass.equals("q")) {
                                out = true;
                            } else {
                                int dias = Integer.parseInt(diass); //converti string para int

                                salario = dias * vencDia;
                                totalSubAl = dias * subAl;

                                if (dias > 20) {
                                    bonus = salario * 0.05;
                                } else if (dias > 17) {
                                    bonus = salario * 0.02;
                                }

                                //S.Soc.
                                if (vencDia == 80) {
                                    ssTrab = (salario + bonus) * 0.09;
                                    ssEmp = (salario + bonus) * 0.21;
                                } else {
                                    ssTrab = (salario + bonus) * 0.11;
                                    ssEmp = (salario + bonus) * 0.2375;
                                }

                                ssTotal = ssTrab + ssEmp;

                                //IRS
                                if ((salario + bonus) < 1000) {
                                    irs = (salario + bonus) * 0.1;
                                } else if ((salario + bonus) < 2500) {
                                    irs = (salario + bonus) * 0.2;
                                } else {
                                    irs = (salario + bonus) * 0.3;
                                }

                                salarioLiq[x] = salario + bonus + totalSubAl - irs - ssTrab;
                                despesaTotal[x] = salario + bonus + totalSubAl + ssEmp;

                                System.out.println("\nSalário Bruto: " + (salario + bonus) + "€");
                                System.out.println("Subsidio de alimentação: " + totalSubAl + "€");
                                System.out.println("Retenção IRS: " + irs + "€");
                                System.out.println("Valor para SS: " + ssTotal + "€");
                                System.out.println("\nValor total a transferir ao funcionario: " + salarioLiq[x] + "€");
                                System.out.println("Despesa total da empresa: " + despesaTotal[x] + "€ \n");

                                totalSalAnual += salarioLiq[x];
                                totalDespAnual += despesaTotal[x];

                                System.out.println("\nO total dos salarios liquidos é: " + totalSalAnual);
                                System.out.println("A despesa total anual é: " + totalDespAnual + "\n");
                            }
                        }
                    }
                } while (tipo == "F" && out == false);
            }
        } while (out == false) ;
    }
}
