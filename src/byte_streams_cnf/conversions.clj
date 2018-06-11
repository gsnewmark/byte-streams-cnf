(ns byte-streams-cnf.conversions
  (:require [byte-streams :as bs]))

(bs/def-conversion ^{:cost 1} [String String]
  [s options]
  s)
