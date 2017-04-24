# Java If-Else
In this challenge, we test your knowledge of using _if-else_ conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

![Wikipedia](https://upload.wikimedia.org/wikipedia/commons/c/c5/If-Then-Else-diagram.svg)

Source: [Wikipedia](https://en.wikipedia.org/wiki/Conditional_(computer_programming)).
### Task
Given an integer, _n_, perform the following conditional actions:
- If _n_ is odd, print `Weird`
- If _n_ is even and in the inclusive range of 2 to 5, print `Not Weird`
- If _n_ is even and in the inclusive range of 6 to 20, print `Weird`
- If _n_ is even and greater than 20, print `Not Weird`
Complete the stub code provided in your editor to print whether or not _n_ is weird.
### Input Format
A single line containing a positive integer, _n_.
### Constraints
- 1 &#8804; _n_ &#8804; 100
### Output Format
Print `Weird` if the number is weird; otherwise, print `Not Weird`.
### Sample Input 0
```
3
```
### Sample Output 0
```
Weird
```
### Sample Input 1
```
24
```
### Sample Output 1
```
Not Weird
```
### Explanation
_Sample Case 0: n = 3_

_n_ is odd and odd numbers are weird, so we print `Weird`.

_Sample Case 1: n = 24_

_n_ &#062; 20 and _n_ is even, so it isn't weird. Thus, we print `Not Weird`.
