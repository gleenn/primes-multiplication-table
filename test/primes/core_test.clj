(ns primes.core-test
  (:require [midje.sweet :refer :all]
            [primes.core :refer :all]))

(facts "primes"
       (fact "is-prime?"
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
