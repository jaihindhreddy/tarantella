(defproject tarantella "1.0.0-SNAPSHOT"
  :description "A Clojure implementation of Knuth's Dancing Links algorithm"
  :url "http://github.com/Engelberg/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [better-cond "1.0.1"]] 
  :profiles {:dev {:dependencies [[org.clojure/test.check "0.9.0"]]}}
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :source-paths ["src/clj"]
  :java-source-paths ["src/java"])
