

object MyApp extends App {
  def divisors(n: Int): List[Int] =
    for (i <- List.range(1, n + 1) if n % i == 0) yield i

  // check for prime number
  def isPrime(n: Int) = divisors(n).length == 2

  if (isPrime(24)) println("It is a prime number") else
    println("It is not a prime number")
}