package br.unb.cic.poo.atm

import java.sql.SQLException

import org.scalatest.FunSuite

class AccountTest extends FunSuite {

  test("valor de saque invalido") {
    val account = new Account("abc", 10)

    val balance =   account.withdraw(20)
    balance match {
      case None => succeed
      case Some(v) => fail("nao esperando um valor")
    }

  }

}
