(ns lein.core
  (:gen-class))

(defn hello-there []
  (println "hello"))

(defn -main [& args]
  (println "inside main"))
