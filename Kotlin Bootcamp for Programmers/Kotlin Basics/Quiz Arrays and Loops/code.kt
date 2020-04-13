import kotlin.math.*

fun main() {
  val array = Array(7){ 1000.0.pow(it) }
	val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte","terabyte", "petabyte", "exabyte")
	for ((i, value) in array.withIndex()) {
   		println("1 ${sizes[i]} = ${value.toLong()} bytes")
	}
}
