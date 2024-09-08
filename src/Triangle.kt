 open class Triangle(_name: String) : Shape(_name)  {
    var FSide = 0.0
    var SSide = 0.0
    var TSide = 0.0
    open fun setDimensions(FSide : Double , SSide : Double , TSide:Double)
    {
        this.TSide=TSide
        this.SSide=SSide
        this.FSide=FSide
    }

    override fun printDimensions() {
        println("sides= $FSide,$SSide,$TSide")}


    override fun getArea() : Double {
      val Perimeter=FSide+SSide+TSide
        val s =Perimeter/2
        return Math.sqrt(s*(s-FSide)*(s-SSide)*(s-TSide))
    }
}

