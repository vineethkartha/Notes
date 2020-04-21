(defn make-point [x,y]
  [x y])

(defn xP [point]
  (first point)
  )
(defn yP [point]
  (second point)
  )


(defn make-segment [start end]
  [start end]
  )
(defn start-segment [segment]
  (first segment)
  )

(defn end-segment [segment]
  (second segment)
  )

(defn mid-point [segment]
  (let [endP (end-segment segment)
        startP (start-segment segment)]
    
    [(/ (- (xP endP) (xP startP)) 2) (/ (- (yP endP) (yP startP)) 2)]
    )
  )

(defn print-point [point]
  (print "("(xP point)","(yP point)")")
  )
