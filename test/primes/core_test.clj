(ns primes.core-test
  (:require [midje.sweet :refer :all]
            [primes.core :refer :all]))

(facts "primes"
       (fact "is-prime?"
             (is-prime? 1) => false
             (is-prime? 2) => true
             (is-prime? 3) => true
             (is-prime? 4) => false
             (is-prime? 5) => true
             (is-prime? 6) => false
             (is-prime? 7) => true
             (is-prime? 8) => false
             (is-prime? 9) => false
             (is-prime? 10) => false
             (is-prime? 100) => false))
