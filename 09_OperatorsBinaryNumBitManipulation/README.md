# Operators 
-  Symbol that tells compiler to perform some operation.

## Arithmetic operators :

1. **Binary** 
  - +,-,*,/,%

2. **Unary** 
  - ++ , --
    - **increment operator** : ++
      - Pre increment = ++a
      - Post increment = a++
    - **Decremental operator** : --
      - Pre decrement = --a
      - Post decrement = a++

## Relational Operators :
- (Output : Boolean value)
- == , != , > , < , >= , <=

## Logical Operators :
- && - logical And 
- || - logical OR
- ! - logical Not

## Binary number System - Base 2

## Bitwise operators :

- & - Binary AND
- | - Binary OR
- ^ - Binary XOR
- ~ - Binary One's Complement
- << - Binary LEFT SHIFT
- >> - Binary RIGHT SHIFT

## Assignment Operators :
- = , += , -= , *= , /=

-----------------------------------------------------

# BIT Manipulation 
1. Get 
2. Set 
3. Clear 
4. Update 

**NOTE** : Here we calculate positions from **right to left.**

### Get Bit :
EX.
- Get 3rd bit (Position = 2) of a number n. (n = 0101)
Process : 
  - 1 . Bit mask = **1 << i** 
    - Where i = position
  - 2 . Operation = AND **&**

### Set Bit 
EX. 
Process : 
- Bit mask = 1 << i
- Operation = bitmask (| OR) N

### Clear Bit 
Process :
- Bit mask = 1 << i
- not bit mask = ~bitmask
- operation = notBitMask & N

### Update Bit 
Process :
- For "0"
  - use clear Bit logic
- For "1"
  - use set bit logic

----------------------------------------------------------------
### Problems : 
1. Write a program to find if a number is a power of 2 or not.
2. Write a program to toggle a bit a position = “pos” in a number “n”.
3. Write a program to count the number of 1’s in a binary representation of the number.
4. Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]




