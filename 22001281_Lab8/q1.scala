/**
  *  The Caesar cipher 
  */

object q1 {
  def main(args: Array[String]): Unit = {

    val encrypt: (Char, Int) => Char = (c, key) => {
      if (c.isLetter) 
      { // Check if the character is a letter
        val base = if (c.isUpper) 'A' else 'a' // Determine base (A or a)
        val shift = (c - base + key) % 26 

        val normalizedOffset = if (shift < 0) shift + 26 else shift // Adjust if negative
        (normalizedOffset + base).toChar // Convert to character
      } else c // Non-letter characters remain unchanged
    }

    val decrypt = (c: Char, key: Int) => encrypt(c, 26 - key) //reversed of encrypt

    val cipher = (algo: (Char, Int) => Char, text: String, key: Int) => text.map(algo(_, key))

    val text = "The Quick Brown Fox Jumps Over The Lazy Dog."

    val key = 5           //tell how many places to shift towards right (positive) or left (negative)
    val encryptedText = cipher(encrypt, text, key)

    val decryptedText = cipher(decrypt, encryptedText, key)

    println(s"\nOriginal text: $text\n")
    println(s"Encrypted text: $encryptedText")
    println(s"Decrypted text: $decryptedText\n")
  }
}