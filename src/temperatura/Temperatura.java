/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;
import java.util.Scanner;

/**
 *
 * @author Barna live sessions
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura: ");
        int temperatura = scanner.nextInt();
        
        if (temperatura > 25) {
            System.out.println("Vamos a la playa");
        } else if (temperatura > 15 && temperatura < 25) {
            System.out.println("Vamos a la montaña");
        } else if (temperatura < 5) {
            System.out.println("A esquiar!");
        } else {
            System.out.println("A dormir");
        }
    }
}
