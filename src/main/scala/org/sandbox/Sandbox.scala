package org.sandbox

class Sandbox {

  def square(x: Int): Int = {
    x * x
  }

  def multiple(x: Int, y: Int): Int = {
    x * y
  }

  def condition(x: Int): Boolean = {
    (x > 10 && x < 20) || x == 100
  }
}
