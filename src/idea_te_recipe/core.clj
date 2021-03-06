(ns idea-te-recipe.core)

;; COD WITH GREEN OLIVES - CALABRIA
;; 2 lbs. cod
;; 2/3 cup extra virgin olive oil
;; 2 garlic cloves, minced
;; 2/3 cup pitted green olives, chopped
;; 1 tbsp. chopped flat-leaf parsely
;; Salt

;; (Clean [and] gut the cod) and cut it in somewhat thick slices. *
;; In a pan, heat the olive oil and cook the garlic, then add the olives and cook for 10 minutes *
;; Add the fish, and when they are nearly cooked through, taste for salt and springle with parsely.
;; Serve immediately

(def cod "2 lbs. cod")
(def olive-oil "2/3 cup extra virgin olive oil")
(def garlic "2 garlic cloves, minced")
(def green-olive "2/3 cup pitted green olives, chopped")
(def parsely "1 tbsp. chopped flat-leaf parsely")
(def salt "Salt")
;; optional part of algorithm How could this element be added?
(def pan "a pan")

;;Questions - Next Steps
;; What other data-structures could be used to represent this abstraction

;; Can you write an algorithm that gives a result
;; that adjusts the recipe, given an amount of cod or other ingedients?
;; Input : amount of cod
;; Output : pretty print of recipe adjusted

(defn- clean [ingredient]
  ingredient)

(defn- gut [ingredient]
  ingredient)

(defn- cut [ingredient]
  ingredient)

(defn- prepare-cod-threading [cod]
  (-> cod
    clean
    gut
    cut))

(defn- prepare-cod [cod]
  (cut (gut (clean cod))))

(defn- heat [ingredient]
  ingredient)

(defn- cook [ingredients time]
  [ingredients time])

(defn- taste [ingredients]
  ingredients)

(defn- needs-salt? [taste]
  true)

(defn- add-ingredient-to-preparation [ingredient preparation]
    [ingredient preparation])

(defn- transform-ingredients-to-dinner [ingredients]
  (let [cod (get ingredients 0)
        olive-oil (get ingredients 1)
        garlic (get ingredients 2)
        green-olive (get ingredients 3)
        parsely (get ingredients 4)
        salt (get ingredients 5)
        prepared-cod (prepare-cod cod)
        cooked-preparation (cook prepared-cod
                             (cook green-olive
                               (cook garlic
                                 (heat olive-oil))))
        tasted-preparation (if (needs-salt? (taste cooked-preparation))
                             (add-ingredient-to-preparation salt cooked-preparation)
                             cooked-preparation)
        final-preparation (add-ingredient-to-preparation parsely tasted-preparation)]
    final-preparation))

(defn cod-with-green-olives [cod olive-oil garlic green-olive parsely salt]
  (let [ingredients [cod olive-oil garlic green-olive parsely salt]
        dinner (transform-ingredients-to-dinner ingredients)]
    dinner))

(defn -main [& args]
  (println
    (cod-with-green-olives
      cod olive-oil garlic green-olive parsely salt)))
