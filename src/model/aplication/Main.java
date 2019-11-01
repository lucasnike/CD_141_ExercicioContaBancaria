package model.aplication;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.ActionOutOfNormException;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		try {
			System.out.print("Número da conta:");
			int number = tec.nextInt();
			System.out.print("Nome: ");
			tec.nextLine();
			String holder = tec.nextLine();
			System.out.print("Saldo: ");
			double balance = tec.nextDouble();
			System.out.print("Limite de saque: ");
			double withDrawLimit = tec.nextDouble();
			Account conta = new Account(number, holder, balance, withDrawLimit);
			System.out.println("");
			System.out.print("Valor pra sacar: ");
			conta.withDraw(tec.nextDouble());
			System.out.println("Saldo atual: $ " + conta.getBalance());
		} catch (ActionOutOfNormException e) {
			System.err.println(e.getMessage());
		}catch (RuntimeException e) {
			System.err.println("Erro inesperado !!!");
		}
		finally {
			tec.close();
		}
	}

}
