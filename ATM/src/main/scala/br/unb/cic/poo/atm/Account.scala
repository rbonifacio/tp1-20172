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

  def withdraw(amount : Double) : Option[Double] = {
    if(amount > 0 && amount <= balance) {
      balance = balance - amount
      return Some(balance)
    }
    else {
      None
    }
  }

  def transferAmount(c: Account, amount: Double): Option[Double] = {
    this.withdraw(amount) match {
      case None     => None
      case Some(v)  => c.deposit(amount); return Some(v)
    }

  }

  /**
    * @return the account balance
    */
  def getBalance = balance

  def getName = name
}
