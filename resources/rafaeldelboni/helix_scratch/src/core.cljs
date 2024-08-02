(ns {{top/ns}}.{{main/ns}}.core
  (:require ["react-dom/client" :as rdom]
            [helix.core :refer [$]]
            [helix.dom :as d]
            [helix.hooks :as hooks]
            [{{top/ns}}.{{main/ns}}.infra.helix :refer [defnc]]))

(defnc app []
  (let [[_state _set-state] (hooks/use-state {})]
    (d/div
     (d/h1 "{{main}}" )
     (d/h2 "{{raw-name}}")
     (d/p "{{description}}"))))

(defonce root
  (rdom/createRoot (js/document.getElementById "app")))

; start your app with your React renderer
(defn render []
  (.render root ($ app)))

(defn ^:export init []
  (render))
