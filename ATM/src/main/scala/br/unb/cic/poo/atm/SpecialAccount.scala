package br.unb.cic.poo.atm

class SpecialAccount(name : String, initialBalance : Double = 0.0)
  extends Account(name, initialBalance){
  private val limit = 1000

  override def withdraw(amount: Double) = {
    require(amount > 0 && balance + limit > amount)
    balance = balance - amount
  }

   def payment(code: String, amount : Double) : Unit = {
    //TODO: ainda nao implementado
  }
}
