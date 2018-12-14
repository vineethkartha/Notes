;; Church's Encodings
;; In general a number is represented by howmany times a function is applied on to an argument.
;; Zero means that a given function f is not applied to the argument x
;; 1 is f(x), 2 means f(f(x)) ....

;; Here zero is a function that takes a function with one argument x and returnsx.
(def zero (fn [f] (fn [x] x)))

;; add-1 is a function that takes a n as argument and returns a function
;; that takes function f as argument and returns a function that takes x as argument
(defn add-1 [n] (fn [f]
                 (fn [x]
                   (f ((n f) x)
                      )
                   ))
  )

;; Let us expand this using substitution
(add-1 zero)

;; add-1 takes zero as argument and returns a function that takes f as its argument. This returned function returns another function that takes x as its argument.
;; In this function we apply f on to (n(f))(x) => f(n(f))(x)
;; here n is zero which is (f(x)) = x let this be f0
;; f(n(f))(x) => f(f0) =f(x)
