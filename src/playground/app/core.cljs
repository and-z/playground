(ns playground.app.core
  (:require [reagent.core :as r]
            [rmwc :as ui]))

(enable-console-print!)

(defn hello-world []
  (let [open? (r/atom false)]
    (fn hello-world* []
      [:div
       [:> ui/Typography {:use "headline1"
                          :tag "h1"} "React Material Web Components Demo"]

       [:> ui/Typography {:use "headline2"
                          :tag "h2"} "Controls"]

       [:> ui/Button {:raised true
                      :on-click #(reset! open? true)} "Click me"]

       [:> ui/ChipSet
        [:> ui/Chip {:selected true} "First"]
        [:> ui/Chip
         [:> ui/ChipText "Second"]
         [:> ui/ChipIcon {:trailing true,
                          :use "close"}]]]

       [:> ui/Typography {:use "headline2" :tag "h2"} "List"]

       [:> ui/List
        [:> ui/ListItem
         [:> ui/ListItemGraphic "star_border"]
         [:> ui/ListItemText "Star"]
         [:> ui/ListItemMeta "info"]]
        [:> ui/SimpleListItem {:graphic "mood"
                               :text "Laune"
                               :secondaryText "Gute Laune"}]]

       [:> ui/Snackbar {:show @open?
                        :on-hide #(reset! open? false)
                        :message "System notification"
                        :action-handler identity
                        :action-text "Got It"}]

       [:> ui/SimpleDialog {:title "Hallo",
                            :open false #_@open?
                            :on-close #(reset! open? false)}
        [:div
         [:h1 "Hallo, wie geht's?"]
         [:> ui/Checkbox "Gut"][:> ui/Checkbox "Schlecht"]]]])))

(r/render [hello-world] (.getElementById js/document "app"))
