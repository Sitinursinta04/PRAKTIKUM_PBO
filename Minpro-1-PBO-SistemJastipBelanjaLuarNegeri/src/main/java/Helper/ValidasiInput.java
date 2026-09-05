/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class ValidasiInput {

    private Scanner scanner;

    // Constructor
    public ValidasiInput(Scanner scanner) {
        this.scanner = scanner;
    }

    // Validasi input String
    public String inputString(String pesan) {

        String input;

        do {
            System.out.print(pesan);
            input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("Input tidak boleh kosong.");
            }

        } while (input.isEmpty());

        return input;
    }

    // Validasi input Integer
    public int inputInteger(String pesan) {

        int angka;

        do {
            System.out.print(pesan);
            angka = scanner.nextInt();

            if (angka <= 0) {
                System.out.println("Input harus lebih dari 0.");
            }

        } while (angka <= 0);

        return angka;
    }

    // Validasi input Double
    public double inputDouble(String pesan) {

        double angka;

        do {
            System.out.print(pesan);
            angka = scanner.nextDouble();

            if (angka <= 0) {
                System.out.println("Input harus lebih dari 0.");
            }

        } while (angka <= 0);

        return angka;
    }
}