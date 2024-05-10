# 🚀 Cypher Tool

## 🌟 Overview

Presenting the Cypher Tool, a state-of-the-art command-line interface (CLI) application, meticulously crafted for encrypting 🛡️ and decrypting 🔓 messages. Adopting this tool within enables a selection from a robust suite of encryption methodologies, assuring the integrity and security of your communications.

## 🎮 Usage

Initiate a secure encryption process with the following steps:

1. Activate the application within your command-line interface.
2. Receive a warm welcome from Cypher Tool, and make your selection: `1` for encryption or `2` for decryption.
3. Determine your cipher of choice: opt for `1` for Rot13, `2` for Reverse, or `3` for Base64.
4. Enter the message you desire to secure 📝.
5. Press enter and witness the immediate delivery of your encrypted or decrypted message, directly in the command line.

Example sessions:

```bash
Welcome to the Cypher Tool!
Select operation (1: Encrypt, 2: Decrypt):
1
Select cipher (1: Rot13, 2: Reverse, 3: Base64):
1
Enter your message:
Confidential Data
Result: Pbasvqragvny Qngn
```
```bash
Welcome to the Cypher Tool!
Select operation (1: Encrypt, 2: Decrypt):
1
Select cipher (1: Rot13, 2: Reverse 3: Base64):
2
Enter your message:
Confidential Data
Result: Xlmurwvmgrzo Wzgz
```
```bash
Welcome to the Cypher Tool!
Select operation (1: Encrypt, 2: Decrypt):
1
Select cipher (1: Rot13, 2: Reverse 3: Base64):
3
Enter your message:
Confidential Data
Result: Q29uZmlkZW50aWFsIERhdGE
```
```bash
Welcome to the Cypher Tool!
Select operation (1: Encrypt, 2: Decrypt):
2
Select cipher (1: Rot13, 2: Reverse 3: Base64):
3
Enter your message:
Q29uZmlkZW50aWFsIERhdGE
Result: Confidential Data
```
## 🧩 Ciphers

The Cypher Tool suite is outfitted with a premier selection of encryption algorithms:

- **Rot13**: With a swift 13-step shift through the alphabet, this cipher redefines simplicity while maintaining high effectiveness in text transformation. 🔄
- **Reverse**: Ingeniously inverting the sequence of characters, this algorithm provides an uncomplicated, yet formidable layer of security. ↕️
- **Base64**: A refined encoding protocol that transfigures text into a distinctive radix-64 format, perfect for the secure transmission and storage of corporate data. 🔒

Your unique characters, from special symbols to emotive emojis, retain their integrity, ensuring full message fidelity. Should an entry miscue occur, Cypher Tool's intelligent input validation will guide users to a swift resolution, safeguarding continuous and efficient operation. 👍

## Technical Cipher Descriptions

Each function within the Cypher Tool suite is engineered to handle text transformations with precision and reliability:

- **Rot13**: The Rot13 function meticulously examines each character within the provided text. For alphabetic characters, it determines whether they are in lowercase or uppercase. It retains the original state of non-alphabetic characters, including punctuation and spaces. When encountering a letter, the function applies a shift of 13 positions forward in the alphabet. If this shift surpasses the 'z' or 'Z', it wraps around to continue from 'a' or 'A', respectively. For numeric characters, the function shifts each digit by 5, wrapping around at '9' to continue from '0'. The final result of this process is a string where each alphabetic and numeric character has been transformed, while all other characters remain unmodified, thereby producing the encrypted message.

- **Reverse**: The Reverse function takes each character in the string and maps it to its opposite by reversing its order in the alphabet. It maintains a distinction between uppercase and lowercase letters while preserving the original case. For instance, 'a' becomes 'z', 'b' becomes 'y', and so on, with 'A' becoming 'Z', 'B' becoming 'Y'. Numbers are similarly flipped, with '0' turning into '9', '1' into '8', etc. Unaffected by this operation are non-alphabetic and non-numeric characters, which remain unaltered.

- **Base64**: This encoding function first converts each character into its ASCII binary equivalent, forming a continuous binary stream. It then segments this stream into sets of 6 bits, each corresponding to a value between 0 and 63. Each 6-bit group is mapped to a specific character in the Base64 character set, which includes a mix of upper and lower case letters, numbers, and a couple of symbols. Upon decoding, the function reverses this process to retrieve the original ASCII characters from the encoded string.