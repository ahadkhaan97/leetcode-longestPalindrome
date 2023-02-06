fun main() {
    print(longestPalindrome("bb"))
}

fun longestPalindrome(s: String): Int {
    val count = IntArray(128)
    var length = 0
    for (c in s.toCharArray()) {
        if (++count[c.code] == 2) {
            length += 2
            count[c.code] = 0
        }
    }
    return if (length == s.length) length else length + 1
}