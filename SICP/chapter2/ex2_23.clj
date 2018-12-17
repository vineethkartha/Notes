(defn for-each [proc arg]
  (if (empty? arg) nil
      (do
        (proc (first arg))
        (for-each proc (rest arg))
        )
      )
  )
     
