package org.sandbox

import junit.framework.Assert._
import org.junit.Test
import org.scalatest.junit.JUnitSuite

class SandboxTest extends JUnitSuite {
  val samdbox = new Sandbox

  @Test def samdboxText() {
    assertEquals(1, samdbox square 1)
    assertEquals(4, samdbox square 2)
    assertEquals(9, samdbox square 3)
    assertEquals(36, samdbox multiple(12, 3))
  }

  @Test def conditionTest() {
    assertTrue(samdbox condition 15)
  }
}
