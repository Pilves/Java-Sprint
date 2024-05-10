# Cypher Tool

## Overview
The Cypher Tool is a command-line application written in Java that allows users to encrypt and decrypt messages using various encryption techniques. This tool is designed to help users understand the basics of encryption algorithms and gain experience in developing interactive command-line programs.

## Learning Objectives
- **Problem-Solving Skills:** Design a command-line program to perform encryption and decryption, handling various scenarios and user inputs logically.
- **User Input Validation:** Ensure the program can handle unexpected user behavior by validating inputs.
- **Algorithm Implementation:** Translate simple encryption algorithms like ROT13 and message reversal into code.
- **Interactive Command-Line Interface:** Prompt users for input, provide options, and present results effectively.
- **Collaboration:** Work with team members to discuss program structure, define responsibilities, and integrate contributions into a cohesive solution.

## Features
- **User-Friendly Interface:** Greet users and guide them through selecting operations and encryption types.
- **Input Validation:** Continuously prompt users for valid input, trimming unnecessary whitespaces.
- **Support for Multiple Encryptions:** Implement ROT13, message reversal, and one additional encryption of your choice.
- **Non-Alphabet Character Handling:** Ensure non-alphabet characters remain unchanged during encryption and decryption.

## Usage
To run the Cypher Tool, use the following command:

```sh
$ java CypherTool
```
## Example Usage

```sh
Welcome to the Cypher Tool!

Select operation (1/2):
1. Encrypt.
2. Decrypt.
2

Select cypher (1/3):
1. ROT13.
2. Reverse.
3. Custom.
2

Enter the message:
zb

Decrypted message using reverse:
ay
```
## Cyphers Explained
- **ROT13:** ROT13 is a simple substitution cipher used in cryptography. Each letter in the message is replaced by the letter that is 13 positions ahead in the alphabet. For example, 'A' becomes 'N', 'B' becomes 'O', and so on. This cipher is symmetrical, meaning that applying it twice will return the original message.


- **Reverse:** The reverse cipher involves reversing the order of letters in the message while keeping non-alphabet characters unchanged. For example, the message "hello!" would become "olleh!".


- **Custom Cipher:** The custom cipher can be any additional encryption method of your choice. This could be a more advanced substitution cipher, a transposition cipher, or any other algorithm you wish to implement. The goal is to provide a more diverse learning experience and challenge students to understand different encryption techniques.


## Functions Overview
Below are the main functions expected to be implemented in the Java version of the Cypher Tool:
```java
// Main logic, invoking other functions
public class CypherTool {
    public static void main(String[] args) {
        // Implementation here
    }

    // Get the input data required for the operation
    public static InputData getInput() {
        // Implementation here
    }

    // Encrypt the message with ROT13
    public static String encryptRot13(String message) {
        // Implementation here
    }

    // Encrypt the message with reverse
    public static String encryptReverse(String message) {
        // Implementation here
    }

    // Decrypt the message with ROT13
    public static String decryptRot13(String message) {
        // Implementation here
    }

    // Decrypt the message with reverse
    public static String decryptReverse(String message) {
        // Implementation here
    }
}
```




