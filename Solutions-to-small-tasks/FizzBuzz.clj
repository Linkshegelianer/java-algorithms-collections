(doseq [i (range 1 50)]
  (cond 
        (zero? (mod i 15)) (println "FizzBuzz")
        (zero? (mod i 3)) (println "Fizz")
        (zero? (mod i 5)) (println "Buzz")
        :else (println i)))
