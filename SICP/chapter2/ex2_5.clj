(defn pow-iter [b e p]
(if (= e 0) p
(pow-iter b (- e 1) (* b p))
))

(defn pow [b e]
(pow-iter b e 1))

(defn exp-iter [num base ex]
(if (= (rem num base) 0) (exp-iter (/ num base) base (+ ex 1))
ex
)
)


(defn exp [num base]
(exp-iter num base 0)
)

(defn cons [x y]
(* (pow 2 x) (pow 3 y))
)

(defn car [p]
(exp p 2)
)

(defn cdr [p]
(exp p 3)
)

(car (cons 1 2))
(cdr (cons 1 2))
