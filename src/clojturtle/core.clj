(ns clojturtle.core
  (:require [clojure.set :as set]
            [clojure-turtle.core :refer :all]
            [clojturtle.tree :as tree]))


(defn spiral [minl ang length]
  (if (< length minl)
    nil
    (do (forward length)
        (right ang)
        (wait 10)
        (spiral minl ang (- length minl))
        (left ang)
        (back length))))

(defn koch [minl length]
  (if (< length minl)
    (forward length)
    (do 
      (koch minl (/ length 3.0))
      (left 60)
      (koch minl (/ length 3.0))
      (right 120)
      (koch minl (/ length 3.0))
      (left 60)
      (koch minl (/ length 3.0)))))

(defn cline [minl length]
  (if (< length minl)
    (forward length)
    (do
      (left 90)
      (cline minl (/ length 2.0))
      (right 90)
      (cline minl (/ length 2.0))
      (cline minl (/ length 2.0))
      (right 90)
      (cline minl (/ length 2.0))
      (left 90))))

(defn sierpi [minl length]
  (doseq [x (range 3)]
    (do
      (when (> length minl) (sierpi minl (/ length 2.0)))
      (wait 10)
      (forward length)
      (right 120))))
      

(defn -main []
  (new-window {:size [920 900]})
  (setxy 100 -200)
  (tree/tree [50 50 255] 5 200 true)
  (clean)
  (setxy -100 -200)
  (spiral 5 60 300))

