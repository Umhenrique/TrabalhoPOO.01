package Questões;

import java.text.ParseException; //Para por o erro
import java.text.SimpleDateFormat; //
import java.util.Date;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira a data nesse formato -> MM/DD/YYYY: ");
        String dataString = input.nextLine();
        
        //Afirma o tipo de dados recebido e em qual ele deve transformar
        SimpleDateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("MMMM dd, yyyy");
        
        try {
            Date data = inputFormat.parse(dataString);
            System.out.println("Data Convertida: " + outputFormat.format(data));
        } catch (ParseException e) {
            System.out.println("Forma de data invalida. Por favor use o formato MM/DD/YYYY.");
        }
    }
}
