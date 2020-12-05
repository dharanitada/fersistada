package com.hcl;

public class AccountBO {
  /**Oneahdhga.
   */
  public FixedAccount2 getAccountDetails(String detail) {
    String[] st = detail.split(",");
    FixedAccount2 fixedAcc = new FixedAccount2();
    fixedAcc.setAccountNumber(st[0]);
    fixedAcc.setBalance(Double.parseDouble(st[1]));
    fixedAcc.setAccountHolderName(st[2]);
    fixedAcc.setMinimumBalance(Double.parseDouble(st[3]));
    fixedAcc.setLockingPeriod(Integer.parseInt(st[4]));
    return fixedAcc;
    
  }

}
