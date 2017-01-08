(ns primes.sieve-test
  (:require [midje.sweet :refer :all]
            [primes.sieve :refer :all]))

(facts sieve
       (fact "returns a vector of booleans - true if prime and false otherwise"
             (sieve 2) => [false true]
             (sieve 3) => [false true true]
             (sieve 4) => [false true true false]
             (sieve 5) => [false true true false true]
             (sieve 6) => [false true true false true false]
             (sieve 10) => [false true true false true false true false false false]
             (sieve 20) => [false true  true false true  false true false false false
                            true  false true false false false true false true false]))

(facts is-prime-with-sieve?
       (fact "returns true if n is prime using sieve"
             (is-prime-with-sieve? (sieve 10) 2) => true
             (is-prime-with-sieve? (sieve 10) 4) => false))

(facts primes-up-to-with-sieve
       (fact "returns primes up to n"
             (primes-up-to-with-sieve 2) => [2]
             (primes-up-to-with-sieve 3) => [2 3]
             (primes-up-to-with-sieve 5) => [2 3 5]
             (primes-up-to-with-sieve 29) => [2 3 5 7 11 13 17 19 23 29]))

(facts n-primes-with-sieve
       (fact "returns primes up to n"
             (n-primes-with-sieve 1) => [2]
             (n-primes-with-sieve 2) => [2 3]
             (n-primes-with-sieve 3) => [2 3 5]
             (n-primes-with-sieve 10) => [2 3 5 7 11 13 17 19 23 29]))
