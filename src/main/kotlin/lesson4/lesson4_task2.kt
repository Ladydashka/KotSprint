package lesson4

fun main(){
    val cargoWeightOne = 20
    val cargoVolumeOne = 80
    println("Average для груза с весом $cargoWeightOne кг и объемом $cargoVolumeOne л:${WEIGHT_MIN <= cargoWeightOne && WEIGHT_MAX >= cargoWeightOne && cargoVolumeOne < VOLUME }" )
    val cargoWeightTwo = 50
    val cargoVolumeTwo = 100
    println("Average для груза с весом $cargoWeightTwo кг и объемом $cargoVolumeTwo л:${WEIGHT_MIN <= cargoWeightTwo && WEIGHT_MAX >= cargoWeightTwo && cargoVolumeTwo < VOLUME }" )
}
const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VOLUME = 100
