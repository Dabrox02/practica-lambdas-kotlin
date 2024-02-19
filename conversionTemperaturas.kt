fun main(){
    val arrTemperatures: Array<Double> = converterTemperature(arrayOf(12.01, 32.21, 34.14, 23.01)){ 9.0 / 5.0 * it + 32 }
    for (temp in arrTemperatures){
        println("Temperature is: $temp")
    }
}

fun converterTemperature(temperatures: Array<Double>, conversionFormula: (Double) -> Double): Array<Double>{
    val arrTemperatures:MutableList<Double> = mutableListOf()

    for (temp in temperatures){
        arrTemperatures.add(conversionFormula(temp))
    }
    return  arrTemperatures.toTypedArray()
}
