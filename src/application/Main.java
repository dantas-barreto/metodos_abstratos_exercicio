package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;
import entities.Individual;
import entities.Company;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		List<TaxPayer> lista = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = teclado.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = teclado.next().charAt(0);
			System.out.print("Name: ");
			teclado.nextLine();
			String name = teclado.nextLine();
			if (ch == 'i') {
				System.out.print("Anual income: ");
				double income = teclado.nextDouble();
				System.out.print("Health expenditures: ");
				double healthExpenditure = teclado.nextDouble();
				lista.add(new Individual(name, income, healthExpenditure));
			} else { 
				System.out.print("Anual income: ");
				double income = teclado.nextDouble();
				System.out.print("Number of employees: ");
				int employees = teclado.nextInt();
				lista.add(new Company(name, income, employees));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.0;
		for (TaxPayer taxPayer : lista) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
			sum += taxPayer.tax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		teclado.close();
	}

}
