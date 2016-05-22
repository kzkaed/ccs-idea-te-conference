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
(def pan "a pan")

(defn clean [ingredient]
  ingredient)

(defn gut [ingredient]
  ingredient)

(defn cut [ingredient]
  ingredient)

(defn prepare-cod-threading [cod]
  (-> cod
    clean
    gut
    cut))

(defn prepare-cod [cod]
  (cut (gut (clean cod))))

(defn heat [ingredient]
  ingredient)

(defn cook [ingredients time]
  [time ingredients])

(defn taste [ingredients]
  ingredients)

(defn needs-salt? [taste]
  true)

(defn add-ingredient-to-preparation [ingredient preparation]
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
        taste (taste cooked-preparation)
        salt-preparation (if (needs-salt? taste)
                           (add-ingredient-to-preparation salt cooked-preparation))
        final-prepartion (add-ingredient-to-preparation parsely salt-preparation)]
final-prepartion))

(defn cod-with-green-olives [cod olive-oil garlic green-olive parsely salt]
  (let [ingredients [cod olive-oil garlic green-olive parsely salt]
        dinner (transform-ingredients-to-dinner ingredients)]
    dinner))
