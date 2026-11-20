package com.invisirisk.qa

class MainSuite extends munit.FunSuite:
  test("creates a greeting") {
    assertEquals(Main.greeting("Scala"), "Hello Scala")
  }

  test("parses JSON through a resolved third-party dependency") {
    assertEquals(Main.parseEnabled("{\"enabled\":true}"), Right(true))
  }
