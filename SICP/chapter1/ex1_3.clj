(defn sum [ x y] (+ x y))
(defn sum-of-squares [x y] (sum (sq x) (sq y)))
(defn largs2 [a b c] (cond
                       (and (>= a c)(>= b c)) (sum-of-squares a b)
                       (and (>= b a)(>= c a)) (sum-of-squares b c)
                       (and (>= a b)(>= c b)) (sum-of-squares a c)
                       )
  )
