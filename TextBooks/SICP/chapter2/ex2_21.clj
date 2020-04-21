(defn square-list1 [lst]
  (if (empty? lst)
    nil
    (cons (* (first lst) (first lst))
          (square-list1 (rest lst))
    )
  )
)

(defn square-list [lst]
  (map (fn [x] (* x x)) lst)
)
