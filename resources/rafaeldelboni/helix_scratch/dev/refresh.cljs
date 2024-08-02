(ns {{top/ns}}.{{main/ns}}.dev.refresh
  "A place to add preloads for developer tools!"
  (:require [{{top/ns}}.{{main/ns}}.core :as app]
            [helix.experimental.refresh :as r]))

(r/inject-hook!)

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn ^:dev/after-load refresh []
  (r/refresh!))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn ^:dev/after-load clear-cache-and-render! []
  (app/render))
