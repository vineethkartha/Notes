(defn iter-even [lst result]
  (if (empty? lst) result
  (iter-even (rest lst) (if (even? (first lst)) (cons (first lst) result) 
                            result))
))

(defn iter-odd [lst result]
  (if (empty? lst) result
  (iter-odd (rest lst) (if (odd? (first lst)) (cons (first lst) result) 
                            result))
))

(defn same-parity [p & args]
  (cond
    (even? p) (iter-even args ())
    (odd? p) (iter-odd args ())
  )
)
