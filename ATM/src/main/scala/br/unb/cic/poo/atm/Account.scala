package br.unb.cic.poo.atm

class InvalidAmountException extends Exception

/**
  * An account class "abstraction"
  * @param name the owner ot the account
  * @param balance the initial balance
  */
class Account(private val name: String, protected var balance : Double = 0.0) {

  require(balance >= 0)

  /**
    * Method that deposits a "valid" amount to the
    * balance
    *
    * @param amount to be added to the balance
    */
  def deposit(amount : Double) = {
    require(amount > 0)
    balance = balance + amount
  }

  @throws[InvalidAmountException]
  def withdraw(amount : Double) : Unit = {
    if(amount > 0 && amount <= balance) {
      balance = balance - amount
    }
    else {
      throw new InvalidAmountException
    }
  }

  @throws[InvalidAmountException]
  def transferAmount(c: Account, amount: Double): Unit = {
    this.withdraw(amount)
    c.deposit(amount)
  }

  /**
    * @return the account balance
    */
  def getBalance = balance

  def getName = name
}
