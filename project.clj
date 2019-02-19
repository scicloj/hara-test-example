(defproject hara-test-example "0.1.0-SNAPSHOT"
  :description "A minimal example of using hara.test"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :profiles {:dev {:dependencies [[hara/test "3.0.5"]
                                  [hara/code "3.0.5"]
                                  [hara/tool "3.0.5"]]}}
  :injections [(require 'hara.tool)]
  :repl-options {:init-ns hara-test-example.core})
