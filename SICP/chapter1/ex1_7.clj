
(defn improve [guess x]
  (/ (+ guess (/ x guess)) 2)
  )

(defn good-en [guess x]
  (< (Math/abs (- (* guess guess) (* (improve guess x) (improve guess x)))) 0.001)
  )
(defn sqrt-iter [guess x]
  (if (good-en guess x)
    guess
    (sqrt-iter (improve guess x) x)
    )
  )

(defn sqrt [x]
  (sqrt-iter 1.0 x)
  )
