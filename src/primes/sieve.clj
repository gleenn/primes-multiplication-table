(ns primes.sieve)

(defn sieve [n]
  (let [array (boolean-array n true)]
    (do
      (aset array 0 false)
      (doseq [divisor (range 2 (inc (Math/sqrt n)))
              i (range (+ divisor divisor) (inc n) divisor)]
        (aset array (dec i) false))
      (vec array))))

(defn is-prime-with-sieve? [sieve n]
  (get sieve (dec n)))

(defn primes-up-to-with-sieve [check-up-to]
  (remove nil?
          (map-indexed #(if %2 (inc %1)) (sieve check-up-to))))

(defn n-primes-with-sieve [n]
  (loop [primes-up-to n]
    (let [primes (primes-up-to-with-sieve primes-up-to)]
      (if (> (count primes) n)
        (take n primes)
        (recur (+ primes-up-to primes-up-to))))))
