package com.hcl;

public class SavingAccount2 extends Account2 {
  protected double minimumBalance;

  public double getMinimumBalance() {
    return minimumBalance;
  }

  public void setMinimumBalance(double minimumBalance) {
    this.minimumBalance = minimumBalance;
  }
}
