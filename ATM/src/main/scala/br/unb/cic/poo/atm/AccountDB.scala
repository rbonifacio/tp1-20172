package br.unb.cic.poo.atm

object AccountDB {

  def accounts : Array[Account] = Array(
    new Account("rbonifacio", 100),
    new Account("gramos", 200),
    new SpecialAccount("gnunes", 300),
    new GoldAccount("foo")
  )



}
