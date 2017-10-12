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

(defn -main
  [& args]
  (error-message :mild)
  (too-enthusiastic :Manuel)
  
  (if (= 1 2)
    (do (println "Success!")
      "By Zeus's hammer!")
    (do (println "Failure!")
      "By Aquaman's trident!"))

  (when true
    (println "Success!")
    "abra cadabra")

  (println "I'm a little teapot!"))
