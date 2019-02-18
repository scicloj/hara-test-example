(ns hara-test-example.core-test
  (:require [hara.test :refer :all]
            [hara-test-example.core :refer :all]))

(fact "Foo doesn't do a lot."
      (foo 3) => [:x 3])

