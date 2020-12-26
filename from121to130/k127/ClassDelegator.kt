package from121to130.k127

class ClassDelegator:Plusable
{
    override fun plus(other: Int): Int {
        println("기본 구현")
        return other
    }
}