package com.learnings

object Basics extends App{
 val age: Int = 27
 val male = false
 val name = "Linda"
 val pronouns = if (male) "he" else "she"

 val Ostatement = "My name is " + name + " I am " + age + " old and my pronouns are " + pronouns + "."
 println(Ostatement)
}
