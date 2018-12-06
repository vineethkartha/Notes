;; Utilities to create points
(defn make-point [x,y]
  [x y])

(defn xP [point]
  (first point)
  )
(defn yP [point]
  (second point)
  )

(defn print-point [point]
  (print "("(xP point)","(yP point)")")
  )

;; Rectangle utilities
(defn make-rectangle [topL, length, breadth]
  [topL [len breadth]]
  )

(defn get-length [rectangle]
  (first (second rectangle))
  )

(defn get-breadth [rectangle]
  (second (second rectangle))
  )

(defn perimeter [rectangle]
  (* 2 (+ (get-length rectangle) (get-breadth rectangle)))
  )

(defn area [rectangle]
  (* (get-length rectangle) (get-breadth rectangle))
  )

