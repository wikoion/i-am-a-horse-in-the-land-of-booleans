(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  ":("
  (if (= x nil)
    false
    (if (false? x)
      false
      true)))

(defn abs [x]
  ":("
  (if (> x 0)
    x
    (* x -1)))

(defn divides? [divisor n]
  ":("
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  ":("
  (cond 
    (= (mod n 15) 0) "gotcha!"
    (= (mod n 3) 0) "fizz"
    (= (mod n 5) 0) "buzz"
    :else ""))

(defn teen? [age]
  ":("
  (if (> age 12)
    (if (< age 20)
      true
      false)
    false))

(defn not-teen? [age]
  ":("
  (if (true? (teen? age))
    false
    true))

(defn generic-doublificate [x]
  ":("
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x) (vector? x)) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  ":("
  (cond
    (= (mod year 100) 0)
      (if (= (mod year 400) 0)
        true
        false)
      (= (mod year 4) 0) true
      :else false))

; '_______'
