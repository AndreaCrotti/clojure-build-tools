(ns build-tools.core
  (:require
   [clj-java-decompiler.core :as cj])
  (:gen-class))

(defn hello-there []
  (println "hello"))

(defn -main [& args]
  (println "inside main"))

(comment
  (cj/decompile
   '(fn [v] (prinltn v)))

  (cj/disassemble
   '(fn [v] (prinltn v))))
