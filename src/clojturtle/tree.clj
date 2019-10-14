(ns clojturtle.tree
  (:require [clojure.set :as set]
            [clojure-turtle.core :refer :all]))

(defn leaf []
  (let [size (rand-int 3)
        angle (get @(right 0) :angle)]
    (do (repeat 10 (all (forward size) (right 8)))
        (right 100)
        (repeat 10 (all (forward size) (right 8)))
        (right 135)
        (forward (* 5 size))
        (back (* 5 size))
        (setheading angle))))

(defn tree [tcolor minl length leafy?]
  (let [r (first tcolor)
        g (second tcolor)
        b (last tcolor)]
    (color tcolor)
    (if (< length minl)
      (do
        (wait 10)
        (forward length)
        (when leafy? (leaf))
        (back length))
      (do (forward length)
          (left 25)
          (tree [(+ 40 r) g (- b 10)] minl (* length 0.8) leafy?)
          (right 75)
          (tree [r (+ g 10) b] minl (* length 0.5) leafy?)
          (left 50)
          (back length)))))
