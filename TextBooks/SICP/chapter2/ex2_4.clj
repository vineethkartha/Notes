(defn cons [x y]
      (fn [m] (m x y))
)

(defn car [z]
      (z (fn [p q] p))
)

(defn cdr [z]
      (z (fn [p q] q))
)


;;Here cons is function that takes 2 arguments and returns a function that operates on the 2 args passed
;;car takes a 2 argument function z which returns the first argument.
;;Applying the substitution principle:
;;(car (cons 1 2))
;;(car ((fn [m] (m x y)) 1 2))
;;((fn [m] (m 1 2)) (fn [p q] p))
;;((fn [p q] p) 1 2)
;;1
