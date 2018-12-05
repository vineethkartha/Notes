(defn gcd [x,y]
  (if (zero? y)
    x
    (gcd y (mod x y))
    )
  )


(defn make-rat [x,y]
  (let [g (Math/abs (gcd x y))
        m (if (neg? y) (* -1 g) g)]
    [(/ x m) (/ y m)])
  )

(defn num [rat]
  (first rat)
  )


(defn den [rat]
  (second rat)
  )

(defn print-rat [rat]
  (print (num rat) "/" (den rat))
  )
