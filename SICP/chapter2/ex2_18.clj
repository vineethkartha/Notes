(defn reverse-helper [lst lst1]
(if (empty? lst) lst1
(reverse-helper (rest lst) (cons (first lst) lst1))
)
)
(defn reverse [lst]
(reverse-helper lst ()))
