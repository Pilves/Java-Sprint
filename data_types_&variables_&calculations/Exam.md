# Chess Board and Interest Calculation

The code includes functions for generating chess board positions based on color and calculating the number of years needed for an investment to grow to a target amount under a specified interest rate.

## Function Descriptions

### ChessBoard Function

#### Description
The `ChessBoard` function generates a list of chess board square positions, either black or white, based on the input parameter. The chess board is assumed to be a standard 8x8 grid.

#### Logic
- The function uses nested loops to iterate over rows (1 to 8) and columns ('a' to 'h').
- It calculates whether a square is black or white by checking if the sum of the row and the column's ASCII value is even (black) or odd (white).
- Based on the boolean input (`black`), it either returns a string of black squares or white squares.
- Each square is represented by its column letter followed by its row number, e.g., "a1", "b2".

#### Usage
- Calling `ChessBoard(true)` will return positions of all black squares.
- Calling `ChessBoard(false)` will return positions of all white squares.

### Interest Function

#### Description
The `Interest` function calculates how many years it will take for a given principal amount to grow to or exceed a target amount under a constant annual interest rate.

#### Logic
- Starts with the initial amount and iteratively applies the interest rate until the amount exceeds or equals the target amount.
- Increments a year counter each time the interest is applied.
- Returns the number of years required.
- If the initial amount is already greater than or equal to the target, returns 0.
- Caps the calculation at 99 years to prevent excessive computation.

#### Usage
- Example: `Interest(100.0, 121.0, 0.1)` calculates how many years it takes for $100 to grow to $121 at an annual interest rate of 10%.
