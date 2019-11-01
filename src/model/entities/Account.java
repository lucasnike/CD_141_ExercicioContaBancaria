package model.entities;

import model.exceptions.*;

public class Account {
	private Integer number;
	private String holder;
	private double balance;
	private double withDrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, double balance, double withDrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void withDraw(double value) throws ActionOutOfNormException{
		if (value > getBalance()) {
			throw new ActionOutOfNormException("Valor acima do saldo da conta");
		}else if(value > getWithDrawLimit()) {
			throw new ActionOutOfNormException("Valor acima do limite de saque");
		}
		this.balance -= value;
	}
	public void deposit(double value) {
		this.balance += value;
	}	
}
