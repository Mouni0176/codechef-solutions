# VALIDANAGRAM

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Valid Anagram

You are given two strings $s$ and $t$. Your task is to determine whether $t$ is an  **anagram**  of $s$.

An anagram is a word formed by rearranging the letters of another word, using  **all the original letters exactly the number of times it is used**.

## Function Declaration
### Function Name

$isAnagram$ – This function checks whether one string is an anagram of another string.

### Parameters
- $s$ : A string representing the original word.
- $t$ : A string to be checked as an anagram of $s$.
### Return Value
- Returns $true$ if $t$ is an anagram of $s$.
- Returns $false$ otherwise.
### Constraints
- $1 \leq |s|, |t| \leq 5 \times 10^4$
- Both $s$ and $t$ consist of lowercase English letters ($a – z$).
### Input Format
- The first line contains a single string $s$.
- The second line contains a single string $t$.
### Output Format
- Print $YES$ if $t$ is an anagram of $s$.
- Print $NO$ otherwise.
### Sample 1:
Input
Output

```
listen
silent

```

```
YES

```

### Explanation:

`"silent"` is an anagram of `"listen"`.

### Sample 2:
Input
Output

```
hello
world

```

```
No

```

### Explanation:

`"world"` cannot be rearranged to form `"hello"`.

### Sample 3:
Input
Output

```
aab
baa
```

```
YES
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T16:04:51.269Z  

```java
public static boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()){
        return false;
    }
    
    int []arr = new int[26];
    for(int i=0;i<s.length();i++){
        arr[s.charAt(i)-'a']++;
        arr[t.charAt(i)-'a']--;
        }
    for(int count:arr){
        if(count!=0){
            return false;
        }
    }
    return true;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/VALIDANAGRAM)