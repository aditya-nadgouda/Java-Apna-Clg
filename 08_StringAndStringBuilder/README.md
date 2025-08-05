# String 

`- String name = "Aditya";
`
## Functions : 
1. for length : name.**length**();
2. to travers a string : str.**charAt**(index);
3. to compare : str1.**compareTo**(str2);
   - if S1 > S2 = returns +ve value
   - S1 == S2   = returns 0
   - S1 <  S2   = returns -ve value
   - Compare base on indexing in alphabetical order 
     - if Hello & Wello 
     - Hello < Wello
4. Substring : str.**substring**(beg index, end index);
5. string to integer : **Integer.parseInt**(str);
6. integer to string : **Integer.toString**(int);


**NOTE** : Strings are Immutable.

 ------------------------------------------------------------------------

# StringBuilder
- Mutable

`StringBuilder sb = new StringBuilder("Aditya");
`
## Functions : 
1. sb.**charAt**(i);
2. to replace char in string : sb.**setCharAt**(index,'char');
3. to insert in string : sb.**insert**(index, 'char');
4. to delete from string : sb.**delete**(start index , end index); // end index - non inclusive
5. add char at end : sb.**append**('char');
6. for size : sb.**length**();
7. to reverse : sb.**reverse**();




