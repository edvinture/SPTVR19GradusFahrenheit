/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradusfahrenheit;

import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    private Scanner scanner = new Scanner(System.in);
    public void run () {
        System.out.println("конвертер градусов цельсия в градусы по фаренгейту.");
        System.out.println("Введите градусы по цельсию:");
        double gradC = scanner.nextDouble();
        System.out.println("по фаренгейту это:");
        double gradF = gradC * 9 / 5 +32;
        System.out.printf("%.2f%n",gradF);
        
        System.out.println("--конец программы--");
        
        
    }
}
