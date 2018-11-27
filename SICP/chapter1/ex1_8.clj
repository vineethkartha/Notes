
(defn sqr [x] (* x x))

(defn improve [guess x]
  (/ (+ (/ x (sqr guess)) (* 2 guess)) 3.0)
  )

(defn good-en [guess x]
  (< (Math/abs (- (sqr guess) (sqr (improve guess x)))) 0.001)
  )
(defn cubrt-iter [guess x]
  (if (good-en guess x)
    guess
    (cubrt-iter (improve guess x) x)
    )
  )

(defn cubrt [x]
  (cubrt-iter 1.0 x)
  )
