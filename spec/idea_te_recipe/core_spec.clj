(ns idea-te-recipe.core-spec
  (:require [clojure.test :refer :all]
            [idea-te-recipe.core :refer :all]
            ;;[idea-te-recipe.core :as sut]
            [speclj.core :refer :all]))

(describe "the recipe: "
  (it "cod with green olives returns a dinner"
    (should=
      ["1 tbsp. chopped flat-leaf parsely" ["Salt" ["2 lbs. cod" ["2/3 cup pitted green olives, chopped" ["2 garlic cloves, minced" "2/3 cup extra virgin olive oil"]]]]]
      (cod-with-green-olives cod olive-oil garlic green-olive parsely salt))))
