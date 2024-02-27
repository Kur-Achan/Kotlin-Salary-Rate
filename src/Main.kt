//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    Salary(5,2000)
    Salary(6 ,1800)
    Salary(3 ,1500)
    Salary( 7,2100)



}

 fun Salary(NumberOfHours:Int , HourlyRate:Int): Int{

    var total = NumberOfHours * HourlyRate:

    println (total)

    return  total
}