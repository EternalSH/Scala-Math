package pl.eternalsh.scala.math

/**
  * Complex number abstraction. Math meaning:
  *  re + i * im
  *
  * @param re real part of the number
  * @param im imaginary part of the number
  */
case class Complex(re: BigDecimal, im: BigDecimal) {

  def +(c: Complex): Complex =
    Complex(re + c.re, im + c.im)
}
