package from181to190

/*
FileTreeWalk 클래스 - 디렉토리 순회하기
 */

import java.io.File

fun main()
{
    //File.walk로 생성시 FileWalkDirection은 TOP_DOWN of BOTTOM_UP(기본값 TOP_DOWN)
    //maxDepth는 하위 탐색 최대 깊이
   val fileTree:FileTreeWalk = File("./").walk()
        .maxDepth(3)
        .onEnter { file-> //새로운 디렉토리 방문할 때
            println("새 디렉토리 방문 : ${file.name}")
            true
        }

    for (file in fileTree)
        println(file.name)
}