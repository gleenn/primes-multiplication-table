(ns primes.core
  (:require [clojure.string :as s]))

(defn is-prime? [n]
  (if (= n 1)
    false
    (nil? (some #(= 0 (mod n %)) (range 2 (int (inc (Math/sqrt n))))))))

(defn n-primes [n]
  (take n (filter is-prime? (iterate inc 1))))

(defn prime-multiplication-table [n]
  (let [primes (n-primes n)]
    (for [y primes]
      (for [x primes]
        (* x y)))))

(defn primes-table->string [table]
  (let [last-num (last (last table))
        num-digits (int (Math/ceil (float (/ (Math/log last-num) (Math/log 10)))))
        max-width (max 1 num-digits)
        formatting-string (str "%" max-width "d")]
    (s/join "\n" (map
                   (fn [row]
                     (s/join " " (map
                                   (fn [val] (format formatting-string val))
                                   row))
                     )
                   table))
    ))

(defn -main [& args]
  (println (primes-table->string (prime-multiplication-table 10))))
