package from41to50.k048

fun main(args:Array<String>)
{
    val product:Product
    product = createProduct()
    //laptop 참조 변수는 스택에서 사라지지만
    //가리키던 객체는 힙에서 지워지지 않는다. => product가 참조한다
    printProductInfo(product)
    processProduct(product)
    printProductInfo(product)
    //객체 참조를 전달 -> 동일한 객체에 대해 함수를 수행
}

fun createProduct():Product
{
    val laptop = Product() //Heap 영역에 생성하여 참조를 반환 => apple
    laptop.name = "VivoBook" //laptop이 가리키는 객체의 name을 설정
    laptop.price = 890 //laptop이 가리키는 객체의 price를 설정

    return laptop
}

fun processProduct(product:Product)
{
    product.price += 10
}

fun printProductInfo(product:Product)
{
    println("Name : ${product.name}")
    println("Price : \$${product.price}")
}