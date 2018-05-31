(ns playground.app.core
  (:require [reagent.core :as r]))

(enable-console-print!)

(defn hello-world []
  [:h1 "Hello cider"])

(r/render [hello-world] (.getElementById js/document "app"))
