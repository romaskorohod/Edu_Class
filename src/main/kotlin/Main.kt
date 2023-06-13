class DrumKit(var hasTopHat: Boolean, var hasSnare: Boolean) {
    fun playTopHat() {
        if (hasTopHat) println("bang bang bang")
    }
    fun playSnare() {
        if (hasSnare) println("ding ding ba-da-bing")
    }

}


fun main(args: Array<String>) {
    val d = DrumKit(true, true)
    d.playTopHat()
    d.playSnare()
    d.hasSnare = false
    d.playTopHat()
    d.playSnare()

}