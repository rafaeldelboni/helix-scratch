(ns {{top/ns}}.{{main/ns}}.dev.core
  (:require [{{top/ns}}.{{main/ns}}.core :as app]))

(def debug? ^boolean goog.DEBUG)

(defn dev-setup []
  (when debug?
    (enable-console-print!)
    (println "dev mode")))

(defn ^:export init []
  (dev-setup)
  (app/init))
