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

(defn squarekoch [dep length]
  (if (zero? dep)
      (forward length)
      (do 
        (squarekoch (dec dep) length)
        (right 90)
        (squarekoch (dec dep) length)
        (left 90)
        (squarekoch (dec dep) length)
        (left 90)
        (squarekoch (dec dep) length)
        (right 90)
        (squarekoch (dec dep) length))))

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
  (repeat 3
    (all
      (when (> length minl) (sierpi minl (/ length 2.0)))
      (wait 10)
      (forward length)
      (right 120))))

(defn tile [dep length]
  (if (zero? dep)
    (forward length)
    (do
      (tile (dec dep) length)
      (tile (dec dep) length)
      (right 90)
      (tile (dec dep) length)
      (left 90)
      (tile (dec dep) length)
      (right 90)
      (tile (dec dep) length)
      (right 90)
      (tile (dec dep) length)
      (tile (dec dep) length)      
      ))
  )

(defn rings [dep length]
  (if (zero? dep)
    (forward length)
    (do
      (rings (dec dep) length)
      (rings (dec dep) length)
      (right 90)
      (rings (dec dep) length)
      (right 90)
      (rings (dec dep) length)
      (right 90)
      (rings (dec dep) length)
      (right 90)
      (rings (dec dep) length)
      (right 90)
      (rings (dec dep) length)
      (left 90)
      (rings (dec dep) length))))

(defn terdragon [dep length tcolor]
  (let [r (first tcolor)
        g (second tcolor)
        b (last tcolor)]
    (color tcolor)
    (if (zero? dep)
      (forward length)
      (do 
        (terdragon (dec dep) length [(+ 20 r) g (/ b dep)])
        (left 120)
        (terdragon (dec dep) length [r (+ g 40) b])
        (right 120)
        (terdragon (dec dep) length [r (+ 60 g) (+ 60 b)])
        ))))

(defn pentaplex [dep length]
  (if (zero? dep)
    (forward length)
    (do
      (pentaplex (dec dep) length)
      (right 36)
      (right 36)
      (pentaplex (dec dep) length)
      (right 36)
      (right 36)
      (pentaplex (dec dep) length)
      (right 180)
      (pentaplex (dec dep) length)
      (left 36)
      (pentaplex (dec dep) length)
      (right 36)
      (right 36)
      (pentaplex (dec dep) length)      
      )))


(declare dragon2)

(defn dragon [dep length]
  (if (zero? dep)
       (forward length)
       (do
         (dragon (dec dep) length)
         (right 90)
         (dragon2 (dec dep) length)
         (forward length)
         (right 90)
         )))

(defn dragon2 [dep length]
  (if (zero? dep)
    (forward length)
    (do 
      (left 90)
      (forward length)
      (dragon (dec dep) length)
      (left 90)
      (dragon2 (dec dep) length))))

      

(defn -main []
  (new-window {:size [920 900]})
  (setxy 100 -200)
  (tree/tree [50 50 255] 5 200 true)
  (clean)
  (setxy -100 -200)
  (spiral 5 60 300))

