(defproject build-tools "0.1.0-SNAPSHOT"
  :description "Project description"
  :url "project-url"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.11.0"]]
  :main build-tools.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
