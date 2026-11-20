package com.invisirisk.qa

import cats.syntax.all.*
import io.circe.parser.decode

object Main:
  def greeting(name: String): String =
    List("Hello", name).intercalate(" ")

  def parseEnabled(json: String): Either[io.circe.Error, Boolean] =
    decode[Map[String, Boolean]](json).flatMap { values =>
      values.get("enabled").toRight(io.circe.DecodingFailure("enabled is missing", Nil))
    }

  def main(args: Array[String]): Unit =
    println(greeting("InvisiRisk"))
