(defproject playground "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.238"]
                 [reagent "0.8.1"
                  :exclusions [cljsjs/react
                               cljsjs/react-dom
                               cljsjs/react-dom-server
                               cljsjs/create-react-class]]]

  :plugins [[lein-figwheel "0.5.16"]]

  :source-paths ["src"]

  :profiles
  {:dev
   {:dependencies [[cider/piggieback "0.3.5"]
                   [figwheel-sidecar "0.5.16"]]
    :repl-options {:nrepl-middleware [cider.piggieback/wrap-cljs-repl]}}}

  :figwheel {:nrepl-port 7888}

  :cljsbuild
  {:builds
   [{:id "dev"
     :figwheel true
     :source-paths ["src"]
     :compiler {:main playground.app.core
                :asset-path "js/out"
                :output-to "resources/public/js/app.js"
                :output-dir "resources/public/js/out"
                :closure-defines {process.env/NODE_ENV "production"}
                :install-deps true
                :npm-deps {:react "16.4.0"
                           :react-dom "16.4.0"
                           :create-react-class "15.6.3"}}}]})
