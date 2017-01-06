(defproject primes "0.0.1-SNAPSHOT"
  :description "Prints out a multiplication table of the first 10 primes"
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main primes.core
  :profiles {:dev   {:dependencies [[midje "1.7.0"]]}
             :midje {}})

  
