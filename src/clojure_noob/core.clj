(ns clojure-noob.core
  (:gen-class))

(defn too-enthusiastic
  "Return a cheer that might be a bit too enthusiastic"
  [name]
  (println (str "OH. MY. GOD! " name " YOU ARE MOST DEFINITELY LIKE THE BEST "
    "MAN SLASH WOMAN EVER I LOVE YOU AND WE SHOULD RUN AWAY SOMEWHERE")))

(defn error-message
  [severity]
  (println (str "OH GOD! IT'S A DISASTER! WE'RE "
    (if (= severity :mild)
       "MILDLY INCONVENIENCED!"
       "DOOOOOOOMED!"))))

(defn chooser
  [[first-choice second-choice & unimportant-choices]]
  (println (str "Your first choice is: " first-choice))
  (println (str "Your second choice is: " second-choice))
  (println (str "We're ignoring the rest of your choices. "
    "Here they are in case you need to cry over them: "
    (clojure.string/join ", " unimportant-choices))))
  
(defn announce-treasure-location
  [{lat :lat lng :lng}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng)))

(defn -main
  [& args]
  (error-message :mild)
  (too-enthusiastic :Manuel)
  (chooser ["Marmalade", "Handsome Jack", "Pigpen", "Aquaman"])
  (announce-treasure-location {:lat 28.22 :lng 81.33})

  (if (= 1 2)
    (do (println "Success!")
      "By Zeus's hammer!")
    (do (println "Failure!")
      "By Aquaman's trident!"))

  (when true
    (println "Success!")
    "abra cadabra")

  (println "I'm a little teapot!"))
