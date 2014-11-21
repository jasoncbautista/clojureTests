(ns simpleapp2.core
  (:gen-class))




(defn multiArr
  ([] (println "jason"))

  ([lastName] (println "Jason" lastName))

  ([lastName & more] (println "Jason")  (apply multiArr more) )
)
(defn print10

  "some ismple fxn to print 10"

  []
  (println 10)

)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
