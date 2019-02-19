(ns hara-test-example.core)

(defn foo
  [x]
  [:x x])

(defn bar
  [y]
  [:y y])

(defn baz
  [z]
  [:z z])


(comment

  ;; generate test scaffolding
  
  (./scaffold)

  ;; go to tests and write tests
  
  (./import)

  ;; to get rid of docstrings
  
  (./purge)

  ;; to report functions with incomplete tests

  (./incomplete)

)
