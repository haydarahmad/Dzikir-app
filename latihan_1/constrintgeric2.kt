open class Employee

 class VicePresident: Employee()

 class manager:Employee()

class company<T>(val employee: T)

fun main() {
    val data1 = company(employee : "apa")
    val data2 = company(manager())
    val data3 = company(employee:43.5f)
}