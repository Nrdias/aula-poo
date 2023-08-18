package br.puc.poo.a0908;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int dividendo, divisor, precisao;
        if(args.length == 0){
            int[] parametros = defineparametros();
            dividendo = parametros[0];
            divisor = parametros[1];
            precisao = parametros[2];
        }else{
            dividendo = Integer.parseInt(args[0]);
            divisor = Integer.parseInt(args[1]);
            precisao = Integer.parseInt(args[2]);
        }
        System.out.println(Matematica.calcula(dividendo, divisor, precisao));
    }
    public static int[] defineparametros() {
        Scanner in = new Scanner(System.in);
        int[] param = new int[3];
            System.out.println("Informe o dividendo: ");
            param[0] = in.nextInt();
            System.out.println("Informe o divisor: ");
            param[1] = in.nextInt();
            System.out.println("Informe a precisao: ");
            param[2] = in.nextInt();
            in.nextLine();
            return param;
    }
}

