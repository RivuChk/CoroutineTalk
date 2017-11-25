infix inline fun Sequence<Any>.join(delimeter:String):String {
    var retString = ""
    this.forEach {
        retString+= "$it${delimeter.trim()} "
    }
    return retString.substring(0,retString.lastIndexOf(delimeter)).trim()
}

inline fun Any.toIntOrError():Int = toString().toInt()