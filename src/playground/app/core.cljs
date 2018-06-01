(ns playground.app.core
  (:require [reagent.core :as r]
            [rmwc :as ui]))

(enable-console-print!)

(defn hello-world []
  [:div
   [:h1 "Hello Material"]
   [:> ui/Button {:raised true} "Click me"]
   [:> ui/ChipSet
    [:> ui/Chip {:selected true} "First"]
    [:> ui/Chip
     [:> ui/ChipText "Second"]
     [:> ui/ChipIcon {:trailing true,
                      :use "close"}]]]])

(r/render [hello-world] (.getElementById js/document "app"))
