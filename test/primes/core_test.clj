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
