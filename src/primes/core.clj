(ns primes.core)

(defn is-prime? [n]
  (if (= n 1)
    false
    (nil? (some #(= 0 (mod n %)) (range 2 (int (inc (Math/sqrt n))))))))
