(ns clojturtle.core
  (:require [clojure.set :as set]
            [clojure-turtle.core :refer :all]))

(setxy 100 -200)

(defn tree [tcolor minl length]
  (let [r (first tcolor)
        g (second tcolor)
        b (last tcolor)]
  (color tcolor)
  (if (< length minl)
    (do (forward length)
        (back length))
    (do (forward length)
        (left 25)
        (tree [(+ 40 r) g (- b 10)] minl (* length 0.8))
        (right 75)
        (tree [r (+ g 10) b] minl (* length 0.5))
        (left 50)
        (back length)))))

(defn -main []
  (new-window {:size [920 900]})
  (tree [0 0 255] 5 200))