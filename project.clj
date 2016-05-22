(defproject idea-te-recipe "0.1.0-SNAPSHOT"
  :description "abstracting a recipe"
  :url "scutigera.com"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:main idea-te-recipe.core
                   :dependencies [[org.clojure/tools.namespace "0.2.8"]
                                  [speclj "3.1.0"]]
                   :source-paths ["dev"]}
             :test {:main idea-te-recipe.core
                    :dependencies [[org.clojars.trptcolin/blackwater "0.0.9.2"]]}
             }

  :aliases {"spec"
            ["with-profile" "+test" "spec"]
            "test"
            ["with-profile" "+test" "spec" "--tag" "~integration"]
            "test-it"
            ["with-profile" "+test" "spec" "--tag" "integration"]}
  :plugins [[speclj "3.1.0"]
            [ragtime/ragtime.lein "0.3.6"]]
  :source-paths ["src"]
  :test-paths ["spec"])
