package br.unb.cic.poo.atm

object Main extends App {
  for(c <- AccountDB.accounts) {
    c.withdraw(30)
  }
}
