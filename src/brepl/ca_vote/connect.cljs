(ns ca-vote.connect
  (:require [clojure.browser.repl :as repl]))

(defn ^:export start-repl []
  (repl/connect "http://localhost:9000/repl"))

