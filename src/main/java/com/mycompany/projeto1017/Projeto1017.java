/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1017;
import java.util.Scanner;
public class Projeto1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempogasto, velocidademedia, consumomedio;
        tempogasto = sc.nextInt();
        velocidademedia = sc.nextInt();
        double distanciapercorrida;
        distanciapercorrida = tempogasto * velocidademedia;
        consumomedio = sc.nextInt();
        double quantidadedelitros = distanciapercorrida / consumomedio;
        System.out.printf("%.3f\n", quantidadedelitros);
    }
}
