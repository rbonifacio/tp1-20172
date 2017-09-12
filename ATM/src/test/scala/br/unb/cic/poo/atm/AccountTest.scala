package br.unb.cic.poo.atm

import java.sql.SQLException

import org.scalatest.FunSuite

class AccountTest extends FunSuite {

  test("valor de saque invalido") {
    val account = new Account("abc", 10)
    try {
      account.withdraw(20)
      println("nao deveria passar aqui!")
      fail()
    }
    catch {
      case ex: InvalidAmountException => succeed
      case ex: Exception => fail
    }
  }

}
