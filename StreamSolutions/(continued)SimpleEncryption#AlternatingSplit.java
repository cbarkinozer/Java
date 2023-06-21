/*
!DOES NOT WORK FULLY!
Implement a pseudo-encryption algorithm which given a string S and an integer N concatenates all the odd-indexed characters of S with all the even-indexed characters of S, this process should be repeated N times.

Examples:

encrypt("012345", 1)  =>  "135024"
encrypt("012345", 2)  =>  "135024"  ->  "304152"
encrypt("012345", 3)  =>  "135024"  ->  "304152"  ->  "012345"

encrypt("01234", 1)  =>  "13024"
encrypt("01234", 2)  =>  "13024"  ->  "32104"
encrypt("01234", 3)  =>  "13024"  ->  "32104"  ->  "20314"

Together with the encryption function, you should also implement a decryption function which reverses the process.

If the string S is an empty value or the integer N is not positive, return the first argument without changes.
*/

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {
    public static String encrypt(final String text, final int n) {
        if(text == null){
          return text;
        }else if ( text.isEmpty() || n <= 0) {
            return text;
        }

        String encryptedText = text;
        for (int i = 0; i < n; i++) {
            // Extract odd-indexed characters and concatenate them
            String oddChars = IntStream.range(0, encryptedText.length())
                    .filter(j -> j % 2 == 1)
                    .mapToObj(encryptedText::charAt)
                    .map(Object::toString)
                    .collect(Collectors.joining());

            // Extract even-indexed characters and concatenate them
            String evenChars = IntStream.range(0, encryptedText.length())
                    .filter(j -> j % 2 == 0)
                    .mapToObj(encryptedText::charAt)
                    .map(Object::toString)
                    .collect(Collectors.joining());

            // Concatenate odd and even characters
            encryptedText = oddChars + evenChars;
        }

        return encryptedText;
    }

    public static String decrypt(final String encryptedText, final int n) {
        if(encryptedText == null){
          return encryptedText;
        }else if(encryptedText.isEmpty() || n <= 0) {
            return encryptedText;
        }

        String decryptedText = encryptedText;
        for (int i = 0; i < n; i++) {
            int mid = decryptedText.length() / 2;

            // Split the text into even and odd characters
            String evenChars = decryptedText.substring(0, mid);
            String oddChars = decryptedText.substring(mid);

            // Interleave even and odd characters
            decryptedText = IntStream.range(0, mid)
                    .flatMap(j -> IntStream.of(oddChars.charAt(j), evenChars.charAt(j)))
                    .mapToObj(Character::toString)
                    .collect(Collectors.joining());
        }

        return decryptedText;
    }
  }
