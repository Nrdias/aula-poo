package br.puc.poo.a0908;

public class Matematica {
    public static String calcula(int dividendo, int divisor, int precisao){
        double operacao;
        String format = "\"%."+precisao+"f\"";
        String retorno;
        if(divisor != 0){
            operacao = dividendo / (double) divisor;
            String result = String.format(format,operacao);
            retorno = "Dividendo: " + dividendo + ", Divisor: " + divisor + ", Precisao: " + precisao + ", Resultado: " + result;
        } else{
            retorno = "Dividendo: " + dividendo + ", Divisor: " + divisor + ", Precisao: " + precisao + ", Resultado: " + null;
        }
        return retorno;
    }
}
