/*
* File: lelepi.java
* Author: Róth József
* Copyright: 2023, Róth József
* Group: Szoft I/1/N
* Date: 2023-02-20
* Github: https://github.com/HyBerTop
* Licenc: GNU GPL
*/

import java.util.Scanner;

class Input {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);

        System.out.println("Róth József");
        System.out.println("SZOFT I/1/N");
        System.out.println("2023.02.20");
    	
        System.out.print("A paralelepipedon A oldala: ");
        int number1 = input.nextInt();
        System.out.println("A oldal: " + number1);

        System.out.print("A paralelepipedon B oldala: ");
        int number2 = input.nextInt();
        System.out.println("B oldal: " + number2);

        System.out.print("A paralelepipedon C oldala: ");
        int number3 = input.nextInt();
        System.out.println("C oldal: " + number3);

        double volumeOfPrism= number1 * number2 * number3;
		
        System.out.println("A paralelepipedon térfogata: " +volumeOfPrism);

        input.close();

    }
}