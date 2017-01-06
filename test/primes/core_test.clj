(ns primes.core-test
  (:require [midje.sweet :refer :all]
            [primes.core :refer :all]))

(facts is-prime?
       (fact "returns true when the input is prime and false otherwise"
             (is-prime? 1) => falsey
             (is-prime? 2) => truthy
             (is-prime? 3) => truthy
             (is-prime? 4) => falsey
             (is-prime? 5) => truthy
             (is-prime? 6) => falsey
             (is-prime? 7) => truthy
             (is-prime? 8) => falsey
             (is-prime? 9) => falsey
             (is-prime? 10) => falsey
             (is-prime? 100) => falsey))

(facts n-primes
       (fact "returns n number of primes"
             (n-primes 1) => [2]
             (n-primes 2) => [2 3]
             (n-primes 10) => [2 3 5 7 11 13 17 19 23 29]))

(facts prime-multiplication-table
       (fact "returns a multiplication table of primes"
             (prime-multiplication-table 1) => [[4]]
             (prime-multiplication-table 2) => [[4 6]
                                                [6 9]]
             (prime-multiplication-table 3) => [[4 6 10]
                                                [6 9 15]
                                                [10 15 25]]
             (prime-multiplication-table 10) => [[4 6 10 14 22 26 34 38 46 58]
                                                 [6 9 15 21 33 39 51 57 69 87]
                                                 [10 15 25 35 55 65 85 95 115 145]
                                                 [14 21 35 49 77 91 119 133 161 203]
                                                 [22 33 55 77 121 143 187 209 253 319]
                                                 [26 39 65 91 143 169 221 247 299 377]
                                                 [34 51 85 119 187 221 289 323 391 493]
                                                 [38 57 95 133 209 247 323 361 437 551]
                                                 [46 69 115 161 253 299 391 437 529 667]
                                                 [58 87 145 203 319 377 493 551 667 841]]))

(facts num-digits
       (fact "returns the number of digits in decimal format"
             (num-digits 1) => 1
             (num-digits 9) => 1
             (num-digits 10) => 2
             (num-digits 99) => 2
             (num-digits 100) => 3
             (num-digits 999) => 3))

(facts primes-table->string
       (fact "returns a string formatted as a table"
             (primes-table->string (prime-multiplication-table 1)) => "4"
             (primes-table->string (prime-multiplication-table 2)) => "4 6\n6 9"
             (primes-table->string (prime-multiplication-table 3)) => " 4  6 10\n 6  9 15\n10 15 25"
             ))
