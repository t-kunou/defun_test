(ns defun-test.core)
(require '[defun.core :refer [defun]])

(defun fizz-buzz
  ([(N :guard #(= 0 (rem % 15)))] "fizzbuzz")
  ([(N :guard #(= 0 (rem % 5)))] "buzz")
  ([(N :guard #(= 0 (rem % 3)))] "fizz")
  ([_] ""))

(defn bind-fizz-buzz
  [array] (sort (zipmap array (map fizz-buzz array))))

(defn fizz-buzz-to 
  [num] (bind-fizz-buzz (range 1 num)))

