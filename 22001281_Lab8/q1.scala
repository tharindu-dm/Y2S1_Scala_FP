/**
  *  The Caesar cipher is one of the earliest known and simplest ciphers. It is a type of substitution
 cipher in which each letter in the plaintext is 'shifted' a certain number of places down the
 alphabet. For example, with a shift of 1, A would be replaced by B, B would become C, and
 so on. The method is named after Julius Caesar, who apparently used it to communicate
 with his generals.
 a. Implement Encryption and Decryption functions of Caesar cipher.
 b. Then implement a Cipher function which takes Encryption and Decryption functions
 to process the data.
  */

object q1 {
  def main(args: Array[String]): Unit = {
    val encrypt = (c: Char, key: Int) => {
      if (c.isLetter) {
        val base = if (c.isUpper) 'A' else 'a'
        ((c - base + key) % 26 + base).toChar
      } else c
    }

    val decrypt = (c: Char, key: Int) => encrypt(c, 26 - key)

    val cipher = (algo: (Char, Int) => Char, text: String, key: Int) => text.map(algo(_, key))

    val text = "Hello, World!"
    val key = 5
    val encryptedText = cipher(encrypt, text, key)
    val decryptedText = cipher(decrypt, encryptedText, key)

    println(s"Original text: $text")
    println(s"Encrypted text: $encryptedText")
    println(s"Decrypted text: $decryptedText")
  }
}