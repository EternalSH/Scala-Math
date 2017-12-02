package pl.eternalsh.scala.math.complex

import org.scalatest._
import pl.eternalsh.scala.math.Complex

import scala.util.Random

class AdditionTest extends FlatSpec {

  private def randomComplex: Complex = {
    val re = BigDecimal(Random.nextDouble())
    val im = BigDecimal(Random.nextDouble())
    Complex(re, im)
  }

  "Complex numbers" should "add re and im respectively" in {
    val c1 = randomComplex
    val c2 = randomComplex

    val expected = Complex(c1.re + c2.re, c1.im + c2.im)

    assert(c1 + c2 === expected)
  }

  "Addition" should "be cumulative" in {
    val c1 = randomComplex
    val c2 = randomComplex
    val c3 = randomComplex

    assert((c1 + c2) + c3 === c1 + (c2 + c3))
  }

  "Addition" should "work in any order" in {
    val c1 = randomComplex
    val c2 = randomComplex

    assert(c1 + c2 == c2 + c1)
  }
}
