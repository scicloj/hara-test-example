(ns hara-test-example.core-test
  (:require [hara.test :refer :all]
            [hara-test-example.core :refer :all]))


^{:refer hara-test-example.core/foo :added "0.1"}
(fact "Foo doesn't do a lot."
      (foo 3) => [:x 3])

^{:refer hara-test-example.core/bar :added "0.1"}
(fact "Bar doesn't do a lot."
      (bar 3) => [:y 3])

^{:refer hara-test-example.core/baz :added "0.1"}
(fact "TODO")
