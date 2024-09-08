fun main() {
    val circle : Shape =Circle("circle")
    val square : Shape = Square("square")
    val triangle : Shape = Triangle("triangle")
    val equilateralTriangle : Shape = EquilateralTriangle("equilateralTriangle")

       println("Enter the dimensions of the square (length , height) : ")
    (square as Square).setDimensions(readLine()!!.toDouble() , readLine()!!.toDouble())

       println("Enter the dimensions of the circle (radius) : ")
    (circle as Circle).setDimensions(readLine()!!.toDouble())

    println("Enter the dimensions of the Triangle (side1,side2,side3) : ")
    (triangle as Triangle).setDimensions(readLine()!!.toDouble(),readLine()!!.toDouble(),readLine()!!.toDouble())


    print("Enter the dimensions of the EquilateralTriangle (side1,side2,side3) : ")
    (equilateralTriangle as EquilateralTriangle).setDimensions(readLine()!!.toDouble())


    val shapes: List<Shape> = listOf(square, circle, triangle, equilateralTriangle)
    for (shape in shapes) {
        println("\nShape: ${shape.name}")
        print("dimensions: ")
       shape.printDimensions()
        print("Area: ${shape.getArea()}")
        println("\n")
    }

}