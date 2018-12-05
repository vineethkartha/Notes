
(defn sqr [x] (* x x))
(defn cube [x] (* x x x))

(defn improve [guess x]
  (/ (+ (/ x (sqr guess)) guess guess) 3.0)
  )

(defn good-en [guess x]
  (< (Math/abs (- (cube guess) (cube (improve guess x)))) 1)
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
