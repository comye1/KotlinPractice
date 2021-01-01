package from181to190

/*
파일 입출력 - 자바 표준 라이브러리에 의존, 코틀린 확장 함수가 보조.
JVM에 의존성이 생긴다.
 */

import java.io.*

fun main()
{
    val file = File("./hello.txt")

    if(!file.exists())
        file.createNewFile()

    val outputStream:OutputStream = file.outputStream() //코틀린 확장 함수
    //inline fun File.outputStream():FileOutputStream
    outputStream.write(35)

    //File.writer 함수, OutputStream.writer 함수
    val osw:OutputStreamWriter = outputStream.writer()
    osw.write("파일 입출력")
    osw.close()

    val inputStream:InputStream = file.inputStream() //코틀린 확장 함수
    println(inputStream.read())

    //File.reader 함수, InputStream.reader 함수
    val isr:InputStreamReader = inputStream.reader()
    println(isr.readText())
    isr.close()
}