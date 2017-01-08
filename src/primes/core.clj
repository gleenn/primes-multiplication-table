(ns primes.core
  (:require [clojure.string :as s]
            [primes.sieve :as sieve]))
(set! *warn-on-reflection* true)

(defn is-prime? [^Long n]
  (if (= n 1)
    false
    (nil? (some #(= 0 (mod n %)) (range 2 (inc (int (Math/sqrt n))))))))

(defn n-primes [^Long n]
  (take n (filter is-prime? (iterate inc 1))))

(defn prime-multiplication-table [^Long n]
  (let [primes (n-primes n)]
    (for [y primes]
      (for [x primes]
        (* x y)))))

(defn num-digits [^Long num]
  (int (inc (Math/log10 num))))

(defn primes-table->string [table]
  (let [last-num (last (last table))
        formatting-string (str "%" (num-digits last-num) "d")]
    (->> table
         (map (fn [row] (s/join " " (map #(format formatting-string %) row))))
         (s/join "\n"))
    ))

(defn -main [& args]
  (println (primes-table->string (prime-multiplication-table (Integer/parseInt (or (first args) "10"))))))
