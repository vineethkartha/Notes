(defn length [lst]
(if (empty? lst) 0
(+ 1 (length (rest lst)))
)
)

(defn last-pair [lst]
  (if (= (length lst) 1) lst
  (last-pair (rest lst))
  )
)
